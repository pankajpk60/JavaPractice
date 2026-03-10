package JavaPraciceDemo;

import java.util.Scanner;

public class OddEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("What is the number to check?: ");
		int number=scanner.nextInt();
		
		
		if(number%2==0)
			System.out.println(number + " is even");
		else
			System.out.println(number + " is odd");
		
		
		

	}

}
