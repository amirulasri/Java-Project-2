/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author amiru
 */
import java.util.*;

public class Restaurant
{
    private String restaurantName;
    private String restaurantAddress;
    
    //Normal constructor
    public Restaurant (String restaurantName, String restaurantAddress)
    {
        this.restaurantName = restaurantName;
        this.restaurantAddress = restaurantAddress;
    }
    
    //Accessor
    public String getrestaurantName ()
    {
        return restaurantName;
    }
    
    public String getrestaurantAddress ()
    {
        return restaurantAddress;
    }
    
    //printer
    public String toString(){
        return "Restaurant name: " + restaurantName + "\nRestaurant address: " + restaurantAddress;
    }
}