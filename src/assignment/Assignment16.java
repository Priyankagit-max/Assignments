package assignment;

public class Assignment16 {

	public static void main(String[] args) {
		String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";
       
		//1. Divide into multiple words
		String[] words=paragraph.split(" ");
		int indexx=0,count=0;
		System.out.println("Occurences of Java in sentence: ");
		for(int i=0;i<words.length;i++)
		{
			if(words[i].equals("Java"))
			{
				count++;
				//3. Print Indexes of the word
				System.out.print(indexx+" ");	
			}
			indexx=indexx+words[i].length()+1;
		}
		//2. Find total number of occurrences
		System.out.println("\nNumber of occurences of 'Java' : "+count);
		
	}

}
