package testmultilist;

import java.util.ArrayList;

/**
 *
 * @author amiru
 */
public class Testmultilist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ArrayList<ArrayList<ArrayList<String>>> listorders = new ArrayList<ArrayList<ArrayList<String>>>();
        
        
        
        ArrayList<Customer> customers = new ArrayList<Customer>();
        ArrayList<Items> listitems = new ArrayList<Items>();
        
        String orderid = "98918";
        
        //ADDING ORDER 1
        customers.add(new Customer(orderid, "Haziq", "0118821822", "haziq@gmail", false));   
        customers.add(new Customer(orderid, "Fikri", "01179367822", "fikri@gmail", true));   
        
        //ADDING ORDER 2
        listitems.add(new Items(orderid, "Pencil", 10, true));                               
        listitems.add(new Items(orderid, "Eraser", 6, false));                              
        listitems.add(new Items(orderid, "Remote", 1, false));                              
        listitems.add(new Items(orderid, "Cake", 2, true));                                  
        listitems.add(new Items(orderid, "Gula", 1, false));                                 
        listitems.add(new Items(orderid, "Vailla", 5, true));
        
        
        
        System.out.println(listitems.get(2).getitemname());

        
        
        //ArrayList<Customer> customerdata = new ArrayList<Customer>();
        
        //listorders.add(new Items("OK", 1, true));
        
        
        
        
    }
    
}
