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
public class PanelDemo extends JFrame implements ActionListener {

    private JLabel lblNum1, lblNum2, lblAdd, lblDivide;
    private JTextField txtNum1, txtNum2, txtAdd, txtDivide;
    private JButton btnProcess, btnExit;
    private Container cont;
    private FlowLayout layout;
    private JPanel pnlNorth, pnlControl;

    //set up GUI
    public PanelDemo() {
        super("PANEL");
        layout = new FlowLayout();
        //get content pane and set its layout
        cont = getContentPane();
        cont.setLayout(layout);
        //set up label
        lblNum1 = new JLabel("Enter first number: ", SwingConstants.LEFT);
        lblNum2 = new JLabel("Enter second number: ", SwingConstants.LEFT);
        lblAdd = new JLabel("The value after added: ",
                SwingConstants.LEFT);
        lblDivide = new JLabel("The value after divided: ",
                SwingConstants.LEFT);
        //set up text field
        txtNum1 = new JTextField(15);
        txtNum2 = new JTextField(15);
        txtAdd = new JTextField(15);
        txtDivide = new JTextField(15);
        //set up panel
        pnlNorth = new JPanel();
        pnlNorth.setLayout(new GridLayout(4, 2));
        pnlControl = new JPanel();
        pnlControl.setLayout(new GridLayout(1, 2));
        //set up button
        btnProcess = new JButton("PROCESS");
        btnExit = new JButton("EXIT");
        //add to panel
        pnlNorth.add(lblNum1);
        pnlNorth.add(txtNum1);
        pnlNorth.add(lblNum2);
        pnlNorth.add(txtNum2);
        pnlNorth.add(lblAdd);
        pnlNorth.add(txtAdd);
        pnlNorth.add(lblDivide);
        pnlNorth.add(txtDivide);
        pnlControl.add(btnProcess);
        pnlControl.add(btnExit);
        //add to container
        cont.add(pnlNorth, "NORTH");
        cont.add(pnlControl, "SOUTH");
        //register listener
        btnProcess.addActionListener(this);
        btnExit.addActionListener(this);
        setSize(350, 150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(txtNum1.getText());
        double num2 = Double.parseDouble(txtNum2.getText());
        if (e.getSource() == btnProcess) {
            double sum = num1 + num2;
            double total = num1 / num2;
            txtAdd.setText(" " + sum);
            txtDivide.setText(" " + total);
        } else {
            System.exit(0);
        }
    }

    public static void main(String args[]) {
        PanelDemo demo = new PanelDemo();
    }
}
