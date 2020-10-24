package com.fiveguys.www;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;



public class DrinksSelect{

	private static int pepsiNumber;
	
	public static JFrame frame;
	public static JTextArea receiptField;
	private static JButton pepsi;
	private static JButton coke;
	private static JButton water;
	private static JButton goBack;
	
	
	
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void DrinksGui() {

		frame = new JFrame("Pos System");
		frame.getContentPane().setBackground(new Color(173, 216, 230));
		frame.getContentPane().setLayout(null);
		frame.setSize(834,532);
		frame.setVisible(true);
		
			receiptField = new JTextArea();
			receiptField.setBackground(Color.LIGHT_GRAY);
			receiptField.setEditable(false);
			receiptField.setBounds(10, 35, 168, 447);
			frame.getContentPane().add(receiptField);
			
			JLabel itemsSelected = new JLabel("Items Selected");
			itemsSelected.setFont(new Font("Tahoma", Font.PLAIN, 25));
			itemsSelected.setBounds(10, 4, 168, 38);
			frame.getContentPane().add(itemsSelected);
		
			
			JButton Logout = new JButton("Logout");
			Logout.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ReceiptBuilder.logOut();
				GuiMenu.GuiLogin();
				frame.setVisible(false);}
			});
			Logout.setBounds(719, 12, 89, 23);
			frame.getContentPane().add(Logout);
			
			pepsi = new JButton("Pepsi");
			pepsi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					DrinksSelect set = new DrinksSelect();
					set.setPepsi();
					set.setReceipt();
					ReceiptBuilder.receipt();
				}
			});
			pepsi.setBounds(202, 36, 114, 48);
			frame.getContentPane().add(pepsi);
			
			coke = new JButton("Coke");
			coke.setBounds(326, 36, 114, 48);
			frame.getContentPane().add(coke);
			
			water = new JButton("20oz Water");
			water.setBounds(450, 36, 114, 48);
			frame.getContentPane().add(water);
			
			goBack = new JButton("Go Back");
			goBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					SelectionSrn select = new SelectionSrn();
					select.selectionGui();
					ReceiptBuilder.receipt();
					frame.setVisible(false);
				}
			});
			goBack.setBounds(681, 444, 127, 38);
			frame.getContentPane().add(goBack);
		
	}
	
	public void Drinks() {
	
			setPepsi();
		
			Drinks();
			//Selector.Select();


	}
	public void logout() {
		
		pepsiNumber=0;
	}
	private void setPepsi() {

		this.pepsiNumber++;
		
		
	}

	public  int getPepsi() {
		
       
		return pepsiNumber;
		
	}
	public  void setReceipt() {
		String x=Integer.toString(getPepsi());
		
		receiptField.setText(String.valueOf("Pepsi="+x));
		
		
	}
}


