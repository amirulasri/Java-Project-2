/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;


import java.util.*;
import java.util.Date;

public class RoomRental{
    private String customerName, contactNo, roomType;
    private Date startDate, endDate;
    int quantityRoom;
    
    //CONSTRUCTOR WITHOUT PARAMETER 
    public RoomRental(){
        customerName = "";
        contactNo = "";
        roomType = "";
        startDate = null;
        endDate = null;
        quantityRoom = 0;
    }
    
    //CONSTRUCTOR WITH PARAMETER
    public RoomRental(String customerName, String contactNo, String roomType, Date startDate, Date endDate,int quantityRoom){
        this.customerName = customerName;
        this.contactNo = contactNo;
        this.roomType = roomType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.quantityRoom = quantityRoom;
    }
    
    //CALCULATE BETWEEN DAYS
    public int CalDays(Date startDate, Date endDate ){
        long startDateMs = startDate.getTime();
        long endDateMs = endDate.getTime();
        int days = 0;
        long timediff = 0;
        if (startDateMs > endDateMs) {
            timediff = startDateMs - endDateMs;
        } else {
            timediff = endDateMs - startDateMs;
        }
        days = (int) (timediff / (1000 * 60 * 60 * 24));
        return days;
    }
    
    //FIND PRICE EACH ROOMS
    public double FindPrice(int quantityRoom, int days, String roomType) {
        //GET ROOM TYPE AND FIND ROOM PRICE
        long roomPrice = 0;
        if (roomType.equalsIgnoreCase("Standard")) {
            roomPrice = 100;
        } else if (roomType.equalsIgnoreCase("Deluxe")) {
            roomPrice = 150;
        } else if (roomType.equalsIgnoreCase("Superior")) {
            roomPrice = 200;
        }

        //CALCULATION FOR TOTAL PRICE
        double price = (roomPrice * days) * quantityRoom;

        //DISCOUNT IF BOOKING MORE THAN TWO DAYS
        if (days > 2) {
            double discount = price * 0.05;
            price = price - discount;
        }

        return price;
    }
    
    //MUTATOR
    public void setroomrental(String customerName, String contactNo, String roomType, Date startDate, Date endDate,int quantityRoom){
        this.customerName = customerName;
        this.contactNo = contactNo;
        this.roomType = roomType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.quantityRoom = quantityRoom;
    }
    
    public void setcustomername (String customerName){
        this.customerName = customerName;
    }
    
    public void setcontactno(String contactNo){
        this.contactNo = contactNo;
    }
    
    public void setroomtype (String roomType){
        this.roomType = roomType;
    }
    
    public void setstartdate(Date startDate){
        this.startDate = startDate;
    }
    
    public void setenddate (Date endDate){
        this.endDate = endDate;
    }
    
    public void setquantityroom (int quantityRoom){
        this.endDate = endDate;
    }
    
    //ACCESSOR
    public String getcustomername(){
        return customerName;
    }
    
    public String getcontactno(){
        return contactNo;
    }
    
    public String getroomtype(){
        return roomType;
    }
    
    public Date getstartdate (){
        return startDate;
    }
    
    public Date getenddate(){
        return endDate;
    }
    
    public int getquantityroom(){
        return quantityRoom;
    }
    
    public String toString(){
        return "Customer name :" + customerName + "\nContact no :" + contactNo + "\nRoom type :" + roomType + "\nChecked in :" + startDate + "\nChecked out :" + endDate + "\nNumber of room :" + quantityRoom;
    }
}
