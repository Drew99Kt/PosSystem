package com.fiveguys.www;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.SystemColor;

public class  SelectionSrn  {
		public static JFrame frame;
	/**
	 * @wbp.parser.entryPoint
	 */
		public static JTextArea receiptField;
	/**
	 * @wbp.parser.entryPoint
	 */
	public static  void selectionGui() {

			frame = new JFrame("Pos System");
			frame.getContentPane().setBackground(new Color(173, 216, 230));
			frame.getContentPane().setLayout(null);
			frame.setSize(834,532);
			
			
			 receiptField = new JTextArea();
			receiptField.setBackground(Color.LIGHT_GRAY);
			receiptField.setEditable(false);
			receiptField.setBounds(10, 35, 168, 447);
			frame.getContentPane().add(receiptField);
			
			JButton Logout = new JButton("Logout");
			Logout.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ReceiptBuilder.logOut();
				GuiMenu.GuiLogin();
				frame.setVisible(false);}
			});
			Logout.setBounds(719, 12, 89, 23);
			frame.getContentPane().add(Logout);
			
			JLabel itemsSelected = new JLabel("Items Selected");
			itemsSelected.setFont(new Font("Tahoma", Font.PLAIN, 25));
			itemsSelected.setBounds(10, 4, 168, 38);
			frame.getContentPane().add(itemsSelected);
			
			JButton drinks = new JButton("Drinks");
			drinks.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					DrinksSelect.DrinksGui();
					ReceiptBuilder.receipt();
					frame.setVisible(false);
					
				}
			});
			drinks.setFont(new Font("Tahoma", Font.PLAIN, 15));
			drinks.setBounds(205, 54, 102, 66);
			frame.getContentPane().add(drinks);
			
			JButton hamburger = new JButton("Hamburger");
			hamburger.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			hamburger.setFont(new Font("Tahoma", Font.PLAIN, 10));
			hamburger.setBounds(317, 54, 102, 66);
			frame.getContentPane().add(hamburger);
			
			JButton fries = new JButton("Fries");
			fries.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			fries.setFont(new Font("Tahoma", Font.PLAIN, 20));
			fries.setBounds(429, 54, 102, 66);
			frame.getContentPane().add(fries);
			
			JButton hotdogs = new JButton("HotDogs");
			hotdogs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			hotdogs.setFont(new Font("Tahoma", Font.PLAIN, 13));
			hotdogs.setBounds(541, 54, 102, 66);
			frame.getContentPane().add(hotdogs);
			
			JButton subs = new JButton("subs");
			subs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			subs.setFont(new Font("Tahoma", Font.PLAIN, 20));
			subs.setBounds(205, 131, 102, 66);
			frame.getContentPane().add(subs);
			frame.setVisible(true);
			
		}

			public  void setReceipt() {
					
				ReceiptBuilder.receipt();
		
	}
	}
	
	
	
	
	




