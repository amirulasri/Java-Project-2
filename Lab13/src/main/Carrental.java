package main;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.StringTokenizer;

public class Carrental {

    public static void main(String[] args) throws IOException {
        Formatter formatter;
        DecimalFormat priceformatter = new DecimalFormat("#0.00");
        try {
            BufferedReader br = new BufferedReader(new FileReader("CarRental.txt"));
            FileWriter fw = new FileWriter("PaymentBalance.txt");
            FileWriter fw2 = new FileWriter("Customer.txt");
            PrintWriter pw = new PrintWriter(fw);
            PrintWriter pw2 = new PrintWriter(fw2);
            String line = br.readLine();
            
            formatter = new Formatter();
            
            pw.println("\t\t\t\t\t\t\t\t\tFINAL PAYMENT");
            pw2.println("\t\t\t\tCUSTOMER");
            
            pw.println(formatter.format("%-40s %-20s %-20s %-20s %-10s %-10s %-15s %n", "CUSTOMER NAME", "IC NUMBER", "TYPE OF CAR", "NUMBER OF DAYS", "DEPOSIT", "TOTAL", "BALANCE"));
            formatter = new Formatter();
            pw2.println(formatter.format("%-40s %-20s %-20s %-20s %n", "CUSTOMER NAME", "IC NUMBER", "TYPE OF CAR", "BALANCE"));
            while (line != null) {
                //READ DATA EACH LINE
                StringTokenizer st = new StringTokenizer(line, ";");
                String name = st.nextToken();
                String icnumber = st.nextToken();
                int numberofdays = Integer.parseInt(st.nextToken());
                String carname = st.nextToken();
                double deposit = Double.parseDouble(st.nextToken());
                
                //GET A TOTAL
                double totalpayment = 0;
                double priceperday = 0;
                double balance = 0;
                if(carname.equalsIgnoreCase("Toyota Vellfire")){
                    priceperday = 750.0;
                }else if(carname.equalsIgnoreCase("Honda Civic")){
                    priceperday = 550.0;
                }else if(carname.equalsIgnoreCase("Proton Preve")){
                    priceperday = 300.0;
                }else if(carname.equalsIgnoreCase("Perodua MyVi")){
                    priceperday = 250.0;
                }
                totalpayment = numberofdays * priceperday;
                balance = totalpayment - deposit;

                //STORE INTO FILE
                formatter = new Formatter();
                pw.println(formatter.format("%-40s %-20s %-20s %-20s %-10s %-10s %-15s", name, icnumber, carname, numberofdays, deposit, priceformatter.format(totalpayment), priceformatter.format(balance)));
                
                if(balance > 1000){
                    formatter = new Formatter();
                    pw2.println(formatter.format("%-40s %-20s %-20s %-20s", name, icnumber, carname, priceformatter.format(balance)));
                }
                
                line = br.readLine();
            }
            pw.close();
            pw2.close();
            br.close();
        } catch (EOFException ex) {
            System.out.println("End of file error");
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } catch (IOException ex) {
            System.out.println("Wrong input!!!");
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
