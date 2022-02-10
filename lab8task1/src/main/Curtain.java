package main;

/**
 *
 * @author amirul asri
 */
public class Curtain extends Tailor{
    private int windows;
    private int doors;
    
    private final double WINDOW_PRICE = 45.00;
    private final double DOOR_PRICE = 55.00;
    
    public Curtain(){
        super();
        windows = 0;
        doors = 0;
    }
    
    public Curtain(String custNo, String custName, String date, char custType, int windows, int doors){
        super(custNo, custName, date, custType);
        this.windows = windows;
        this.doors = doors;
    }
    
    public int getWindows(){
        return windows;
    }
    
    public int getDoors(){
        return doors;
    }
    
    @Override
    double calCharges() {
        double charge = (getWindows()* WINDOW_PRICE)+(getDoors()* DOOR_PRICE);
        if(custType == '1'){
            charge = charge + (charge * 0.15);
        }
        return charge;
    }
    
    @Override
    public String toString(){
        String custTypename;
        if(super.custType == 1){
            custTypename = "Regular customer";
        }else{
            custTypename = "New customer";
        }
        return "Customer name: " + super.custName + "\nCustomer number: " + super.custNo + "\nType: " + custTypename + "\nDate: " + super.date +"\nWindows: " + windows +" piece \nDoors: " + doors + " piece";
    }
    
}
