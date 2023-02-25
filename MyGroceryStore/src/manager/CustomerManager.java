package manager;

import entity.Customer;
import java.util.List;

public class CustomerManager {
     private final Tools tool;

    public CustomerManager() {
        tool = new Tools();
    }
    
    public Customer createCustomer() {
        Customer customer = new Customer();
        customer.setBalance(500);
        System.out.println("Customer has been successfully added!");
        
        return customer;
    }
    
    public void addBalance(List<Customer> customers) {
        
        System.out.println("Enter customer's Id: ");
        int customer_id = tool.inputInt(new int[] {1, customers.size()});
        System.out.printf("Customer's balance is %f%n",customers.get(customer_id - 1).getBalance());
        System.out.println("Enter the amount of money to add: ");
        double money = tool.inputDouble(new double[] {1, 9999.99});
        customers.get(customer_id - 1).addBalance(money);
        
    }
    
    public void browseCustomers(List<Customer> customers) {
        for (int i = 0; i < customers.size(); i++) {
            System.out.printf("Customer %d. Balance: %s%n", i+1, customers.get(i).getBalance()
            );
        }
    } 
}
