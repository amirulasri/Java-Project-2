
import java.util.*;
import java.time.Period;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;

public class RoomRental
{
    private String customerName;
    private String contactNo;
    private String roomType;
    private Date startDate1,endDate1;
    private int quantityRoom;
    
    public RoomRental()
    {
        customerName=null;
        contactNo=null;
        roomType=null;
        startDate1=null;
        endDate1=null;
        quantityRoom=0;
    }

    public void setRoomRental(String customerName, String contactNo, String roomType,Date startDate,Date endDate, 
    int quantityRoom)
    {
        this.customerName=customerName;
        this.contactNo=contactNo;
        this.roomType=roomType;
        this.startDate1=startDate;
        this.endDate1=endDate;
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

    public Date getstartDate1()
    {
        return startDate1;
    }
    
    public Date getendDate1()
    {
        return endDate1;
    }
    
    public void setcustomerName(String customerName)
    {
        this.customerName = customerName;
    }
    
    public void setcontactNo(String contactNo)
    {
        this.contactNo = contactNo;
    }
    
    public void setroomType(String roomType)
    {
        this.roomType = roomType;
    }
    
    public void setstartDate1(Date startDate1)
    {
        this.startDate1 = startDate1;
    }
    
    public void setendDate1(Date endDate1)
    {
        this.endDate1 = endDate1;
    }
    
    public void setquantityRoom(int quantityRoom)
    {
        this.quantityRoom = quantityRoom;
    }
    
    public int getquantityRoom()
    {
        return quantityRoom = quantityRoom;
    }
    
    public int calculateDays(Date startDate1,Date endDate1)
    {
        long startDate = startDate1.getTime();
        long endDate = endDate1.getTime();
        int days=0;
        long timedifferent=0;
        if(startDate>endDate)
        {
            timedifferent = startDate-endDate;
        }
        
        else
        {
            timedifferent = endDate-startDate;
        }
        
        days=(int) (timedifferent/(1000*60*60*24));
        
        return days;
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
        
        findPrice =(findPrice*calculateDays)*quantityRoom;
        if (calculateDays>2)
        {
            double discount = findPrice*0.05;
            findPrice = findPrice-discount;
        }
        return findPrice;
    }
    
    
    public String toString()
    {
        return("\n\nCustomer Name:" + customerName + "\nContact No:" + contactNo + "\nRoom Type:" + roomType + 
        "\nStart Date:" + startDate1 + "\nEnd Date:" + endDate1 + "\nQuantity Room:" + quantityRoom);
    }
    
}
