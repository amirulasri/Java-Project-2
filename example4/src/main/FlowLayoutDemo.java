/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author amiru
 */
public class FlowLayoutDemo extends JFrame implements ActionListener {

    private JLabel lblNum1, lblNum2, lblTotal;
    private JTextField txtNum1, txtNum2, txtTotal;
    private JButton btnCalc, btnExt;
    private Container cont;
    private FlowLayout layout;

    public FlowLayoutDemo() {
        super("ADDITION");
        layout = new FlowLayout();
//get content pane and set its layout
        cont = getContentPane();
        cont.setLayout(layout);
//set up Label
        lblNum1 = new JLabel("Enter first number :");
        lblNum2 = new JLabel("Enter second number:");
        lblTotal = new JLabel("Total :");
//set up textfield
        txtNum1 = new JTextField(7);
        txtNum2 = new JTextField(7);
        txtTotal = new JTextField(7);
//set up button
        btnCalc = new JButton("CALCULATE");
        btnExt = new JButton("EXIT");
//add to Container
        cont.add(lblNum1);
        cont.add(txtNum1);
        cont.add(lblNum2);
        cont.add(txtNum2);
        cont.add(lblTotal);
        cont.add(txtTotal);
        cont.add(btnCalc);
        cont.add(btnExt);
//register listener
        btnCalc.addActionListener(this);
        btnExt.addActionListener(this);
        setSize (250, 175);
        setVisible (true);
        setDefaultCloseOperation (EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(txtNum1.getText());
        int num2 = Integer.parseInt (txtNum2.getText());
        if (e.getSource() == btnCalc){
            int total = num1 + num2;
            txtTotal.setText (" " + total);
        }else{
            System.exit(0);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
        FlowLayoutDemo demo = new FlowLayoutDemo();
    }

}
