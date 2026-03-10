package JavaPraciceDemo;

import java.util.Scanner;

public class ReverseStringUsingStringBuilder {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Input String: ");
		String str = scn.next();
		String rev = "";

		for (int i = str.length()-1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}

		System.out.println(rev);

	}

}
