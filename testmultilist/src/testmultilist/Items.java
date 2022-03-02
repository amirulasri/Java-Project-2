package testmultilist;

/**
 *
 * @author amiru
 */
public class Items extends Orders{
    //ITEMS DATA
    private String itemname;
    private int quantity;
    private boolean discount; //BASED ON DISCOUNT CUSTOMER
    
    public Items(){
        orderid = null;
        itemname = null;
        quantity = 0;
        discount = false;
    }
    
    public Items(String orderid, String itemname, int quantity, boolean discount){
        this.orderid = orderid;
        this.itemname = itemname;
        this.quantity = quantity;
        this.discount = discount;
    }
    
    //ACCESSOR
    public String getitemname(){
        return itemname;
    }
    
    public int getquantity(){
        return quantity;
    }
    
    public boolean getdiscount(){
        return discount;
    }
    
    public String getorderid(){
        return orderid;
    }
}
