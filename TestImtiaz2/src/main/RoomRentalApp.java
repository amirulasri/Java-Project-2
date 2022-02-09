
import java.util.*;
import java.text.ParseException;
import java.text.DecimalFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.text.DecimalFormat;

public class RoomRentalApp
{
    public static void main (String[]args)throws ParseException
    {
        String customerName;
        String contactNo;
        String roomType;
        String startDate1;
        String endDate1;
        int quantityRoom;
        
        Date date1;
        Date date2;
        
        DecimalFormat decimalplaceformat = new DecimalFormat("0.00");
        
        Scanner in = new Scanner(System.in);
        
        RoomRental[]rentalArr=new RoomRental[2];
        for(int i=0; i<2; i++)
        {
            rentalArr[i]=new RoomRental();
        
            RoomRental x = new RoomRental();
        
            System.out.print("Enter customer name");
            customerName = in.nextLine();
        
            System.out.print("Enter contact no");
            contactNo = in.nextLine();
        
            System.out.print("Enter room type");
            roomType = in.nextLine();
        
            System.out.print("Enter quantity room");
            quantityRoom = in.nextInt();
        
            System.out.print("Enter start yyyy/MM/dd");
            startDate1 = in.nextLine();
        
            System.out.print("Enter end yyyy/MM/dd");
            endDate1 = in.nextLine();
            
            date1 = new SimpleDateFormat("dd/MM/yyyy").parse(startDate1);
            date2 = new SimpleDateFormat("dd/MM/yyyy").parse(endDate1);
            
            rentalArr[i].setRoomRental (customerName,contactNo,roomType,date1,date2,quantityRoom);
        }
        
        for(int i=0; i<2; i++)
        {
             System.out.println("customer"+(i+1)+"");
             System.out.println(rentalArr[i].toString());
             
             Date loopstartDate = rentalArr[i].getstartDate1();
             Date loopendDate = rentalArr[i].getendDate1();
             int calculateDays = rentalArr[i].calculateDays(loopstartDate,loopendDate);
             roomType = rentalArr[i].getroomType();
             quantityRoom = rentalArr[i].getquantityRoom();
             double findPrice = rentalArr[i].findPrice(roomType,calculateDays,quantityRoom);
             
             if (calculateDays > 2) 
            {
                System.out.println("Discount" + decimalplaceformat.format((rentalArr[i].findPrice
                (roomType, calculateDays, quantityRoom) * 0.05)));
            } 
            else 
            {
                System.out.println("Discount");
            }
             System.out.print("total price"+findPrice+"\n");
        }
        
        int standardCounter=0,deluxeCounter=0,superiorCounter=0;
        for(int i=0; i<2; i++)
        {
            String getCustomerRoomType = rentalArr[i].getroomType();
            if(getCustomerRoomType.equalsIgnoreCase("standard"))
            {
                standardCounter++;
            }
            
            else if(getCustomerRoomType.equalsIgnoreCase("deluxe"))
            {
                deluxeCounter++;
            }
            
            else if(getCustomerRoomType.equalsIgnoreCase("superior"))
            {
                superiorCounter++;
            }
        }
        
        System.out.println("standard room"+standardCounter);
        System.out.println("deluxe room"+deluxeCounter);
        System.out.println("superior room"+superiorCounter);
        
        for(int i=0; i<2; i++)
        {
            if(rentalArr[i].getcustomerName().equalsIgnoreCase("Siti")&&rentalArr[i].getroomType().equalsIgnoreCase("standard"))
            {
                rentalArr[i].setroomType("superior");
                
                Date loopstartDate = rentalArr[i].getstartDate1();
                Date loopendDate = rentalArr[i].getendDate1();
                int calculateDays = rentalArr[i].calculateDays (loopstartDate,loopendDate);
                roomType = rentalArr[i].getroomType();
                quantityRoom = rentalArr[i].getquantityRoom();
                
                double newprice = rentalArr[i].findPrice("superior",calculateDays,quantityRoom);
                
                System.out.println("customer detail"+rentalArr[i] + "total price" + newprice);
            }
        }
    }
}