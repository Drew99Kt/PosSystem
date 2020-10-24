package com.fiveguys.www;



public class UserLogin {


	
	public static void userLogin()   {
		GuiMenu login = new GuiMenu();
		int idNumber2 = login.getLoginText();
		 
		// array for approved users
		AccountUsers users = new AccountUsers();
				System.out.println(idNumber2);
		
		// start of check for valid user log in
		if (users.users().contains(idNumber2)) {
			GuiMenu.getLoginSuccesful();
			System.out.println("log in successful");//used for testing
			SelectionSrn.selectionGui();
			GuiMenu.frame.setVisible(false);
		}else {
			GuiMenu.getFailedLoginMsg();
			System.out.println("password is wrong\n\n");
			userLogin();
			//end of user verify
		}
	
	}

}
