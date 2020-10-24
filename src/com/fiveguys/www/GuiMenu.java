package com.fiveguys.www;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextArea;
import javax.swing.BoxLayout;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class GuiMenu {
	//public static JFrame frame;
	/**
	 * @wbp.nonvisual location=511,239
	 */
	private static final JLabel label = DefaultComponentFactory.getInstance().createTitle("New JGoodies title");


	/**
	 * @wbp.parser.entryPoint
	 */
	public static JTextArea loginText;
	public static JLabel loginMsg;
	public static JPanel panel;
	public static JFrame frame;
	//public static JTextField loginText;
	public static JLabel login;
	public static JButton submit;
	public static JLabel error;
	//public static JLabel error;
	
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void GuiLogin() {

		panel = new JPanel();
		
		frame= new JFrame("Pos System");
		frame.getContentPane().setLayout(null);
		frame.setSize(834,532);
		frame.getContentPane().setBackground(new Color(173, 216, 230));
		
		 loginText = new JTextArea();
		 loginText.addKeyListener(new KeyAdapter() {
		 	//@Override
		 	public void keyPressed(KeyEvent e) {
		 		if  (e.getKeyCode()==KeyEvent.VK_ENTER) {
		 		UserLogin.userLogin();
		 	}
		 	}
		 });
	
		loginText.setBounds(321, 231, 147, 22);
		frame.getContentPane().add(loginText);
		
		submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserLogin.userLogin();
			}
		});
		
		
		submit.setBounds(351, 264, 89, 23);
		frame.getContentPane().add(submit);
		
		 loginMsg = new JLabel("Enter Login Id");
		 loginMsg.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 loginMsg.setBounds(325, 159, 133, 68);
		frame.getContentPane().add(loginMsg);
		
		JLabel lblNewLabel_1 = new JLabel("Five Guys Employee login");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 39));
		lblNewLabel_1.setBounds(168, 11, 511, 52);
		frame.getContentPane().add(lblNewLabel_1);
		
		 error = new JLabel("");
		error.setBounds(260, 298, 431, 29);
		frame.getContentPane().add(error);
		
		frame.setVisible(true);
	}

	
	
	
	public static  void setLoginText() {
		GuiMenu.loginText.getText();
	}
	
	
	public static int  getLoginText() {
		 
		  String loginMem=loginText.getText();
		  int x= Integer.parseInt(loginMem);
		return x;
		}
	
	public static void getLoginSuccesful() {
		String loginMem= loginText.getText();
		
		error.setText(String.valueOf("user "+loginMem+" is logged in"));
		
		
	}
	public static void getFailedLoginMsg()  {
		System.out.println("getfailedmsg ran");//add failed message
		error.setText(String.valueOf("Login Id was Incorrect\n please enter valid login id"));
	loginText.setText(String.valueOf(""));
		
	}
	public static void setLoginMsg() {
		error.setText(String.valueOf("Please enter Login ID"));
		
	}
	}
	
	
