package com.cashier;

import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class Dashboard {
	private JTextField textField;
	private JTextField textField_1;
	private static JLabel password1;
	private static JTextField username;
	private static JButton button;
	private static JPasswordField Password;
	private JTable table;
	private DefaultTableModel table_model;
	private JLabel lblSubTotalOutput,lblTotalItemOutput;
	
	Dashboard(){
		vDashboard();
	}
	public void vDashboard() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 248, 255));
		panel.setLayout(null);
		
		frame.setTitle("Order List");
		frame.setLocation(new Point(10, 10));
		frame.getContentPane().add(panel);
		
		JButton btnAddItem = new JButton("Add Item");
		btnAddItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Product product = new Product(table_model,table,lblSubTotalOutput,lblTotalItemOutput);
				
				
			}
		});
		btnAddItem.setFont(new Font("Lucida Grande", Font.BOLD, 19));
		btnAddItem.setForeground(Color.GREEN);
		btnAddItem.setBackground(new Color(128, 0, 128));
		btnAddItem.setBounds(812, 97, 117, 94);
		panel.add(btnAddItem);
		
		JButton btnPay = new JButton("Pay");
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Pay pay = new Pay(table_model,table,lblSubTotalOutput,lblTotalItemOutput);
				
			}
		});
		btnPay.setBounds(812, 203, 117, 79);
		panel.add(btnPay);
		
		JButton btnPrint = new JButton("New Customer");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newcustomer();
				
			}
		});
		btnPrint.setBounds(812, 294, 117, 79);
		panel.add(btnPrint);
		
		JLabel lblSubTotal = new JLabel("Sub Total :");
		lblSubTotal.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblSubTotal.setBounds(26, 396, 139, 40);
		panel.add(lblSubTotal);
		
		JLabel lblPointOfSales = new JLabel("Cash Sale System");
		lblPointOfSales.setFont(new Font("Lucida Grande", Font.PLAIN, 36));
		lblPointOfSales.setForeground(Color.RED);
		lblPointOfSales.setBounds(27, 6, 602, 51);
		panel.add(lblPointOfSales);
		
		JPanel panelTitle = new JPanel();
		panelTitle.setBackground(Color.ORANGE);
		panelTitle.setBounds(6, 6, 988, 66);
		panel.add(panelTitle);
		
		//lable sub total
		lblSubTotalOutput = new JLabel("0.00");
		lblSubTotalOutput.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblSubTotalOutput.setBounds(163, 396, 125, 40);
		panel.add(lblSubTotalOutput);
		
		
		JLabel lblTotalItem = new JLabel("Total Item :");
		lblTotalItem.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblTotalItem.setBounds(279, 396, 153, 40);
		panel.add(lblTotalItem);
		
		//lable jumlah item
		lblTotalItemOutput = new JLabel("0");
		lblTotalItemOutput.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblTotalItemOutput.setBounds(444, 396, 43, 40);
		panel.add(lblTotalItemOutput);
		
		JLabel lblOrderList = new JLabel("Order List");
		lblOrderList.setForeground(new Color(128, 0, 128));
		lblOrderList.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblOrderList.setBounds(26, 84, 139, 40);
		panel.add(lblOrderList);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 124, 753, 260);
		panel.add(scrollPane);
		
		
		String column_names[]= {"Item","Quantity","Unit Price","Price"};
		 table_model =new DefaultTableModel(column_names,0);
		
		table = new JTable(table_model);
		scrollPane.setViewportView(table);
		frame.setSize(new Dimension(1000, 500));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		frame.setVisible(true);
	}
	/* reset all item and table */
	public void newcustomer() {
		lblTotalItemOutput.setText("0");
		lblSubTotalOutput.setText("0");
		DefaultTableModel table_model = (DefaultTableModel) table.getModel();
		table_model.setRowCount(0);
		
		//table.add(table_model);
		
		
	}
	
}

