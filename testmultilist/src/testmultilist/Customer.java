package testmultilist;

/**
 *
 * @author amiru
 */
public class Customer extends Orders{
    //CUSTOMER DATA
    private String name;
    private String phoneno;
    private String email;
    private boolean regularcustomer; //FOR GET DISCOUNT IF TRUE
    
    public Customer(){
        orderid = null;
        name = null;
        phoneno = null;
        email = null;
        regularcustomer = false;
    }
    
    public Customer(String orderid, String name, String phoneno, String email, boolean regularcustomer){
        this.orderid = orderid;
        this.name = name;
        this.phoneno = phoneno;
        this.email = email;
        this.regularcustomer = regularcustomer;
    }
    
    //ACCESSOR
    public String getname(){
        return name;
    }
    
    public String getphoneno(){
        return phoneno;
    }
    
    public String getemail(){
        return email;
    }
    
    public boolean getregularcustomer(){
        return regularcustomer;
    }
    
    public String getorderid(){
        return orderid;
    }
}
