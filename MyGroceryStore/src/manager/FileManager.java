package manager;

import entity.Customer;
import entity.Purchase;
import entity.Product;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import manager.interfaces.SaveManagerInterface;

public class FileManager implements SaveManagerInterface{
    
    private final String PRODUCTS = "data\\products.txt";
    private final String CUSTOMERS = "data\\customers.txt";
    private final String PURCHASES = "data\\purchases.txt";
    private final File file;
    
    public FileManager() {
        file = new File("data");
        file.mkdirs();
        
        File prods = new File(PRODUCTS);
        File custs = new File(CUSTOMERS);
        File purcs = new File(PURCHASES);
            
        try{
            if(prods.createNewFile()) System.out.println("File created");
            if(custs.createNewFile()) System.out.println("File created"); 
            if(purcs.createNewFile()) System.out.println("File created");
        }
        catch(Exception e){
        }
    }
    
    @Override
    public List<Purchase> loadPurchases() {
        List<Purchase>  purchases = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(PURCHASES);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            purchases = (List<Purchase>) objectInputStream.readObject();
        } catch (Exception e) {
            System.err.println(e);
        }
        return purchases;
    }
    
    @Override
    public List<Customer> loadCustomers() {
        List<Customer>  customers = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(CUSTOMERS);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            customers = (List<Customer>) objectInputStream.readObject();
        } catch (Exception e) {
            System.err.println(e);
        }
        return customers;
    }
    
    @Override
    public List<Product> loadProducts() {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(PRODUCTS);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            products = (List<Product>) objectInputStream.readObject();
        } catch (Exception e) {
            System.err.println(e);
        }
        return products;
    }
    
    @Override
    public void saveProducts(List<Product> products) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(PRODUCTS);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
            objectOutputStream.flush();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    @Override
    public void saveCustomers(List<Customer> customers) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(CUSTOMERS);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(customers);
            objectOutputStream.flush();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    @Override
    public void savePurchases(List<Purchase> purchases) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(PURCHASES);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(purchases);
            objectOutputStream.flush();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
}
