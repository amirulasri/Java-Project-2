package main;

/**
 *
 * @author amiru
 */
public class Cloth {

    protected String name;
    protected double price;
    protected double length;

    //CONTRUCTOR WITHOUT PARAMETER
    public Cloth() {
        name = "";
        price = 0;
        length = 0;
    }

    //CONSTRUCTOR WITH PARAMETER
    public Cloth(String name, double price, double length) {
        this.name = name;
        this.price = price;
        this.length = length;
    }

    //MUTATORS
    public void setallclothdata(String name, double price, double length) {
        this.name = name;
        this.price = price;
        this.length = length;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setprice(double price) {
        this.price = price;
    }

    public void setlength(double length) {
        this.length = length;
    }

    //ACCESSOR
    public String getname() {
        return name;
    }

    public double getprice(){
        return price;
    }
    
    public double getlength(){
        return length;
    }
    
    public double payment(double length){
        double totalprice;
        totalprice = price * length;
        return totalprice;
    }
    
    @Override
    public String toString(){
        return "Name: " + name + "\nPrice: " + price + "\nLength (meter): " + length;
    }
    
}
