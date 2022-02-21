/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 *
 * @author amiru
 */
class MarketFrame extends JFrame implements ActionListener, ItemListener {

    private JLabel lblQuantity, lblPrice, lblDisRate, lblDiscount, lblTotalPrice;
    private JTextField txtQuantity, txtPrice, txtDiscount, txtTotalPrice;
    private JRadioButton btn10, btn15;
    private ButtonGroup radioGroup;
    private JButton btnProcess, btnExit, btnClear;
    private JPanel pnlN, pnlC, pnlE, pnlX, pnlProdInfo, pnlOutput;

    public MarketFrame() {
        super("MY SUPERMARKET");
        Container cont = getContentPane();
        cont.setLayout(new BorderLayout());
        //set up label
        lblQuantity = new JLabel("Quantity bought :");
        lblPrice = new JLabel("Price per unit :");
        lblDisRate = new JLabel("Discount rate :");
        lblDiscount = new JLabel("Discount RM :");
        lblTotalPrice = new JLabel("Total price RM :");
        //set up textfield
        txtQuantity = new JTextField(10);
        txtPrice = new JTextField(10);
        txtDiscount = new JTextField(10);
        txtDiscount.setEditable(false);
        txtTotalPrice = new JTextField(10);
        txtTotalPrice.setEditable(false);
        //set up radio button
        btn10 = new JRadioButton("10%");
        btn15 = new JRadioButton("15%");
        radioGroup = new ButtonGroup();
        radioGroup.add(btn10);
        radioGroup.add(btn15);
        //set up button
        btnProcess = new JButton("PROCESS");
        btnExit = new JButton("EXIT");
        btnClear = new JButton("CLEAR");
        //set up JPanel
        pnlProdInfo = new JPanel();
        pnlProdInfo.setLayout(new GridLayout(2, 0));
        pnlProdInfo.setBorder(new TitledBorder(new EtchedBorder(), "Product Info"));

        pnlN = new JPanel();

        pnlN.setLayout(new GridLayout(2, 2));
        pnlC = new JPanel();
        pnlC.setLayout(new GridLayout(1, 3));
        pnlOutput = new JPanel();
        pnlOutput.setLayout(new GridLayout(1, 0));
        pnlOutput.setBorder(new TitledBorder(new EtchedBorder(), "Product Output"));

        pnlX = new JPanel();
        pnlX.setLayout(new GridLayout(2, 2));
        pnlE = new JPanel();
        pnlE.setLayout(new GridLayout(1, 3));
        pnlProdInfo.add(pnlN);
        pnlProdInfo.add(pnlC);
        pnlOutput.add(pnlX);
        //add to JPanel
        pnlN.add(lblQuantity);
        pnlN.add(txtQuantity);
        pnlN.add(lblPrice);
        pnlN.add(txtPrice);
        pnlC.add(lblDisRate);
        pnlC.add(btn10);
        pnlC.add(btn15);
        pnlX.add(lblDiscount);
        pnlX.add(txtDiscount);
        pnlX.add(lblTotalPrice);
        pnlX.add(txtTotalPrice);
        pnlE.add(btnProcess);
        pnlE.add(btnExit);
        pnlE.add(btnClear);
        //register itemListener
        btn10.addItemListener(this);
        btn15.addItemListener(this);
        //register actionListener
        btnProcess.addActionListener(this);
        btnExit.addActionListener(this);
        btnClear.addActionListener(this);
        //add to Container
        cont.add(pnlProdInfo, BorderLayout.NORTH);
        cont.add(pnlOutput, BorderLayout.CENTER);
        cont.add(pnlE, BorderLayout.SOUTH);
        setSize(350, 250);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        int quantity = Integer.parseInt(txtQuantity.getText());
        double price = Double.parseDouble(txtPrice.getText());
        double discount = Double.parseDouble(txtDiscount.getText());
        if (e.getSource() == btnProcess) {
            double payment = quantity * price - discount;
            txtTotalPrice.setText("" + payment);
        } else if (e.getSource() == btnClear) {
            txtQuantity.setText("");
            txtPrice.setText("");
            txtDiscount.setText("");
            txtTotalPrice.setText("");
        } else {
            System.exit(0);
        }
    }

    public void itemStateChanged(ItemEvent e) {
        int quantity = Integer.parseInt(txtQuantity.getText());
        double price = Double.parseDouble(txtPrice.getText());
        double discount = 0.0;
        if (e.getSource() == btn10) {
            discount = quantity * price * 0.10;
        } else {
            discount = quantity * price * 0.15;
        }
        txtDiscount.setText("" + discount);
    }

}

public class MarketApplication {

    public static void main(String[] args) {
        MarketFrame mr = new MarketFrame();
        mr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
