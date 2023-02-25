package jktv21MyGroceryStore;

public class Messages {
    public String mainMsg;
    public String BrowseMsg;
    public String AddMsg;
    public String ManageMsg;
    
    public Messages() {
        mainMsg = "0. Exit\n"
                + "1. Browse...\n"
                + "2. Add...\n"
                + "3. Manage...";
        
        BrowseMsg = "0. Back\n"
                + "1. Browse Products\n"
                + "2. Browse Customers\n"
                + "3. Browse Purchases";
        
        AddMsg = "0. Back\n"
                + "1. Add a Product\n"
                + "2. Add a Customer\n"
                + "3. Add a Purchase";
        
        ManageMsg = "0. Back\n"
                + "1. Add Balance to Customer\n"
                + "2. View Income";
    }
}
