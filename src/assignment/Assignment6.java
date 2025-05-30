package assignment;

public class Assignment6 {

	public static void main(String[] args) {
		
		//Create two arrays to store student names [] and marks[]
		String[] Student_names= {"Suresh","Mahesh","Naresh"};
		int[] marks= {75,80,82};
		
		
		/** Add 10 marks to each students using assignment operators and
		store it into another array, **/
		int[] updated_marks= {marks[0],marks[1],marks[2]};
		updated_marks[0]+=10.0;
		updated_marks[1]+=10.0;
		updated_marks[2]+=10.0;
		
		//after adding 10 marks identify the average marks of all students
		int average_marks=(updated_marks[0]+updated_marks[1]+updated_marks[2])/3;
		System.out.printf("Updated Marks:\n%s: %d\n%s: %d\n%s: %d\nAverage marks: %d",
				Student_names[0],updated_marks[0],
				Student_names[1],updated_marks[1],
				Student_names[2],updated_marks[2],
				average_marks);
		
		


		

	}

}
