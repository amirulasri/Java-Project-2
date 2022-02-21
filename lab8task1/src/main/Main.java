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
        int eventselector;

        Scanner userinput = new Scanner(System.in);
        DecimalFormat priceformatter = new DecimalFormat("#0.00");

        Tailor T[] = new Tailor[20];
        System.out.println("---Welcome! Enter all details needed---");
        for (int i = 0; i < T.length; i++) {

            System.out.println("++++++++ Enter details for customer " + (i + 1) + " ++++++++");
            System.out.print("Choose Type (Customer " + (i + 1) + "):- \n1. Dress \n2. Curtain \nSelect by number: ");
            eventselector = userinput.nextInt();
            userinput.nextLine();
            if (eventselector == 1) {
                System.out.println("=Dress selected=\n");
            } else {
                System.out.println("=Curtain selected=\n");
            }
            System.out.print("Name: ");
            custName = userinput.nextLine();
            System.out.print("Phone number: ");
            custNo = userinput.nextLine();
            System.out.print("Regular customer - 1 (15% off) / New customer - 2 (Enter only number): ");
            custType = userinput.next().charAt(0);
            userinput.nextLine();
            System.out.print("Date (dd/mm/yyyy): ");
            date = userinput.nextLine();

            if (eventselector == 1) {
                System.out.print("Select Dress Type:- \n1. Kebaya (Non silk - RM 40) (Silk - RM 80) \n2. Kurung (Non silk - RM 25) (Silk - RM 50)\n3. Jubah (Non silk - RM 50) (Silk - RM 100)\nSelect by number: ");
                dresschooser = userinput.nextInt();
                if (dresschooser == 1) {
                    dressType = "Kebaya";
                } else if (dresschooser == 2) {
                    dressType = "Kurung";
                } else if (dresschooser == 3) {
                    dressType = "Jubah";
                }
                System.out.print("Is the dress silk? (Yes/No): ");
                silkchooser = userinput.next();
                if (silkchooser.equalsIgnoreCase("Yes") || silkchooser.equalsIgnoreCase("y")) {
                    silk = true;
                } else {
                    silk = false;
                }

                T[i] = new Dress(custNo, custName, date, custType, dressType, silk);
            } else {
                System.out.print("Number of Windows (RM 45 per piece): ");
                windows = userinput.nextInt();
                System.out.print("Number of doors (RM 55 per piece): ");
                doors = userinput.nextInt();
                userinput.nextLine();

                T[i] = new Curtain(custNo, custName, date, custType, windows, doors);
            }
            System.out.println();
        }

        //DISPLAY ALL OBJECTS
        System.out.println("\n\n\nAll data displayed here!");

        System.out.println("\n==Dress Data==");
        for (int i = 0; i < T.length; i++) {
            if (T[i] instanceof Dress) {
                System.out.println("--Customer " + (i + 1) + "--");
                System.out.println(T[i].toString());
                System.out.println("Total Charges: RM" + priceformatter.format(T[i].calCharges()));
                System.out.println();
            }
        }

        System.out.println("\n==Curtain Data==");
        for (int i = 0; i < T.length; i++) {
            if (T[i] instanceof Curtain) {
                System.out.println("--Customer " + (i + 1) + "--");
                System.out.println(T[i].toString());
                System.out.println("Total Charges: RM" + priceformatter.format(T[i].calCharges()));
                System.out.println();
            }
        }
    }
}
