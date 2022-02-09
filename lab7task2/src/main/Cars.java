/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author amirul asri
 */
public class Cars {
    private String name;
    private String manufacturer;
    private double manufacturer_price;
    private boolean local_region; //return true if malaysia’s manufacturer
    
    public Cars(String name, String manufacturer, double manufacturer_price, boolean local_region){
        this.name = name;
        this.manufacturer = manufacturer;
        this.manufacturer_price = manufacturer_price;
        this.local_region = local_region;
    }
    
    //MUTATOR
    public void setallcarsdata(String name, String manufacturer, double manufacturer_price, boolean local_region){
        this.name = name;
        this.manufacturer = manufacturer;
        this.manufacturer_price = manufacturer_price;
        this.local_region = local_region;
    }
    
    //MUTATOR
    public void setcarsname(String name){
        this.name = name;
    }
    
    //MUTATOR
    public void setmanufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    
    //MUTATOR
    public void setmanufacturerprice(double manufacturer_price){
        this.manufacturer_price = manufacturer_price;
    }
    
    //MUTATOR
    public void setlocalregion(boolean local_region){
        this.local_region = local_region;
    }
    
    //ACCESSOR
    public String getcarsname(){
        return name;
    }
    
    public String getmanufacturer(){
        return manufacturer;
    }
    
    public double getmanufacturerprice(){
        return manufacturer_price;
    }
    
    public boolean getlocalregion(){
        return local_region;
    }
    
    //PROCESSOR
    public double calNewPrice(){
        double price;
        double tax = 0;
        if(local_region == true){
            tax = 0.10;
        }else{
            tax = 0.30;
        }
        price = manufacturer_price + (manufacturer_price * tax);
        
        return price;
    }
}
