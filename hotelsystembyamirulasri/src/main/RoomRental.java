package main;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author amirul asri
 */
public class RoomRental {

    private String customerName;
    private String contactNo;
    private String roomType;
    private Date startDate;
    private Date endDate;
    private int quantityRoom;
    
    //CONSTRUCTOR WITHOUT PARAMETER
    public RoomRental (){
        customerName = null;
        contactNo = null;
        roomType = null;
        startDate = null;
        endDate = null;
        quantityRoom = 0;
    }
    
    //CONSTRUCTOR WITH PARAMETER
    public RoomRental(String customerName, String contactNo, String roomType, Date startDate, Date endDate, int quantityRoom){
        this.customerName = customerName;
        this.contactNo = contactNo;
        this.roomType = roomType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.quantityRoom = quantityRoom;
    }

    public double FindPrice(int quantityRoom, int days, String roomType) {
        //LIST ROOM PRICE
        int roomPrice = 0;
        if (roomType.equalsIgnoreCase("Standard")) {
            roomPrice = 100;
        } else if (roomType.equalsIgnoreCase("Deluxe")) {
            roomPrice = 150;
        } else if (roomType.equalsIgnoreCase("Superior")) {
            roomPrice = 200;
        }

        //CALCULATION
        double price = (roomPrice * days) * quantityRoom;

        //DISCOUNT
        if (days > 2) {
            double discount = price * 0.05;
            price = price - discount;
        }

        return price;
    }
    
    //PROCESS FOR GETTING DIFFERENT DAYS BY TWO DATES
    public int CalculateDays(Date sDate, Date eDate) {
        long startDateMs = sDate.getTime();
        long endDateMs = eDate.getTime();
        int days = 0;
        long timedifferent = 0;
        if (startDateMs > endDateMs) {
            timedifferent = startDateMs - endDateMs;
        } else {
            timedifferent = endDateMs - startDateMs;
        }
        days = (int) (timedifferent / (1000 * 60 * 60 * 24));
        return days;
    }

    //MUTATOR
    public void setAllCustomerData(String customerName, String contactNo, String roomType, Date startDate, Date endDate, int quantityRoom) {
        this.customerName = customerName;
        this.contactNo = contactNo;
        this.roomType = roomType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.quantityRoom = quantityRoom;
    }

    //EACH MUTATOR
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setQuantityRoom(int quantityRoom) {
        this.quantityRoom = quantityRoom;
    }

    //ACCESSOR
    public String getCustomerName() {
        return customerName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public String getRoomType() {
        return roomType;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getQuantityRoom() {
        return quantityRoom;
    }
    
    public String toString(){
        String newstartdate = null;
        String newenddate = null;
        SimpleDateFormat newformat = new SimpleDateFormat("dd-MM-yyyy");
        newstartdate = newformat.format(startDate);
        newenddate = newformat.format(endDate);
        return "Name: " + customerName + "\nContact number: " + contactNo + "\nRoom type: " + roomType + "\nCheck in date: " + newstartdate + "\nCheck out date: " + newenddate + "\nRoom quantity: " + quantityRoom;
    }
}
