/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import javax.swing.*;

/**
 *
 * @author amiru
 */
public class TestFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test Frame");
        frame.setSize(300, 150);
        frame.setVisible(true);
        frame.getContentPane().add(new JButton("OK"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
