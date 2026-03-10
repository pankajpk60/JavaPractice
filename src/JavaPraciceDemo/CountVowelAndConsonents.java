package JavaPraciceDemo;

import java.util.Scanner;

public class CountVowelAndConsonents {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String");
				
		      String str=scn.next();
		      int Vowel=0;
		      int Consonent=0;
		      
		      for (int i=0;i<str.length();i++)
		      {
		    	  char ch=str.charAt(i);
		    	  if(ch>='a' && ch<='z')
		    	  {
		    		  if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		    		  {
		    			  Vowel++;
		    		  }
		    		  else
		    		  {
		    			  Consonent++;
		    		  }
		    	  }		    	 
		    	  
		      }
		
		      System.out.println("Vowel Count = "+ Vowel);
		      System.out.println("Consonent Count = "+ Consonent);
}

}
