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
        String name;
        String ic;
        String carname;
        String manufacturer;
        double manufacturer_price;
        boolean local_region;
        String address;
        String localfromchooser;

        Customer[] custArr = new Customer[4];
        Scanner userinput = new Scanner(System.in);
        DecimalFormat priceformatter = new DecimalFormat("#0.00");

        System.out.println("Welcome! for your information: \nIf car manufacturer from Malaysia, the tax charge only 10% from car price \nOther than that, it will be charged 30%"); 
        for (int i = 0; i < custArr.length; i++) {
            System.out.println("\n-Enter details for Customer " + (i+1) + "-"); 
            System.out.print("Customer name: ");
            name = userinput.nextLine();
            System.out.print("IC number : ");
            ic = userinput.nextLine();
            System.out.print("Customer address: ");
            address = userinput.nextLine();
            System.out.print("Car name: ");
            carname = userinput.nextLine();
            System.out.print("Car manufacturer: ");
            manufacturer = userinput.nextLine();
            System.out.print("Car manufacturer price: ");
            manufacturer_price = userinput.nextDouble();
            System.out.print("Is car manufacturer from Malaysia (Yes / No): ");
            localfromchooser = userinput.next();
            userinput.nextLine();
            if(localfromchooser.equalsIgnoreCase("yes") || localfromchooser.equalsIgnoreCase("y")){
                local_region = true;
            }else{
                local_region = false;
            }
            
            custArr[i] = new Customer(carname, manufacturer, manufacturer_price, local_region, name, ic, address);
        }
        
        //display all
        System.out.println("\n\nAll customer data:");
        for (int i = 0; i < custArr.length; i++) {
            System.out.println("\n===Customer " + (i + 1)+"===");
            System.out.println(custArr[i].toString());
            System.out.println("Price after TAX: RM" + priceformatter.format(custArr[i].calNewPrice()));
        }
    }
}
