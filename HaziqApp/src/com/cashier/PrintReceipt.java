package com.cashier;

import java.awt.Dimension;
import java.awt.Point;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class PrintReceipt {
	private JTable table;
	private DefaultTableModel table_model;
	private String selectedMeals;
	private JTable table_order;
	private JLabel lblSubTotalOutputY,lblTotalItemOutputY,lblSubBalanceOutput;
	private Float PaymentBalance;
	private String paymentModeY,remarkY,totalBalanceY,totalPayY;

	PrintReceipt(DefaultTableModel table_modelx,JTable table_orderx,JLabel lblSubTotalOutputx,JLabel lblTotalItemOutputx,String remarkx,String totalBalancex,String totalPayx,String paymentModex){
		

		table_model = table_modelx;
		table_order = table_orderx;
		lblSubTotalOutputY = lblSubTotalOutputx;
		lblTotalItemOutputY = lblTotalItemOutputx;
		remarkY = remarkx;
		totalBalanceY = totalBalancex;
		totalPayY = totalPayx;
		paymentModeY = paymentModex;
		
		runUIReceipt();
	}
	public void runUIReceipt() {	
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		frame.setTitle("Print Receipt");
		frame.setLocation(new Point(500, 300));
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Payment Receipt");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.ITALIC, 15));
		lblNewLabel.setBounds(26, 6, 206, 16);
		panel.add(lblNewLabel);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 45, 753, 260);
		panel.add(scrollPane);
		
		//String column_names[]= {"Item","Quantity","Unit Price","Price"};
		//table_model =new DefaultTableModel(column_names,0);
		
		table = new JTable(table_model);
		scrollPane.setViewportView(table);
		
		JLabel lblSubTotal = new JLabel("Sub Total :");
		lblSubTotal.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		lblSubTotal.setBounds(626, 358, 64, 40);
		panel.add(lblSubTotal);
		
		JLabel lblSubTotalOutput = new JLabel(lblSubTotalOutputY.getText());
		lblSubTotalOutput.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		lblSubTotalOutput.setBounds(702, 358, 125, 40);
		panel.add(lblSubTotalOutput);
		
		JLabel lblTotalItem = new JLabel("Total Item :");
		lblTotalItem.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		lblTotalItem.setBounds(626, 328, 76, 40);
		panel.add(lblTotalItem);
		
		JLabel lblTotalItemOutput = new JLabel(lblTotalItemOutputY.getText());
		lblTotalItemOutput.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		lblTotalItemOutput.setBounds(703, 328, 43, 40);
		panel.add(lblTotalItemOutput);
		
		JLabel lblTotalPay = new JLabel("Total Pay :");
		lblTotalPay.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		lblTotalPay.setBounds(626, 390, 69, 40);
		panel.add(lblTotalPay);
		
		JLabel lblPaymentBy = new JLabel("Payment By:");
		lblPaymentBy.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblPaymentBy.setBounds(26, 317, 97, 40);
		panel.add(lblPaymentBy);
		
		JLabel lblPrintedOn = new JLabel("Printed On : ");
		lblPrintedOn.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblPrintedOn.setBounds(26, 357, 105, 40);
		panel.add(lblPrintedOn);
		
		JLabel lblBalance_1 = new JLabel("Balance:");
		lblBalance_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBalance_1.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		lblBalance_1.setBounds(621, 432, 69, 40);
		panel.add(lblBalance_1);
		
		JLabel lblTotalPayOutput = new JLabel(totalPayY);
		lblTotalPayOutput.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		lblTotalPayOutput.setBounds(702, 390, 139, 40);
		panel.add(lblTotalPayOutput);
		
		JLabel lblBalanceOutput = new JLabel(totalBalanceY);
		lblBalanceOutput.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		lblBalanceOutput.setBounds(702, 432, 139, 40);
		panel.add(lblBalanceOutput);
		
		JLabel lblRemark = new JLabel("Remark : ");
		lblRemark.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblRemark.setBounds(26, 412, 84, 40);
		panel.add(lblRemark);
		
		JLabel lblPaymentByOutput = new JLabel(paymentModeY);
		lblPaymentByOutput.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblPaymentByOutput.setBounds(148, 317, 84, 40);
		panel.add(lblPaymentByOutput);
		
		JLabel lblRemarkOutput = new JLabel(remarkY);
		lblRemarkOutput.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblRemarkOutput.setBounds(148, 412, 84, 40);
		panel.add(lblRemarkOutput);
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
		
		JLabel lblPrintedOnOutput = new JLabel(formatter.format(date));
		lblPrintedOnOutput.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblPrintedOnOutput.setBounds(143, 357, 248, 40);
		panel.add(lblPrintedOnOutput);
		frame.setSize(new Dimension(800, 500));
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}
}
