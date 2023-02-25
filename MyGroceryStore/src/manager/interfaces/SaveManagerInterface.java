package manager.interfaces;

import entity.Customer;
import entity.Product;
import entity.Purchase;
import java.util.List;

public interface SaveManagerInterface {
    
    public void saveCustomers(List<Customer> customers);
    public List<Customer> loadCustomers();
    
    public void saveProducts(List<Product> products);
    public List<Product> loadProducts();
    
    public void savePurchases(List<Purchase> purchases);
    public List<Purchase> loadPurchases();
}
