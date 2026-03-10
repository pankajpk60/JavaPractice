package JavaPraciceDemo;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		
		 System.out.println("What is the number to check ? : ");
		 int number=scanner.nextInt();
		 
		 if(isPrime(number))
			 System.out.println("Number is prime");
		 else
			 System.out.println("Number is not prime");	 

	}



	public static boolean isPrime(int num) {

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
		
    }
}