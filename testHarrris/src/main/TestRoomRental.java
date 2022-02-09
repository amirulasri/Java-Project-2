/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.*;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestRoomRental{
    public static void main (String [] args) throws ParseException{
        Scanner input = new Scanner (System.in);
        
        //DECLARE OBJECT ARRAY
        RoomRental[] rentalArr = new RoomRental[2];
        
        //HEADER OR FRONT PAGE
        System.out.println("         [ Hotel Sri Kayangan ]         \n                 ");
            
        //LOOPING FOR USER INPUT DATA
        for(int i = 0; i < rentalArr.length; i++){
            
            //DECLARE EACH ARRAY OBJECT
            rentalArr[i] = new RoomRental();
            
            //USER INPUT
            System.out.println("[ Customer " + (i + 1) + "]");
            System.out.print("Enter customer name :");
            String customerName = input.nextLine();
            System.out.print("Enter your contact number :");
            String contactNo = input.nextLine();
            System.out.print("Enter your room type (Standard, Deluxe, Superior) :");
            String roomType = input.nextLine();
            System.out.print("Enter check in Date (DD/MM/YYYY) :");
            String inputStart = input.nextLine();
            System.out.print("Enter check out date (DD/MM/YYYY) :");
            String inputEnd = input.nextLine();
            System.out.print("Enter quantity room :");
            int quantityRoom = input.nextInt();
            input.nextLine();
            System.out.println("-----------------------------------------------------------------\n");
            
            //CONVERT STRING TO DATE
            Date startDate, endDate;
            startDate = new SimpleDateFormat("dd/MM/yyyy").parse(inputStart);
            endDate = new SimpleDateFormat("dd/MM/yyyy").parse(inputEnd);
            
            //SET VALUE
            rentalArr[i].setroomrental(customerName, contactNo, roomType, startDate, endDate, quantityRoom);
            
        }
        
        //DISPLAY ALL SAVED DATA 
        System.out.println("[ Saved Customer Data ]");
        System.out.println();
        for(int i = 0; i < rentalArr.length; i++){
            String roomtype = rentalArr[i].getroomtype();
            int datediffdays = rentalArr[i].CalDays(rentalArr[i].getstartdate(),rentalArr[i].getenddate());
            int quantityroom = rentalArr[i].getquantityroom();
            
            System.out.println("[ Customer " + (i + 1) + "]");
            System.out.println();
            System.out.println(rentalArr[i].toString());
            System.out.println("Days:" + datediffdays);
            
            //DISPLAY PRICE AND DISCOUNT IF BOOK MORE THAN 2 DAYS
            if(datediffdays > 2){
                System.out.println("Discount more than 2 days : RM " + rentalArr[i].FindPrice(quantityroom, datediffdays, roomtype) * 0.05);
            }else{
                System.out.println("Discount more than 2 days : No discount");
            }
             System.out.println("Total price: RM" + rentalArr[i].FindPrice(quantityroom, datediffdays, roomtype) + "\n");
             System.out.println("-----------------------------------------------------------------\n");
        }
        
        //COUNT ROOM RENTED 
        int stacount = 0;
        int delucount = 0;
        int supcount = 0;
        
        for(int i = 0; i < rentalArr.length; i++){
            if(rentalArr[i].getroomtype().equalsIgnoreCase("Standard")){
                stacount += rentalArr[i].getquantityroom();
            }else if(rentalArr[i].getroomtype().equalsIgnoreCase("Deluxe")){
                delucount += rentalArr[i].getquantityroom();
            }else if(rentalArr[i].getroomtype().equalsIgnoreCase("Superior")){
                supcount += rentalArr[i].getquantityroom();
            }
        }
        
        //DISPLAY ROOM RENTED
        System.out.println("[ TOTAL OF ROOM RENTED ]");
        System.out.println("Standart :" + stacount);
        System.out.println("Deluxe :" + delucount);
        System.out.println("Superior :" + supcount);
        System.out.println("-----------------------------------------------------------------");
        
        //UPDATE CUSTOMER DATA
        int sentinel = 111;
        int countcust = 0;
        System.out.print("Do you want to modify your data ? (if Yes Press '1' if No Press '0') :");
        int modify = input.nextInt();
        input.nextLine();
        System.out.println();
        while(sentinel != 0){
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Choose you option below :");
            System.out.println("1.Search");
            System.out.println("2.Update");
            System.out.println("3.Display");
            System.out.println("0.Exit");
            System.out.println(); 
            System.out.print("Enter your code (1,2,3 or 0 to exit) :" );
            int optionCode = input.nextInt();
            System.out.println("-----------------------------------------------------------------\n");
            switch(optionCode){
               case 0 :
                   sentinel = 0;
                   break;
               case 1:
                   input.nextLine();
                   System.out.print("Enter customer name you want to search : ");
                   String customerName = input.nextLine();
                   System.out.println("-----------------------------------------------------------------\n");
                   for(int i = 0; i < rentalArr.length; i++){
                      String roomtype = rentalArr[i].getroomtype();
                      int datediffdays = rentalArr[i].CalDays(rentalArr[i].getstartdate(),rentalArr[i].getenddate());
                      int quantityroom = rentalArr[i].getquantityroom();
                      
                      
                      if(rentalArr[i].getcustomername().equalsIgnoreCase(customerName)){
                      
                      //GET CUSTOMER INFO 
                      System.out.println("   [ Customer Matched ]   ");
                      System.out.println();
                      System.out.println(rentalArr[i].toString());
                      System.out.println("Total price: RM" + rentalArr[i].FindPrice(quantityroom, datediffdays, roomtype) + "\n");
                      }else{
                          countcust++;
                      }
                      
                      if (countcust == rentalArr.length){
                          System.out.println("Customer named " + customerName + " cannot be found please try again later.");
                          countcust = 0;
                      }
                   }
                   break;
               case 2:
                   input.nextLine();
                   System.out.print("Enter customer name to update : ");
                   customerName = input.nextLine();
                   for(int i = 0; i < rentalArr.length; i++){
                       if(rentalArr[i].getcustomername().equalsIgnoreCase(customerName)){
                           System.out.print("Enter new customer name :");
                           customerName = input.nextLine();
                           System.out.print("Enter new contact number :");
                           String contactNo = input.nextLine();
                           System.out.print("Enter new room type (Standard, Deluxe, Superior) :");
                           String roomType = input.nextLine();
                           System.out.print("Enter new check in Date (DD/MM/YYYY) :");
                           String inputStart = input.nextLine();
                           System.out.print("Enter new check out date (DD/MM/YYYY) :");
                           String inputEnd = input.nextLine();
                           System.out.print("Enter new quantity room :");
                           int quantityRoom = input.nextInt();
                           input.nextLine();
                           
                           //CONVERT STRING TO DATE
                           Date startDate, endDate;
                           startDate = new SimpleDateFormat("dd/MM/yyyy").parse(inputStart);
                           endDate = new SimpleDateFormat("dd/MM/yyyy").parse(inputEnd);
                           
                           rentalArr[i].setroomrental( customerName, contactNo, roomType, startDate, endDate, quantityRoom);
                       }else{
                           countcust++;
                       }
                       
                       if (countcust == rentalArr.length){
                          System.out.println("Customer named " + customerName + " cannot be found please try again later.");
                          countcust = 0;
                       }
                   }
                   
                   break;
               case 3:
                      input.nextLine();
                      System.out.print("Enter customer name you want to display : ");
                       customerName = input.nextLine();
                      System.out.println("-----------------------------------------------------------------\n");
                      for(int i = 0; i < rentalArr.length; i++){
                          String roomtype = rentalArr[i].getroomtype();
                          int datediffdays = rentalArr[i].CalDays(rentalArr[i].getstartdate(),rentalArr[i].getenddate());
                          int quantityroom = rentalArr[i].getquantityroom();
                      
                      
                          if(rentalArr[i].getcustomername().equalsIgnoreCase(customerName)){
                      
                              //GET CUSTOMER INFO 
                              System.out.println("   [ Displayed Customer Data ]   ");
                              System.out.println();
                              System.out.println(rentalArr[i].toString());
                              System.out.println("Total price: RM" + rentalArr[i].FindPrice(quantityroom, datediffdays, roomtype) + "\n");
                          }else{
                              countcust++;
                          }
                      
                          if (countcust == rentalArr.length){
                              System.out.println("Customer named " + customerName + " cannot be found please try again later.");
                              countcust = 0;
                          }
                   }
                   
                   break;
               default:
                System.out.println("Invalid code please try again later\n");
            }
        }
        System.out.println("Thank you for using my system hotel have a nice day");
        
    }
}

