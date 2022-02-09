package main;

/**
 *
 * @author amirul asri
 */
public class Wedding extends Event{
    private boolean pelamin;
    private String style;
    
    public Wedding (String custName, int numOfGuest, int menuType, boolean pelamin, String style){
        super(custName, numOfGuest, menuType);
        this.pelamin = pelamin;
        this.style = style;
    }
    
    public boolean getPelamin(){
        return pelamin;
    }
    
    public String getStyle(){
        return style;
    }

    @Override
    public double calPayment() {
        //Menu price
        double menuprice = 0;
        if(super.menuType == 1){
            menuprice = 10.00;
        }else if(super.menuType == 2){
            menuprice = 20.00;
        }else if(super.menuType == 3){
            menuprice = 30.00;
        }
        
        double styleprice = 0;
        if(style.equalsIgnoreCase("Garden")){
            styleprice = 3000.00;
        }else if(style.equalsIgnoreCase("Modern")){
            styleprice = 3500.00;
        }else if(style.equalsIgnoreCase("Traditional")){
            styleprice = 2000.00;
        }
        
        double pelaminprice = 0;
        if(pelamin){
            pelaminprice = 1500;
        }
        
        double payment = (menuprice * numOfGuest) + pelaminprice + styleprice;
        
        return payment;
    }
    
    public String toString(){
        return "Customer name: " + super.custName + "\nNumber Of Guest: " + super.numOfGuest + "\nMenu type: " + super.menuType +"\nPelamin: " + pelamin + "\nStyle: " + style;
    }
}
