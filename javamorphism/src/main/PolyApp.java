package main;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amiru
 */
public class PolyApp {
    public static void main(String[] args) {
        PersonPoly p;
        EmployeePoly ep = new EmployeePoly("Khalif Ahmad", 23, "1122", 4000.00);
        StudentPoly sp = new StudentPoly("Gita Gutawa", 19, "3344", 3.68);
        
        p = ep;
        
        JOptionPane.showMessageDialog(null, "Example 1: \n"+p.toString());
        String out1 = p.getName();
        
        p = sp;
        JOptionPane.showMessageDialog(null, "Example 2: \n"+p.toString());
        String out2 = p.getName();
        
        JOptionPane.showMessageDialog(null, "Example 3: \n"+out1+"\n"+out2);
    }
}
