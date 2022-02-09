package main;

import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author amirul asri
 */
public class Main {
    public static void main(String[] args) {
        String custName;
        String custNo;
        char custType;
        String date;
        String dressType = null;
        boolean silk;
        int windows;
        int doors;
        int dresschooser;
        String silkchooser;
        
        Scanner userinput = new Scanner(System.in);
        DecimalFormat priceformatter = new DecimalFormat();
        
        Tailor T[][] = new Tailor[20][2];
        System.out.println("Welcome!");
        for (int i = 0; i < T[0].length; i++) {
            System.out.println("++++++++ Enter details for customer "+ (i+1) +" ++++++++");
            System.out.print("Name: ");
            custName = userinput.nextLine();
            System.out.print("Phone number: ");
            custNo = userinput.nextLine();
            System.out.print("Regular customer - 1 / New customer - 2 (Enter only number): ");
            custType = userinput.next().charAt(0);
            userinput.nextLine();
            System.out.print("Date (dd/mm/yyyy): ");
            date = userinput.nextLine();
            System.out.println("\n+Enter Dress Detail (Customer "+(i+1)+")+");
            System.out.print("Select Dress Type:- \n1. Kebaya \n2. Kurung \n3. Jubah \nSelect by number: ");
            dresschooser = userinput.nextInt();
            if(dresschooser == 1){
                dressType = "Kebaya";
            }else if(dresschooser == 2){
                dressType = "Kurung";
            }else if(dresschooser == 3){
                dressType = "Jubah";
            }
            System.out.print("Is the dress silk? (Yes/No): ");
            silkchooser = userinput.next();
            if(silkchooser.equalsIgnoreCase("Yes") || silkchooser.equalsIgnoreCase("y")){
                silk = true;
            }else{
                silk = false;
            }
            System.out.println("\n+Enter Curtain Detail (Customer "+(i+1)+")+");
            System.out.print("Number of Windows: ");
            windows = userinput.nextInt();
            System.out.print("Number of doors: ");
            doors = userinput.nextInt();
            userinput.nextLine();
            
            T[i][0] = new Dress(custNo, custName, date, custType, dressType, silk);
            T[i][1] = new Curtain(custNo, custName, date, custType, windows, doors);
            System.out.println();
        }
        
        //DISPLAY ALL OBJECTS
        System.out.println("\n\n\nAll data displayed here!");
        
        System.out.println("\n==Dress Data==");
        for (int i = 0; i < T[0].length; i++) {
            System.out.println("--Customer " + (i+1) + "--");
            if(T[i][0] instanceof Dress){
                System.out.println(T[i][0].toString());
                System.out.println("Total Charges: RM"+priceformatter.format(T[i][0].calCharges()));
                System.out.println();
            }
        }
        
        System.out.println("\n==Curtain Data==");
        for (int i = 0; i < T[0].length; i++) {
            System.out.println("--Customer " + (i+1) + "--");
            if(T[i][1] instanceof Curtain){
                System.out.println(T[i][1].toString());
                System.out.println("Total Charges: RM"+priceformatter.format(T[i][1].calCharges()));
                System.out.println();
            }
        }
    }
}
