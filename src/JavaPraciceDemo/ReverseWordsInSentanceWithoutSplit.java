package JavaPraciceDemo;

public class ReverseWordsInSentanceWithoutSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String input="I am senior SDET";
		
		String word="";
		String Reverse="";
		
		
		
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)!=' ')
				
			{
				word+=input.charAt(i);
				
			}
			else
			{
				Reverse=word+" "+Reverse;
				word="";
				
				
			}
			
			
			
		}
		Reverse=word+" "+Reverse;
		
		System.out.println(Reverse);
		
		
		
		

}

	
}