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
        int numOfGuest;
        int menuType;
        boolean pelamin;
        String style = null;
        String theme = null;
        boolean clown;
        String pelaminchooser;
        String clownchooser;
        int stylechooser;
        int themechooser;
        int eventselector;

        Scanner userinput = new Scanner(System.in);
        DecimalFormat priceformatter = new DecimalFormat("#0.00");

        Event[] event = new Event[6];
        System.out.println("---Welcome!---");
        for (int i = 0; i < event.length; i++) {
            System.out.println("++++++++ Enter details for customer " + (i + 1) + " ++++++++");
            System.out.print("Choose Event (Customer "+(i+1)+"):- \n1. Wedding \n2. Birthday \nSelect by number: ");
            eventselector = userinput.nextInt();
            userinput.nextLine();
            if (eventselector == 1) {
                System.out.println("=Wedding selected=\n");
            } else {
                System.out.println("=Birthday selected=\n");
            }
            System.out.print("Name: ");
            custName = userinput.nextLine();
            System.out.print("Number of guest: ");
            numOfGuest = userinput.nextInt();
            System.out.print("Menu type (1 - RM10, 2 - RM20, 3 - RM30): ");
            menuType = userinput.nextInt();

            if (eventselector == 1) {
                System.out.print("Choose Wedding Style:- \n1. Garden (RM 3000) \n2. Modern (RM 3500) \n3. Traditional (RM 2000) \nSelect by number: ");
                stylechooser = userinput.nextInt();
                if (stylechooser == 1) {
                    style = "Garden";
                } else if (stylechooser == 2) {
                    style = "Modern";
                } else if (stylechooser == 3) {
                    style = "Traditional";
                }
                System.out.print("Included pelamin? - RM 1500 (Yes/No): ");
                pelaminchooser = userinput.next();
                if (pelaminchooser.equalsIgnoreCase("Yes") || pelaminchooser.equalsIgnoreCase("y")) {
                    pelamin = true;
                } else {
                    pelamin = false;
                }

                event[i] = new Wedding(custName, numOfGuest, menuType, pelamin, style);
            } else {
                System.out.print("Choose Birthday Theme:- \n1. Anime (RM 400) \n2. Superhero (RM 300) \n3. Barbie (RM 450) \nSelect by number: ");
                themechooser = userinput.nextInt();
                if (themechooser == 1) {
                    theme = "Anime";
                } else if (themechooser == 2) {
                    theme = "Superhero";
                } else if (themechooser == 3) {
                    theme = "Barbie";
                }
                System.out.print("Included clown service? RM 200 (Yes/No): ");
                clownchooser = userinput.next();
                if (clownchooser.equalsIgnoreCase("Yes") || clownchooser.equalsIgnoreCase("y")) {
                    clown = true;
                } else {
                    clown = false;
                }

                event[i] = new Birthday(custName, numOfGuest, menuType, theme, clown);
            }
            System.out.println();
        }
        
        //DISPLAY ALL OBJECTS
        System.out.println("\n\n\nAll data displayed here!");
        
        System.out.println("\n==Wedding Data==");
        for (int i = 0; i < event.length; i++) {
            if(event[i] instanceof Wedding){
                System.out.println("--Customer " + (i + 1) + "--");
                System.out.println(event[i].toString());
                System.out.println("Total Price: RM" + priceformatter.format(event[i].calPayment()));
                System.out.println();
            }
        }
        
        System.out.println("\n==Birthday Data==");
        for (int i = 0; i < event.length; i++) {
            if(event[i] instanceof Birthday){
                System.out.println("--Customer " + (i + 1) + "--");
                System.out.println(event[i].toString());
                System.out.println("Total Price: RM" + priceformatter.format(event[i].calPayment()));
                System.out.println();
            }
        }
    }
}
