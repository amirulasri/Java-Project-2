/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 *
 * @author amiru
 */
public class BorderLayoutDemo extends JFrame {

    private JLabel lblNorth;
    private JCheckBox chkEast;
    private JRadioButton rdoCenter;
    private JButton btnWest;
    private JTextField txtSouth;
    private Container cont;
    private BorderLayout layout;

    public BorderLayoutDemo() {
        super("REGIONS");
        layout = new BorderLayout(10, 10);
        //get content pane and set its layout
        cont = getContentPane();
        cont.setLayout(layout);
        //set up label
        lblNorth = new JLabel("NORTH COMPONENT", SwingConstants.CENTER);

        chkEast = new JCheckBox("EAST COMPONENT");

        rdoCenter = new JRadioButton("CENTER COMPONENT");

        btnWest = new JButton("WEST COMPONENT");

        //set up text field
        txtSouth = new JTextField("SOUTH COMPONENT", 30);
        //add to container
        cont.add(lblNorth, BorderLayout.NORTH);
        cont.add(chkEast, BorderLayout.EAST);
        cont.add(rdoCenter, BorderLayout.CENTER);
        cont.add(btnWest, BorderLayout.WEST);
        cont.add(txtSouth, BorderLayout.SOUTH);

        setSize(500, 175);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        BorderLayoutDemo demo = new BorderLayoutDemo();
    }

}
