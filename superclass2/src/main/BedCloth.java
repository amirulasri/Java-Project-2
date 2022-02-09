package main;
/**
 *
 * @author amiru
 */
public class BedCloth extends Cloth {
    private String size;
    private boolean pillow;
    
    //CONSTRUCTOR WITHOUT PARAMETER
    public BedCloth(){
        super();
        size = "";
        pillow = false;
    }
    
    //CONSTRUCTOR WITH PARAMETER
    public BedCloth(String name, double price, double length, String size, boolean pillow){
        super(name, price, length);
        this.size = size;
        this.pillow = pillow;
    }
    
    //MUTATOR
    public void setallbedclothdata(String size, boolean pillow){
        this.size = size;
        this.pillow = pillow;
    }
    
    public void setsize(String size){
        this.size = size;
    }
    
    public void setpillow(boolean pillow){
        this.pillow = pillow;
    }
    
    //ACCESSOR
    public String getsize(){
        return size;
    }
    
    public boolean getpillow(){
        return pillow;
    }
    
    public double payment(String size){
        double amount = 0;
        if(size.equalsIgnoreCase("Single")){
            amount = 150.00;
        }else if(size.equalsIgnoreCase("Queen")){
            amount = 450.00;
        }else if(size.equalsIgnoreCase("King")){
            amount = 550.00;
        }
        return amount;
    }
    
    public String toString(){
        return "Size: " + size + "\nPillow: " + pillow;
    }
}
