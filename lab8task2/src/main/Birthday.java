package main;

/**
 *
 * @author amirul asri
 */
public class Birthday extends Event{
    private String theme;
    private boolean clown;
    
    public Birthday (String custName, int numOfGuest, int menuType, String theme, boolean clown){
        super(custName, numOfGuest, menuType);
        this.theme = theme;
        this.clown = clown;
    }
    
    public String getTheme(){
        return theme;
    }
    
    public boolean getClown(){
        return clown;
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
        
        double themeprice = 0;
        if(theme.equalsIgnoreCase("Anime")){
            themeprice = 400;
        }else if(theme.equalsIgnoreCase("Superhero")){
            themeprice = 300;
        }else if(theme.equalsIgnoreCase("Barbie")){
            themeprice = 450;
        }
        
        double clownprice = 0;
        if(clown){
            clownprice = 200;
        }
        
        double payment = (menuprice * numOfGuest) + clownprice + themeprice;
        
        return payment;
    }
    
    public String toString(){
        return "Customer name: " + super.custName + "\nNumber Of Guest: " + super.numOfGuest + "\nMenu type: " + super.menuType + "\nBirthday theme: " + theme + "\nClown: " + clown;
    }
}
