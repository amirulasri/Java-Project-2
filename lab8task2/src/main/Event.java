package main;

/**
 *
 * @author amirul asri
 */
public abstract class Event {
    protected String custName;
    protected int numOfGuest;
    protected int menuType;
    
    public Event (String custName, int numOfGuest, int menuType){
        this.custName = custName;
        this.numOfGuest = numOfGuest;
        this.menuType = menuType;
    }
    
    public String getName(){
        return custName;
    }
    
    public int getGuest(){
        return numOfGuest;
    }
    
    public int getType(){
        return menuType;
    }
    
    public abstract double calPayment();
    
    public String toString(){
        return "Customer name: " + custName + "\nNumber Of Guest: " + numOfGuest + "\nMenu type: " + menuType;
    }
}
