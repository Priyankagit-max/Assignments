package assignment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Assignment4 {

	public static void main(String[] args) {
		
		// 1.0 Create Lists with area of top 5 largest cities.
		List<Integer> Largest_cities=new ArrayList<Integer>();
		Largest_cities.add(12093);
		Largest_cities.add(8231);
		Largest_cities.add(7006);
		Largest_cities.add(7400);
		Largest_cities.add(5429);
		
		// 1.1 Print the total area of the 3rd and 4th cities combined.
		System.out.println("Total area of the 3rd and 4th cities combined: "+Largest_cities.get(2)+Largest_cities.get(3));
		
		//2.0 Create a set of the top 10 most visited tourist attractions in the world
		Set<String> Tourist_Attractions= new HashSet<String>();
		Tourist_Attractions.add("The Las Vegas Strip");
		Tourist_Attractions.add("Times Square");
		Tourist_Attractions.add("Dubai Mall");
		Tourist_Attractions.add("Grand Bazaar");
		Tourist_Attractions.add("Great Wall of China");
		Tourist_Attractions.add("Eiffel Tower");
		Tourist_Attractions.add("Louvre Museum");
		Tourist_Attractions.add("Empire State Building");
		Tourist_Attractions.add("Statue of Liberty");
		Tourist_Attractions.add("Colosseum");
		
		// print out all of them and its size.
		System.out.println("Top 10 most visited tourist attractions in the world: "
		+Tourist_Attractions+"\n"+"Size "+Tourist_Attractions.size());
		
		// 3.0 Create an array of 10 numbers (any 10 numbers) 
		int[] arr= {1,0,2,9,3,8,4,75,6,45};
		
		// 3.1 print out the Average of 5th and 6th Value.
		System.out.println("Average of 5th and 6th Value in Array: "+(arr[4]+arr[5])/2);
		
		//4.0 Create a list of the top 5 highest-grossing movies of all time 
		List<String> movies=new ArrayList<String>();
		movies.add("Avatar");
		movies.add("Avengers: Endgame");
		movies.add("Avatar: The Way of Water");
		movies.add("Titanic");
		movies.add("Star Wars: Episode VII – The Force Awakens");
		
		//4.1 print out the third movie on the list.
		System.out.println("The third movie on the list: "+movies.get(2));
		
		
		
		
		
		
		
		

	}
}
