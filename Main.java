package day9;

import java.util.Scanner; // import the Scanner class

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner myObj = new Scanner(System.in);
        String userName;
        
        //Enter username and press Enter
        System.out.println("Enter username");
        userName = myObj.nextLine();
        
        System.out.println("Username is: " + userName);
	}

}
