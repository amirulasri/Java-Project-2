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
import java.time.LocalDate;
import java.time.Period;

public class RoomRental
{
    private String customerName;
    private String contactNo;
    private String roomType;
    private LocalDate startDate,endDate;
    private int quantityRoom;
    
    public RoomRental()
    {
        customerName=null;
        contactNo=null;
        roomType=null;
        startDate=null;
        endDate=null;
        quantityRoom=0;
    }

    public void setRoomRental(String customerName, String contactNo, String roomType,LocalDate startDate,LocalDate endDate, 
    int quantityRoom)
    {
        this.customerName=customerName;
        this.contactNo=contactNo;
        this.roomType=roomType;
        this.startDate=startDate;
        this.endDate=endDate;
        this.quantityRoom=quantityRoom;   
    }
    
    public String getcustomerName()
    {
        return customerName;
    }
    
    public String getcontactNo()
    {
        return contactNo;
    }
    
    public String getroomType()
    {
        return roomType;
    }

    public LocalDate getstartDate()
    {
        return startDate;
    }
    
    public LocalDate getendDate()
    {
        return endDate;
    }
    
    public void setstartDate(LocalDate startDate)
    {
        this.startDate = startDate;
    }
    
    public void setendDate(LocalDate endDate)
    {
        this.endDate = endDate;
    }
    
    public int quantityRoom()
    {
        return quantityRoom = quantityRoom;
    }
    
    public int CalculateDays(LocalDate startDate,LocalDate endDate)
    {
        int calculateDays= Period.between(startDate,endDate).getDays();
        return calculateDays;
    }
    
    public double findPrice(String roomType, int calculateDays,double quantityRoom)
    {
        double findPrice=0;
        if(roomType.equalsIgnoreCase("standard"))
        {
            findPrice=100*calculateDays*quantityRoom;
        }
        else if (roomType.equalsIgnoreCase("deluxe"))
        {
            findPrice=150*calculateDays*quantityRoom;
        }
        else if (roomType.equalsIgnoreCase("superior"))
        {
            findPrice=200*calculateDays*quantityRoom;
        }
        
        if(calculateDays>2)
        {
            findPrice=findPrice*0.05;
        }
        
        return findPrice;
    }
    
    
    public String toString()
    {
        return("\n\nCustomer Name:" + customerName + "\nContact No:" + contactNo + "\nRoom Type:" + roomType + 
        "\nStart Date:" + startDate + "\nEnd Date:" + endDate + "\nQuantity Room:" + quantityRoom);
    }
    
}