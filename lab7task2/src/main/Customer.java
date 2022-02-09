/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.text.DecimalFormat;

/**
 *
 * @author amirul asri
 */
public class Customer extends Cars {
    DecimalFormat priceformatter = new DecimalFormat("#0.00");
    
    private String name;
    private String ic;
    private String address;
    
    //CONSTRUCTOR
    public Customer(String carname, String manufacturer, double manufacturer_price, boolean local_region, String name, String ic, String address){
        super(carname, manufacturer, manufacturer_price, local_region);
        this.name = name;
        this.ic = ic;
        this.address = address;
    }
    
    //toString
    public String toString(){
        return "Customer name: " + name + "\nCustomer IC number: " + ic + "\nCustomer address: " + address + "\nCar name: " + super.getcarsname() + "\nCar manufacturer: " + super.getmanufacturer() + "\nCar manufacturer price: RM" + priceformatter.format(super.getmanufacturerprice()) + "\nLocal region: " + super.getlocalregion();
    }
}
