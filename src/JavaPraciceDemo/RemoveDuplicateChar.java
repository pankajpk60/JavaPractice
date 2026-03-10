package JavaPraciceDemo;

import java.util.Scanner;

public class RemoveDuplicateChar {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scn.next();

		String result = "";

		for (int i = 0; i < str.length(); i++) {

			if (result.indexOf(str.charAt(i)) == -1) {
				result = result + str.charAt(i);

			}

		}
            System.out.println("Result is "+ result); 
	}

}
