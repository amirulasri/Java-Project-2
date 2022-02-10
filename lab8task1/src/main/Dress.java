package main;

/**
 *
 * @author amirul asri
 */
public class Dress extends Tailor{
    
    private String dressType;
    private boolean silk;
    
    public Dress(){
        super();
        dressType = null;
        silk = false;
    }
    
    public Dress(String custNo, String custName, String date, char custType, String dressType, Boolean silk){
        super(custNo, custName, date, custType);
        this.dressType = dressType;
        this.silk = silk;
    }
    
    public String getDressType(){
        return dressType;
    }
    
    public boolean getSilk(){
        return silk;
    }

    @Override
    double calCharges() {
        double kebaya = 0, kurung = 0, jubah = 0;
        if(dressType.equalsIgnoreCase("Kebaya")){
            if(silk){
                kebaya = 80;
            }else{
                kebaya = 40;
            }
        }else if(dressType.equalsIgnoreCase("Kurung")){
            if(silk){
                kurung = 50;
            }else{
                kurung = 25;
            }
        }else if(dressType.equalsIgnoreCase("Jubah")){
            if(silk){
                jubah = 100;
            }else{
                jubah = 50;
            }
        }
        double charges;
        charges = kebaya + kurung + jubah;
        
        if(custType == '1'){
            charges = charges + (charges * 0.15);
        }
        
        return charges;
    }
    
    @Override
    public String toString(){
        String custTypename;
        if(super.custType == '1'){
            custTypename = "Regular customer";
        }else{
            custTypename = "New customer";
        }
        return "Customer name: " + super.custName + "\nCustomer number: " + super.custNo + "\nType: " + custTypename + "\nDate: " + super.date +"\nDress type: " + dressType + "\nSilk: " + silk;
    }
}
