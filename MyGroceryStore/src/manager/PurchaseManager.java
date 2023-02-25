package manager;

import entity.Customer;
import entity.Purchase;
import entity.Product;
import java.util.List;
import java.util.GregorianCalendar;

public class PurchaseManager {
    private final Tools tool;

    public PurchaseManager() {
        tool = new Tools();
    }
    
    public Purchase createPurchase(List<Customer> customers, List<Product> products) {
        Purchase purchase = new Purchase();
        
        System.out.println("Enter customer's Id: ");
        int customer_id = tool.inputInt(new int[] {1, customers.size()});

        
        System.out.println("Enter product's Id: ");
        int product_id = tool.inputInt(new int[] {1, products.size()});
                
        purchase.setCustomer(customers.get(customer_id - 1));
        purchase.setProduct(products.get(product_id - 1));
        purchase.setPurchaseDate(new GregorianCalendar().getTime());
        products.get(product_id - 1).substractStock();
        customers.get(customer_id - 1).substractBalance(products.get(product_id - 1).getPrice());
        
        return purchase;
    }
    
    public void totalIncome(List<Purchase>purchases) {
        double totalIncome = 0;
        for(int i = 0; i < purchases.size(); i++) {
            totalIncome += purchases.get(i).getProduct().getPrice();
        }
        System.out.println("Total Earned: " + totalIncome);
        System.out.println("Total Products Sold: " + purchases.size());
    }
    
    public void browsePurchases(List<Purchase> purchases) {
        for(Purchase purchaseItem : purchases) {
            Purchase purchase = purchaseItem;
            System.out.printf("%d) %s. %s. Purchase date: %s%n"
                ,purchase.getId()
                ,purchase.getCustomer()
                ,purchase.getProduct()
                ,purchase.getPurchaseDate()
            );
        }
    }  
}
