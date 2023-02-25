package jktv21MyGroceryStore;

import entity.Customer;
import entity.Purchase;
import java.util.List;
import entity.Product;
import manager.CustomerManager;
import manager.PurchaseManager;
import manager.ProductManager;

import manager.FileManager;
import manager.DatabaseManager;
import manager.Tools;
import manager.interfaces.SaveManagerInterface;

public class App {
    public static boolean saveToBase;
    private final PurchaseManager pcm;
    private final CustomerManager cm;
    private final ProductManager pm;
    private final SaveManagerInterface saveManager;
    private List<Purchase>purchases;
    private List<Customer>customers;
    private List<Product>products;
    private final Messages msgs;
    private final Tools tool;

    public App() {
        pcm = new PurchaseManager();
        cm = new CustomerManager();
        pm = new ProductManager();
        msgs = new Messages();
        tool = new Tools();
        if(App.saveToBase){
            saveManager = new DatabaseManager();
        }else{
            saveManager = new FileManager();
        }

        customers = saveManager.loadCustomers();
        products = saveManager.loadProducts();
        purchases = saveManager.loadPurchases();
   }
    
    public void run(){
        
        boolean mainloop = true;
        int userInput; int userInputNested;
        
        System.out.println("Welcome! To the Grocery Store Simulator! ");
        do{
            System.out.println(msgs.mainMsg);
                userInput = tool.inputInt(new int[] {0,3});
                
                switch(userInput){
                    case 0:
                        mainloop = false;
                        break;
                    case 1:
                        
                        nested: do{
                        System.out.println(msgs.BrowseMsg);
                        userInputNested = tool.inputInt(new int[] {0,3});
                            
                            switch(userInputNested){
                                case 0:
                                    break nested;
                                case 1:
                                    pm.browseProducts(products);
                                    break;
                                case 2:
                                    cm.browseCustomers(customers);
                                    break;
                                case 3:
                                    pcm.browsePurchases(purchases);
                                    break;
                            }
                        }while(true);
                            break;
                    case 2:
                        
                        nested: do{
                        System.out.println(msgs.AddMsg);
                        userInputNested = tool.inputInt(new int[] {0,3});
                        
                            switch(userInputNested){
                                case 0:
                                    break nested;
                                case 1:
                                    products.add(pm.createProduct());
                                    saveManager.saveProducts(products);
                                    break;
                                case 2:
                                    customers.add(cm.createCustomer());
                                    saveManager.saveCustomers(customers);
                                    break;
                                case 3:
                                    purchases.add(pcm.createPurchase(customers, products));
                                    saveManager.savePurchases(purchases);
                                    saveManager.saveCustomers(customers);
                                    saveManager.saveProducts(products);
                                    break;
                            }
                        }while(true);
                        
                        break;
                        
                    case 3:

                        nested: do{
                        System.out.println(msgs.ManageMsg);
                        userInputNested = tool.inputInt(new int[] {0,2});
                        
                            switch(userInputNested){
                                case 0:
                                    break nested;
                                case 1:
                                    cm.addBalance(customers);
                                    break;
                                case 2:
                                    pcm.totalIncome(purchases);
                                    break;
                            }
                        }while(true);
                        
                        break;
                }
 
        }while(mainloop);
    }
}
