import java.util.*;
import java.time.LocalDate;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

public class RoomRentalApp {

    public static void main(String[] args) throws ParseException {

        String dateStartInputs, dateEndInputs;
        LocalDate outDate = null;
        LocalDate inDate = null;
        Scanner in = new Scanner(System.in);

        RoomRental[] rentalArr = new RoomRental[10];
        for (int i = 0; i < rentalArr.length; i++) {
            rentalArr[i] = new RoomRental();

            RoomRental x = new RoomRental();

            String customerName, contactNo, roomType;
            LocalDate startDate, endDate;
            int quantityRoom;

            System.out.print("\nEnter customer name: ");
            customerName = in.nextLine();

            System.out.print("Enter contact no: ");
            contactNo = in.nextLine();

            System.out.print("Enter room type: ");
            roomType = in.nextLine();

            System.out.print("Enter quantity room: ");
            quantityRoom = in.nextInt();

            System.out.print("Enter start dd/MM/yyyy: ");
            dateStartInputs = in.next();

            System.out.print("Enter end dd/MM/yyyy: ");
            dateEndInputs = in.next();
            in.nextLine();
            //CONVERT TO DATE
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            inDate = LocalDate.parse(dateStartInputs, formatter);
            outDate = LocalDate.parse(dateEndInputs, formatter);
            

            rentalArr[i].setRoomRental(customerName, contactNo, roomType, inDate, outDate, quantityRoom);
        }

        for (int i = 0; i < rentalArr.length; i++) {

            System.out.println("customer" + (i + 1) + "");
            System.out.println(rentalArr[i].toString());

            LocalDate startDate = rentalArr[i].getstartDate();
            LocalDate endDate = rentalArr[i].getendDate();
            int calculateDays = rentalArr[i].CalculateDays(startDate, endDate);
            String roomType = rentalArr[i].getroomType();
            int quantityRoom = rentalArr[i].quantityRoom();
            double findPrice = rentalArr[i].findPrice(roomType, calculateDays, quantityRoom);
        }
    }
}
