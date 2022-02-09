/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author amirul asri
 */
public class Main {

    public static void main(String[] args) {
        String name = null;
        int numberOfOrder = 0;
        String foodSet = null;
        int selectedfoodset = 0;
        boolean desert = false;
        String restaurantName = null;
        String restaurantAddress = null;
        String desertchooser = null;

        WesternFood[] westernfoodarr = new WesternFood[5];
        Scanner userinput = new Scanner(System.in);
        DecimalFormat priceformatter = new DecimalFormat("#0.00");

        for (int i = 0; i < westernfoodarr.length; i++) {
            System.out.println("\n-Customer " + (i + 1)+"-");
            System.out.print("Enter number of order: ");
            numberOfOrder = userinput.nextInt();
            
            userinput.nextLine();//FIX SKIPPING BUG
            
            System.out.print("Enter customer name: ");
            name = userinput.nextLine();

            System.out.print("Enter restaurant name: ");
            restaurantName = userinput.nextLine();

            System.out.print("Enter restaurant address: ");
            restaurantAddress = userinput.nextLine();

            System.out.print("Enter Food set: \n1. Lamb Chop - RM30.00 \n2. Chicken Chop - RM20.00 \n3. Fish and Chip - RM15.00 \n4. Grilled Beef - RM25.00 \nSelect by number: ");
            selectedfoodset = userinput.nextInt();
            if(selectedfoodset == 1){
                foodSet = "Lamb Chop";
            }else if(selectedfoodset == 2){
                foodSet = "Chicken Chop";
            }else if(selectedfoodset == 3){
                foodSet = "Fish and Chip";
            }else if(selectedfoodset == 4){
                foodSet = "Grilled Beef";
            }
            
            System.out.print("Do you want desert? (RM10.90 charge) (yes/NO): ");
            desertchooser = userinput.next();
            if(desertchooser.equalsIgnoreCase("yes") || desertchooser.equalsIgnoreCase("y")){
                desert = true;
            }else{
                desert = false;
            }
            
            westernfoodarr[i] = new WesternFood(restaurantName, restaurantAddress, name, numberOfOrder, foodSet, desert);
        }
        
        //display all
        System.out.println("\n\nAll customer data:");
        for(int i = 0; i < westernfoodarr.length; i++){
            System.out.println("\n===Customer " + (i + 1)+"===");
            System.out.println(westernfoodarr[i].toString());
            System.out.println("Total price: RM" + priceformatter.format(westernfoodarr[i].payment()));
        }
    }
}
