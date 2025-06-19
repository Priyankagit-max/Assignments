package assignment;

public class Assignment18 {

	public static void main(String[] args) {
		String s = "race a car";
		s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
		String rev="";
		String[] letters=s.split("");
		for(int i=letters.length-1;i>=0;i--)
		{
			rev=rev+letters[i];
		}
		if(s.equals(rev))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
		

	}

}
