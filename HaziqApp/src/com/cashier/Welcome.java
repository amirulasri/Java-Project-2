package com.cashier;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.*;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;


public class Welcome {
	private JTextField textField;
	private JTextField textField_1;
	private static JLabel password1, label;
	private static JTextField username;
	private static JButton button;
	private static JPasswordField Password;
	Welcome(){
		login();
	}
	public void login() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setLayout(null);

		label = new JLabel("Username");
		label.setForeground(Color.RED);
		label.setBounds(100, 70, 70, 20);
		panel.add(label);
		
		Password = new JPasswordField();
		Password.setBounds(100, 167, 193, 28);
		panel.add(Password);
		
		username = new JTextField();
		username.setBounds(100, 101, 193, 28);
		panel.add(username);
		frame.setTitle("LOGIN PAGE");
		frame.setLocation(new Point(300, 200));
		frame.getContentPane().add(panel);
		frame.setSize(new Dimension(500, 400));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		password1 = new JLabel("Password");
		password1.setForeground(Color.RED);
		password1.setBounds(100, 141, 70, 20);
		panel.add(password1);
		
		button = new JButton("Login");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Username = username.getText();
				String Password1 = Password.getText();
				/* validate login */
				if (Username.equals("admin") && Password1.equals("123")) {
					JOptionPane.showMessageDialog(null, "Login Successful");
					Dashboard dash = new Dashboard();
					frame.setVisible(false);
					
					
				}else {
					JOptionPane.showMessageDialog(null, "Username or Password mismatch ");
				}
			}
		});
		button.setBounds(100, 207, 90, 25);
		button.setForeground(Color.DARK_GRAY);
		button.setBackground(Color.BLACK);
		//button.addActionListener((ActionListener) new Welcome());
		panel.add(button);
		
		JLabel lblTitle = new JLabel("Welcome To POS System");
		lblTitle.setForeground(Color.ORANGE);
		lblTitle.setFont(new Font("Lucida Grande", Font.PLAIN, 26));
		lblTitle.setBounds(100, 19, 337, 39);
		panel.add(lblTitle);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setForeground(Color.ORANGE);
		panel_1.setBounds(0, 0, 500, 386);
		panel.add(panel_1);
		
		JLabel lblPleaseEnterUsername = new JLabel("Please Enter Username and Password To Access The System");
		lblPleaseEnterUsername.setForeground(Color.RED);
		panel_1.add(lblPleaseEnterUsername);
		lblPleaseEnterUsername.setVerticalAlignment(SwingConstants.BOTTOM);
		lblPleaseEnterUsername.setHorizontalAlignment(SwingConstants.LEFT);
		lblPleaseEnterUsername.setFont(new Font("Lucida Grande", Font.ITALIC, 9));
		
		ImageIcon icon = createImageIcon("/kindpng_697812.png",
                "a pretty but meaningless splat");
		int width = icon.getIconWidth() / 4;
	        int height = icon.getIconHeight() / 4;
		Image scaled = scaleImage(icon.getImage(), width, height);

        ImageIcon scaledIcon = new ImageIcon(scaled);
        
		
				JLabel lbIcon = new JLabel("Icon",scaledIcon, JLabel.CENTER);		
				lbIcon.setBounds(330, 100, 122, 92);
				panel_1.add(lbIcon);
		
		//window.pack();
		frame.setVisible(true);
		
		
	}
	protected ImageIcon createImageIcon(String path,
            String description) {
			java.net.URL imgURL = getClass().getResource(path);
			
			if (imgURL != null) {
				System.err.println("Exist: " + imgURL.toString());
				return new ImageIcon(imgURL, description);
			} else {
			System.err.println("Couldn't find file: " + path);
			return null;
			}
	}
	private Image scaleImage(Image image, int w, int h) {

        Image scaled = image.getScaledInstance(w, h, Image.SCALE_SMOOTH);

        return scaled;
    }
}

