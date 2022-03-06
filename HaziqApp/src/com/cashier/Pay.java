package com.cashier;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;
import java.awt.Color;

public class Pay {
	private JTextField txtPayment;
	private DefaultTableModel table_model;
	private String selectedMeals;
	private JTable table_order;
	private JLabel lblSubTotalOutputY,lblTotalItemOutputY,lblSubBalanceOutput,lblSubTotalOutput;
	private Float PaymentBalance;
	private JTextArea txtRemark;
	private JRadioButton rdbtnCreditCard,rdbtnCash,rdbtnEwallet ;

	
	Pay(DefaultTableModel table_modelx,JTable table_orderx,JLabel lblSubTotalOutputx,JLabel lblTotalItemOutputx){	
	
		table_model = table_modelx;
		table_order = table_orderx;
		lblSubTotalOutputY = lblSubTotalOutputx;
		lblTotalItemOutputY = lblTotalItemOutputx;
		runUIPay();
	}
	public void runUIPay() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setLayout(null);
		frame.setTitle("LOGIN PAGE");
		
		frame.getContentPane().add(panel);
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setForeground(new Color(0, 128, 128));
		lblSubTotal.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblSubTotal.setBounds(49, 19, 146, 38);
		panel.add(lblSubTotal);
		
		
		JLabel lblPayAmount = new JLabel("Pay Amount");
		lblPayAmount.setForeground(new Color(205, 92, 92));
		lblPayAmount.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblPayAmount.setBounds(49, 58, 146, 41);
		panel.add(lblPayAmount);
		
		rdbtnCreditCard = new JRadioButton("Credit Card");
		rdbtnCreditCard.setBounds(236, 123, 141, 23);
		panel.add(rdbtnCreditCard);
		
		rdbtnCash = new JRadioButton("Cash");
		rdbtnCash.setBounds(412, 123, 141, 23);
		panel.add(rdbtnCash);
		
		rdbtnEwallet = new JRadioButton("E-Wallet");
		rdbtnEwallet.setBounds(561, 123, 141, 23);
		panel.add(rdbtnEwallet);
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnCreditCard);
		group.add(rdbtnCash);
		group.add(rdbtnEwallet);
		
		txtRemark = new JTextArea();
		txtRemark.setBounds(236, 160, 412, 98);
		panel.add(txtRemark);
		
		JLabel lblRemark = new JLabel("Remark");
		lblRemark.setBounds(49, 171, 119, 20);
		panel.add(lblRemark);
		
		lblSubTotalOutput = new JLabel(lblSubTotalOutputY.getText().toString());
		lblSubTotalOutput.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblSubTotalOutput.setBounds(236, 23, 193, 30);
		panel.add(lblSubTotalOutput);
		
		JButton btnPay = new JButton("Pay");
		btnPay.setFont(new Font("Lucida Grande", Font.BOLD, 31));
		btnPay.setForeground(new Color(0, 128, 128));
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//jb.jbx.setText("hello");
				calculateBalance();
				
			
			}
		});
		btnPay.setBounds(66, 353, 141, 55);
		panel.add(btnPay);
		JButton btnPrintReceipt = new JButton("Print Receipt");
		btnPrintReceipt.setFont(new Font("Lucida Grande", Font.BOLD, 31));
		btnPrintReceipt.setForeground(new Color(0, 128, 228));
		btnPrintReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//jb.jbx.setText("hello");
				String paymentType = "UNDEFINED";
				if(rdbtnCreditCard.isSelected()){
					paymentType = "CREDIT CARD";					
				}else if(rdbtnCash.isSelected()) {
					paymentType = "CASH";
				}else if(rdbtnEwallet.isSelected()){
					paymentType = "E-WALLET";
				}
				PrintReceipt prnt = new PrintReceipt(table_model,table_order,lblSubTotalOutputY,lblTotalItemOutputY,txtRemark.getText(),lblSubBalanceOutput.getText(),txtPayment.getText(),paymentType);
				frame.setVisible(false);
			
			}
		});
		btnPrintReceipt.setBounds(228, 353, 227, 55);
		panel.add(btnPrintReceipt);
		
		
		txtPayment = new JTextField();
		txtPayment.setFont(new Font("Lucida Grande", Font.PLAIN, 26));
		txtPayment.setBounds(230, 55, 209, 45);
		panel.add(txtPayment);
		txtPayment.setColumns(10);
		
		JLabel lblPayAmountMode = new JLabel("Payment Type");
		lblPayAmountMode.setForeground(Color.BLUE);
		lblPayAmountMode.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblPayAmountMode.setBounds(49, 111, 170, 41);
		panel.add(lblPayAmountMode);
		
		frame.setTitle("Pay");
		frame.setLocation(new Point(500, 300));
		frame.getContentPane().add(panel);
		
		JLabel lblSubBalance = new JLabel("Balance");
		lblSubBalance.setForeground(new Color(0, 128, 128));
		lblSubBalance.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblSubBalance.setBounds(49, 273, 146, 38);
		panel.add(lblSubBalance);
		
		lblSubBalanceOutput = new JLabel("0.00");
		lblSubBalanceOutput.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblSubBalanceOutput.setBounds(236, 277, 193, 30);
		panel.add(lblSubBalanceOutput);
		frame.setSize(new Dimension(800, 500));
		
		frame.setVisible(true);
		
	}
	//calculate balance after pay
	public void calculateBalance() {
	 
		try {
			PaymentBalance =  Float.parseFloat(lblSubTotalOutput.getText()) - Float.parseFloat(txtPayment.getText());
			lblSubBalanceOutput.setText(String.format("%.2f",PaymentBalance));
		}catch (Exception e) {
	      System.out.println("Something went wrong in calculate balance");
	    } finally {
	      //System.out.println("Error Try Caculate Balance");
	    }
	
		
		
	}
}

