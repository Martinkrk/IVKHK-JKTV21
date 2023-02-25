/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.Scanner;
import myclasses.Author;
import myclasses.Book;

/**
 *
 * @author pupil
 */
public class Tools {
    Scanner scn = new Scanner(System.in);
    
    public Author[] createAuthors(){
        
        System.out.println("How many authors?");
        int authorsNum = scn.nextInt();
        scn.nextLine();
        
        Author[] authors = new Author[authorsNum];
        
        for(int j=0; j < authorsNum; j++){
            System.out.printf("Author %d. Enter first name%n", j+1);
            String first = scn.nextLine();
            System.out.printf("Author %d. Enter last name%n", j+1);
            String last = scn.nextLine();
            
            authors[j] = new Author();
            authors[j].setFirstName(first);
            authors[j].setLastName(last);
        }
        
        return authors;
    }
    public Book createBook(int i){
        Book book = new Book();
        System.out.println("Title of the book: ");
        book.setId(i+1);
        book.setTitle(scn.nextLine());
        book.setAuthors(createAuthors());
        return book;
    }
}