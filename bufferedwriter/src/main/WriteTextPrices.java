package main;
import java.io.*;
import java.util.*;


public class WriteTextPrices {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter("food.txt", true);
        
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        
        System.out.print("Enter product: ");
        String product = sc.nextLine();
        System.out.print("Enter price RM: ");
        double price = sc.nextDouble();
        
        pw.println(product + " " + "RM " + price);
        
        pw.close();
    }
}
