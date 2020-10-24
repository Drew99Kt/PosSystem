package com.fiveguys.www;

public class ReceiptBuilder {

	//all getters  will be placed here for receipt print out
	public static  double sodaCost;
	public static double pepsi;
	
	
	public static void receipt() {
	DrinksSelect drinks= new DrinksSelect();
	//SelectionSrn select=new SelectionSrn();
	//ReceiptBuilder cost= new ReceiptBuilder();
	double pepsi=drinks.getPepsi();
	double cost=(double) itemCost(pepsi);
	
	SelectionSrn.receiptField.setText(String.valueOf("Pepsi= "+pepsi+"   $"+cost));
	
	DrinksSelect.receiptField.setText(String.valueOf("Pepsi= "+pepsi+"   $"+cost));
	
	
	}
	
	
	
	public static double itemCost(double x) {
		 return sodaCost= x*1.24;
		
		
		
		
		
	}
	public static void logOut() {
		pepsi=0;
		DrinksSelect logout= new DrinksSelect();
		logout.logout();
	}
	
}



