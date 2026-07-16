package com.coforge.Day_07_07_26_Exceptions;

import java.io.IOException;

public class LoginSessionDemo {

	public static void validate(String uname,String pwd) {
		
		if(uname.equals("swapna")&&pwd.equals("swapna123")) {
		try(LoginSession session=new LoginSession()){
			
			session.login();
			session.accessPages();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		}
		else
			System.out.println("Invalid credentials,No session");
	}
	
	public static void main(String[] args) {
		
		String uname="swapna", pwd="swapna123";
			validate(uname,pwd);

	}

}
