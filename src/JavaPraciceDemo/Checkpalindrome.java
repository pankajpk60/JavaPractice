package JavaPraciceDemo;

import java.util.Scanner;

public class Checkpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter actual string: \n");
		String ActualStr = scn.next();
		String reverseString = "";
		for (int i = ActualStr.length() - 1; i >= 0; i--) {
			reverseString += ActualStr.charAt(i);

		}

		System.out.println("Reverse string for the Entered Actual String is:" + reverseString);
		
		
		if(ActualStr.equals(reverseString))
			System.out.println("Entered String is palindorme");
		else
			System.out.println("Entered String is not palindrome");

	}

}
