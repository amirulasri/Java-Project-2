/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author amiru
 */
public class TestingTwoD {
    public static void main(String[] args) {
        String strWidth, strLen, strChoice, strRadius;
        double w, l, r;
        int c;
        
        Rectangle rec = new Rectangle();
        Circle cir = new Circle();
        
        TwoD t[] = new TwoD[5];
        
        for(int i = 0; i < 5; i++){
            strChoice = JOptionPane.showInputDialog("Your choice (1/2): ");
            c = Integer.parseInt(strChoice);
            
            if(c == 1){
                strWidth = JOptionPane.showInputDialog("Input width: ");
                strLen = JOptionPane.showInputDialog("Input length: ");
                
                w = Double.parseDouble(strWidth);
                l = Double.parseDouble(strLen);
                
                rec.setWidth(w);
                rec.setLength(l);
                
                rec.calculateArea();
                rec.calculatePerimeter();
                t[i] = rec;
            }else{
                strRadius = JOptionPane.showInputDialog("Input radius: ");
                r = Double.parseDouble(strRadius);
                cir.setRadius(r);
                cir.calculateArea();
                cir.calculatePerimeter();
                t[i] = cir;
            }
        }
        for(int i = 0; i < 5; i++){
            System.out.println(t[i].display() + "\n");
        }
    }
}
