package main;

/**
 *
 * @author amirul asri
 */
public abstract class Tailor {
    protected String custNo;
    protected String custName;
    protected String date;
    protected char custType;
    
    Tailor(){
        custNo = null;
        custName = null;
        date = null;
        custType = '-';
    };
    
    Tailor(String custNo, String custName, String date, char custType){
        this.custNo = custNo;
        this.custName = custName;
        this.date = date;
        this.custType = custType;
    };
    
    public String getCustNo(){
        return custNo;
    }
    
    public String getCustName(){
        return custName;
    }
    
    public String getDate(){
        return date;
    }
    
    public char getCustType(){
        return custType;
    }
    
    abstract double calCharges();
    
    @Override
    public String toString(){
        return "Customer name: " + custName + "\nCustomer number: " + custNo + "\nType: " + custType + "\nDate: " + date;
    }
}