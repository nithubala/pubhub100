package pubdive1;

import java.util.Scanner;
public class Dive1 {
	boolean login(String userName,String password){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the userName = ");
		userName = s.nextLine();
		System.out.println("Enter the password = ");
		password = s.nextLine();
	System.out.println("Result : "+ userName);
	System.out.println(password);
	if(userName.equals("admin") && password.equals("admin")) {
		System.out.println("True");
	}
	else {
		System.out.println("False");
		
	}
		
	return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Dive1 p = new Dive1();
		p.login("userName", "password");
			
	}

}
