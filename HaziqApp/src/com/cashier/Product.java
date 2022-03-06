package com.cashier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Product {
	private JTextField txtUnitPrice;
	private JLabel lblMeals; 
	private JComboBox cboMeals; //jenis makanan / minuman
	private JComboBox cboQuantity;
	private float glUnitPrice;
	private float glSubTotal;
	private int glQuantity;
	private float glDiscount;
	private String member;
	private JCheckBox chkMember;
	private JLabel lblTotalPriceOutput;
	private Map<String, String> mapPrice = new HashMap<>();
	private DefaultTableModel table_model;
	private String selectedMeals;
	private JTable table_order;
	private JLabel lblSubTotalOutput,lblTotalItemOutput;
	
	Product(DefaultTableModel table_modelx,JTable table_orderx,JLabel lblSubTotalOutputx,JLabel lblTotalItemOutputx){
		
		show();
		//setting price 
		settingPrice();
		table_model = table_modelx;
		table_order = table_orderx;
		lblSubTotalOutput = lblSubTotalOutputx;
		lblTotalItemOutput = lblTotalItemOutputx;
		
	}
	/* open form */
	public void show() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 196, 222));
		
		panel.setLayout(null);
		frame.setTitle("Add Item");
		frame.setLocation(new Point(500, 300));
		frame.getContentPane().add(panel);
		frame.setSize(new Dimension(700, 300));
		//butang add item
		JButton btnAddItem = new JButton("Add Item");
		btnAddItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bindToDashboard();
			}
		});
		btnAddItem.setFont(new Font("Lucida Grande", Font.BOLD, 19));
		btnAddItem.setForeground(new Color(255, 0, 0));
		btnAddItem.setBackground(new Color(128, 0, 128));
		btnAddItem.setBounds(283, 228, 115, 42);
		panel.add(btnAddItem);
		String[] choices = { "NASI LEMAK", "NASI GORENG", "TEA AIS", "MILO AIS",
                 "LAICIKAN", "KUE TEOW GORENG" };
		cboMeals = new JComboBox(choices);
		cboMeals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		cboMeals.setBounds(156, 45, 261, 27);
		panel.add(cboMeals);
		
		//input type
		String[] quantity = { "1", "2", "3", "4",
                "5", "6" };
		cboQuantity = new JComboBox(quantity);
		cboQuantity.setBounds(156, 88, 261, 27);
		panel.add(cboQuantity);
		
		lblMeals = new JLabel("Meals");
		lblMeals.setBounds(27, 49, 98, 16);
		panel.add(lblMeals);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setBounds(27, 92, 98, 16);
		panel.add(lblQuantity);
		
		txtUnitPrice = new JTextField();
		txtUnitPrice.setBounds(156, 127, 130, 26);
		panel.add(txtUnitPrice);
		txtUnitPrice.setColumns(10);
		
		JLabel lblUnitPrice = new JLabel("Unit Price");
		lblUnitPrice.setBounds(27, 132, 98, 16);
		panel.add(lblUnitPrice);
		
		chkMember = new JCheckBox("Member Price (10 % Disc)");
		chkMember.setBounds(156, 165, 204, 23);
		panel.add(chkMember);
		
		JLabel lblTotalPrice = new JLabel("Total Price");
		lblTotalPrice.setBounds(27, 193, 98, 16);
		panel.add(lblTotalPrice);
		
		lblTotalPriceOutput = new JLabel("0.00");
		lblTotalPriceOutput.setBounds(166, 200, 104, 16);
		panel.add(lblTotalPriceOutput);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculateTotal();
			}
		});
		btnCalculate.setForeground(new Color(0, 0, 205));
		btnCalculate.setFont(new Font("Lucida Grande", Font.BOLD, 19));
		btnCalculate.setBackground(new Color(128, 0, 128));
		btnCalculate.setBounds(156, 228, 115, 42);
		panel.add(btnCalculate);
			
		frame.setVisible(true);
	
	}
	/* calculate total price */
	public void calculateTotal() {
		//Dapatkan Pilihan Makanan
		try {
			selectedMeals = cboMeals.getSelectedItem().toString();
			
			//Dapatkan harga makanan
			if (mapPrice.containsKey(selectedMeals)){
				
				txtUnitPrice.setText(mapPrice.get(selectedMeals));
				glUnitPrice = Float.parseFloat(mapPrice.get(selectedMeals.toString())); //dapatkan unit price
				glQuantity = Integer.parseInt(cboQuantity.getSelectedItem().toString()); //dapatkan kuantiti
				if(chkMember.isSelected()) { //kalau member discount 3%
					glDiscount = (float) (glQuantity * glUnitPrice * 0.03); // kira discount
					glSubTotal = (float)((glQuantity * glUnitPrice) - glDiscount); //jumlah harga
					//lblTotalPriceOutput.setText(String.valueOf(glSubTotal));
					lblTotalPriceOutput.setText(String.format("%.2f",glSubTotal));
						 
				}else {
					glSubTotal = (float)(glQuantity * glUnitPrice);				
					lblTotalPriceOutput.setText(String.format("%.2f",glSubTotal));				
					        
					
				}
				
	        }
		} catch (Exception e) {
		      
		      JOptionPane.showMessageDialog(null, "Something went wrong in calculate Price");
		} finally {
		    
		      //JOptionPane.showMessageDialog(null, "Something went wrong in calculate Price ");
		}
		
		
		
	}
	/* setting price for every meals */
	public void settingPrice() {
		mapPrice.put("NASI LEMAK","5.00");
		mapPrice.put("NASI GORENG","5.50");
		mapPrice.put("TEA AIS","3.40");
		mapPrice.put("MILO AIS","2.00");
		mapPrice.put("LAICIKANG","4.00");
		mapPrice.put("KUE TEOW GORENG","5.00");
				
	}
	/* return back to dashboard */
	public void bindToDashboard() {
		//add row to table
		table_model.addRow(new Object[]{selectedMeals, glQuantity, String.format("%.2f",glUnitPrice),String.format("%.2f",glSubTotal)});
		float subtotal = 0;
		//calculate total item and subtotal
		 for (int i = 0; i < table_order.getRowCount(); i++) {  // Loop through the rows
	        // Record the 5th column value (index 4)
	        //columnData[i] = jTable1.getValueAt(i, 4); 
			 subtotal = subtotal + Float.parseFloat(table_order.getValueAt(i, 3).toString());
			 System.out.println(table_order.getValueAt(i, 3));
		 }
		 lblSubTotalOutput.setText(String.format("%.2f",subtotal));
		 lblTotalItemOutput.setText(String.valueOf(table_order.getRowCount()));
		
	}
}

