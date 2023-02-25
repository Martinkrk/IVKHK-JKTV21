package manager;

import entity.Customer;
import entity.Product;
import entity.Purchase;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import manager.interfaces.SaveManagerInterface;

public class DatabaseManager implements SaveManagerInterface{
    private EntityManagerFactory emf;
    private EntityManager em;

    public DatabaseManager() {
        emf = Persistence.createEntityManagerFactory("myGroceryStorePU");
        em = emf.createEntityManager();
    }
    
    @Override
   public void saveCustomers(List<Customer> customers) {
       em.getTransaction().begin();
       for (int i = 0; i < customers.size(); i++) {
           Customer customer = customers.get(i);
           if(customer.getId() == null){
                em.persist(customer);
            }else{
                em.merge(customer);
            }
       }
       em.getTransaction().commit();
   }
   
    @Override
   public List<Customer> loadCustomers() {
       return em.createQuery("SELECT c FROM Customer c").getResultList();
   }

    @Override
   public void saveProducts(List<Product> products) {
       em.getTransaction().begin();
       for (int i = 0; i < products.size(); i++) {
           Product product = products.get(i);
           if(product.getId() == null){
                em.persist(product);
            }else{
                em.merge(product);
            }
       }
       em.getTransaction().commit();
   }
   
    @Override
   public List<Product> loadProducts() {
       return em.createQuery("SELECT p FROM Product p").getResultList();
   }
   
   @Override
   public void savePurchases(List<Purchase> purchases) {
        em.getTransaction().begin();
       for (int i = 0; i < purchases.size(); i++) {
           Purchase purchase = purchases.get(i);
           if(purchase.getId() == null){
                em.persist(purchase);
            }else{
                em.merge(purchase);
            }
       }
       em.getTransaction().commit();
   }

    @Override
   public List<Purchase> loadPurchases() {
       return em.createQuery("SELECT p FROM Purchase p").getResultList();
   }
}
