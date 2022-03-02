/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author amiru
 */
public class FileOutput {
    public static void main(String[] args) {
        try {
            FileWriter fw1 = new FileWriter("odd.txt");
            FileWriter fw2 = new FileWriter("even.txt");
            
            BufferedWriter bw1 = new BufferedWriter(fw1);
            BufferedWriter bw2 = new BufferedWriter(fw2);
            
            PrintWriter pw1 = new PrintWriter(bw1);
            PrintWriter pw2 = new PrintWriter(bw2);
            
            for (int k = 0; k < 5; k++) {
                String num = JOptionPane.showInputDialog("Enter a number");
                int number = Integer.parseInt(num);
                if (number%2==0){
                    pw2.println(number);
                }else{
                    pw1.println(number);
                }
            }
            JOptionPane.showMessageDialog(null, "Your number have been into text file");
            pw1.close();
            pw2.close();
        } catch (FileNotFoundException fnf) {
            System.out.println(fnf.getMessage());
        } catch (EOFException eof){
            System.out.println(eof.getMessage());
        } catch (IOException io){
            System.out.println(io.getMessage());
        } catch (Exception nf){
            System.out.println(nf.getMessage());
        }
    }
}
