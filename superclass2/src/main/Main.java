package main;

import java.util.Scanner;

/**
 *
 * @author amiru
 */
public class Main {
    public static void main(String[] args) {
        
        String size;
        boolean pillow = false;
        double pillowprice = 0;
        String pillowprompt;
        
        BedCloth[] bedclothArr = new BedCloth[6];
        
        Scanner userinput = new Scanner(System.in);
        for (int i = 0; i < bedclothArr.length; i++){
            System.out.println("---Data " + (i+1) + "---");
            bedclothArr[i] = new BedCloth();
            System.out.print("Enter Bed Size: ");
            size = userinput.next();
            System.out.print("Do you want a pillowcase?(y/N): ");
            pillowprompt = userinput.next();
            if(pillowprompt.equalsIgnoreCase("y")){
                pillow = true;
            }else{
                pillow = false;
            }
            bedclothArr[i].setallbedclothdata(size, pillow);
            
        }
        
        System.out.println("--ALL STORED DATA DISPLAYED HERE--");
        double totalpayment;
        for (int i = 0; i < bedclothArr.length; i++){
            System.out.println(bedclothArr[i].toString());
            if(bedclothArr[i].getpillow() == true){
                pillowprice = 50.00;
            }else{
                pillowprice = 0;
            }
            totalpayment = bedclothArr[i].payment(bedclothArr[i].getsize()) + pillowprice;
            System.out.println("Payment: " + totalpayment);
            System.out.print("\n");
        }
        
        int count = 0;
        for (int i = 0; i < bedclothArr.length; i++){
            if((bedclothArr[i].getpillow() == true) && (bedclothArr[i].getsize().equalsIgnoreCase("Queen"))){
                count = count+1;
            }
        }
        System.out.println("Number of BedCloth object of set queen size with pillowcases: " + count);
    }
}
