package assignment;

public class Assignment2_arrays {

	public static void main(String[] args) {
		
		        /** Actual values for subject names and marks as the third dimension */
		        //First semester marks and status
				String[] sem1_subjects= {"mathematics1","Physics","Chemistry","Computer Programming","Engineering Drawing","Basic Electrical Eng"};
				String[] sem1_status= {"Pass","Pass","Fail","Pass","Pass","Pass"};
				
				//Second semester marks and status
				String[] sem2_subjects= {"Mathematics2","Mechanics","Environmental Science","Basic electronics","Engineering Physics","Engineering Graphics"};
				String[] sem2_status= {"Pass","Pass","Pass","Fail","Fail","Pass"};
				
				//Third semester marks and status
				String[] sem3_subjects={"Data structures","Discrete Mathematics","Digital electronics","Operating systems","Signals and systems","Object oriented programming"};
				String[] sem3_status= {"Pass","Pass","Pass","Fail","Pass","Pass"};
				
				//Fourth semester marks and status
				String[] sem4_subjects={"Algorithms","Computer Networks","Database systems","Microprocessors","Communication Engineering","Software Engineering"};
				String[] sem4_status= {"Pass","Pass","Fail","Pass","Pass","Pass"};
				
				//Fifth semester marks and status
				String[] sem5_subjects= {"Probability & statistics","Machine Learning","computer design", "Theory of computation","Embedded systems", "Computer graphics"};
				String[] sem5_status= {"Pass","Pass","Pass","Pass","Pass","Pass"};
				
				/**  subject and status as second dimension*/
				String[][] sem1= {sem1_subjects,sem1_status};
				String[][] sem2= {sem2_subjects,sem2_status};
				String[][] sem3= {sem3_subjects,sem3_status};
				String[][] sem4= {sem4_subjects,sem4_status};
				String[][] sem5= {sem5_subjects,sem5_status};
				
				/**creating a semester as a first dimension */
		        String[][][] semester= {sem1,sem2,sem3,sem4,sem5};
		        
		        //print semester2 subject4 and subject5 names
		        System.out.println(semester[1][0][3]);
		        System.out.println(semester[1][0][4]);
		        
		        //print the status of semester4 subject3 and subject6
		        System.out.println(semester[3][1][2]);
		        System.out.println(semester[3][1][5]);
		
		}
	}


