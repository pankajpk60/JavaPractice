package JavaPraciceDemo;

public class Swap2StringWithout3rdVariable {

	public static void main(String[] args) {
		

		
        String a = "Hello";
        String b = "World";

        
        a= a + b;
        
        b=a.substring(0, a.length()-b.length());
        System.out.println(b);
        a=a.substring(b.length(),a.length());
        System.out.println(a);
        

		
		
		

	}

}
