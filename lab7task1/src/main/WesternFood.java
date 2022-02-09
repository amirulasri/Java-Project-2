/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author amirul asri
 */
public class WesternFood extends Restaurant {
    private String name;
    private int numberOfOrder;
    private String foodSet;
    private boolean desert;
    
    public WesternFood(){
        super();
        name = null;
        numberOfOrder = 0;
        foodSet = null;
        desert = false;
    }
    
    //CONSTRUCTOR
    public WesternFood(String restaurantName, String restaurantAddress, String name, int numberOfOrder, String foodSet, boolean desert){
        super(restaurantName, restaurantAddress);
        this.name = name;
        this.numberOfOrder = numberOfOrder;
        this.foodSet = foodSet;
        this.desert = desert;
    }
    
    //ACCESSOR
    public String getname(){
        return name;
    }
    
    public int getnumberoforder(){
        return numberOfOrder;
    }
    
    public String getfoodset(){
        return foodSet;
    }
    
    public boolean getdesert(){
        return desert;
    }
    
    //PROCCESSOR
    public double payment(){
        double foodprice = 0;
        if(foodSet.equalsIgnoreCase("Lamb Chop")){
            foodprice = 30.00;
        }else if(foodSet.equalsIgnoreCase("Chicken Chop")){
            foodprice = 20.00;
        }else if(foodSet.equalsIgnoreCase("Fish and Chip")){
            foodprice = 15.00;
        }else if(foodSet.equalsIgnoreCase("Grilled Beef")){
            foodprice = 25.00;
        }
        
        if(desert == true){
            foodprice = foodprice + 10.90;
        }
        
        return foodprice;
    }
    
    //toString
    public String toString(){
        return "Name: " + name +"\nNumber Of Order: " + numberOfOrder + "\nFood Set: " + foodSet + "\nDesert: " + desert + "\nRestaurant Name: "+ super.getrestaurantname() + "\nRestaurant Address: " + super.getrestaurantaddress();
    }
}
