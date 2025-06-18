package assignment;

public class Assignment15 {

	public static void main(String[] args) {
		String sentence = "Java programming is fun and challenging";

		String[] words=sentence.split(" ");
		
		//1. Count the total number of words in the sentence.
		System.out.println("Total number of words in the sentence: "+words.length);
		
		//2. Print the sentence words in reverse order.
		System.out.println("The sentence words in reverse order : ");
		for(int i=words.length-1;i>0;i--)
		{
			System.out.println(words[i]);
		}
		//3. Convert the first character of each word to uppercase and print original sentence
		String Camel_case="";
		for(int i=0;i<words.length;i++)
		{
			String[] letters=words[i].split("");
			letters[0].toUpperCase();
			String temp=letters[0].toUpperCase();
			for(int j=1;j<letters.length;j++)
			{
				temp=temp+letters[j];
			}
			Camel_case=Camel_case+temp+" ";
			
		}
		System.out.println("The first character of each word to uppercase:\n"+Camel_case);
		
		
		
		
		

	}

}
