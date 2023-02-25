package manager;

import entity.Product;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private final Scanner scn;
    private final Tools tool;
    
    public ProductManager() {
        scn = new Scanner(System.in);
        tool = new Tools();
    }
    
    public Product createProduct() {
        Product product = new Product();
        System.out.println("Enter product's name: ");
        product.setName(scn.nextLine());
        System.out.println("Enter the price: ");
        product.setPrice(tool.inputDouble(new double[] {1, 9999.99}));
        System.out.println("Enter the amount in stock: ");
        product.setStock(tool.inputInt(new int[] {1, 999}));;
        
        return product;
    }
    
    public void browseProducts(List<Product> products) {
        for(int i  = 0; i < products.size(); i++) {
            System.out.printf("Product %d. Name: %s Price: %s Stock: %s%n"
                    ,(i+1)
                    ,products.get(i).getName()
                    ,products.get(i).getPrice()
                    ,products.get(i).getStock()   
            );
        }
    }
    
//    public void addStock(List<Product> products) {
//        System.out.println("Enter product's Id: ");
//        int product_id = tool.inputInt(new int[] {1, products.size()});
//        
//        System.out.println("Enter the amount to replenish: ");
//        products.get(product_id - 1).addStock(tool.inputInt(new int[] {1,999}));
//    }
}
