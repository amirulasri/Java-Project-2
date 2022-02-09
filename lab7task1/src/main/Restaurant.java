/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author amirul asri
 */
public class Restaurant {
    private String restaurantName;
    private String restaurantAddress;
    
    public Restaurant(){
        restaurantName = null;
        restaurantAddress = null;
    }
    
    //CONSTRUCTOR
    public Restaurant(String restaurantName, String restaurantAddress){
        this.restaurantName = restaurantName;
        this.restaurantAddress = restaurantAddress;
    }
    
    //MUTATOR
    public void setrestaurantaddress(String restaurantAddress){
        this.restaurantAddress = restaurantAddress;
    }
    
    //ACCESSOR
    public String getrestaurantname(){
        return restaurantName;
    }
    
    public String getrestaurantaddress(){
        return restaurantAddress;
    }
    
    //toString
    public String toString(){
        return "Restaurant name: " + restaurantName + "\nRestaurant address: " + restaurantAddress;
    }
}
