package com.cashier;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WinBuilder {
	WinBuilder(){
		initGUI();
			
	}
	private void initGUI() {
		JFrame window = new JFrame();
		JPanel mainframe = new JPanel();

		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(0,0,200,200);

		JButton jb = new JButton();
		jb.setText("Login");

		mainframe.add(jb);

		JTextField link = new JTextField(50);
		mainframe.add(link);

		window.getContentPane().add(mainframe);
		window.pack();
		window.setVisible(true);
		
	}

}
