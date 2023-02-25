package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MyServlet", urlPatterns = {"/MyServlet", "/page1", "/page2", "/notpage3", "/pageJsp1", "/pageJsp2"})
public class MyServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        switch(request.getServletPath()) {
            case "/page1":
                request.getRequestDispatcher("/WEB-INF/page1.html").forward(request, response);
                break;
            case "/page2":
                request.getRequestDispatcher("/page2.html").forward(request, response);
                break;
            case "/pageJsp1":
                request.getRequestDispatcher("/pageJsp1.jsp").forward(request, response);
                break;
            case "/pageJsp2":
                request.setAttribute("info", "Back to main");
                request.getRequestDispatcher("/pageJsp2.jsp").forward(request, response);
                break;
            case "/notpage3":
                request.getRequestDispatcher("/WEB-INF/page3.html").forward(request, response);
                break;
            case "/MyServlet":
                try (PrintWriter out = response.getWriter()) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet MyServlet</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Servlet MyServlet at " + request.getContextPath() + "</h1>");
                out.println("<h1>Pattern is " + request.getServletPath()+ "</h1>");
                out.println("<h1>Query name is " + request.getQueryString()+ "</h1>");
                out.println("</body>");
                out.println("</html>");
            }
                break;
                default:
                    throw new AssertionError();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
