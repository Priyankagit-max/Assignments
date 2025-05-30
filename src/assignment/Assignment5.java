package assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment5 {

	public static void main(String[] args) {
		
		List<String> JohnDoe=new ArrayList<String>();
		JohnDoe.add("John Doe");
		JohnDoe.add("Twenty");
		JohnDoe.add("Male");
		JohnDoe.add("SBA12345");
		JohnDoe.add("A++");
		JohnDoe.add("Computer Science");
		JohnDoe.add("A3.8");
		JohnDoe.add("John@example.com");
		JohnDoe.add("SDF6543210");
		JohnDoe.add("123 Elm St");
		
		List<String> JaneSmith=new ArrayList<String>();
		JaneSmith.add("Jane Smith");
		JaneSmith.add("Twenty One");
		JaneSmith.add("Female");
		JaneSmith.add("SBA12346");
		JaneSmith.add("B+");
		JaneSmith.add("Mathematics");
		JaneSmith.add("A3.5");
		JaneSmith.add("jane@example.com");
		JaneSmith.add("REW6543211");
		JaneSmith.add("456 Oak St");
		
		
		List<String> MikeBrown=new ArrayList<String>();
		MikeBrown.add("Mike Brown");
		MikeBrown.add("Twenty Two");
		MikeBrown.add("Male");
		MikeBrown.add("SBA12347");
		MikeBrown.add("A+");
		MikeBrown.add("Physics");
		MikeBrown.add("A3.9");
		MikeBrown.add("mike@example.com");
		MikeBrown.add("TYR6543212");
		MikeBrown.add("789 Pine St");
		
		//adding details of students into student details table
		Map<String,List<String>> StudentDetails =new HashMap<String,List<String>>();
		StudentDetails.put("0", JohnDoe);
		StudentDetails.put("1", JaneSmith);
		StudentDetails.put("2", MikeBrown);
		//studentdetails.get("0")
		//hashmap,linkedhashmap,treemap,hashtable
		//<key,value>-->
		
		
		List<String> AliceGreen=new ArrayList<String>();
		AliceGreen.add("E001");
		AliceGreen.add("Alice Green");
		AliceGreen.add("Thirty");
		AliceGreen.add("Female");
		AliceGreen.add("Engineering");
		AliceGreen.add("Software Engineer");
		AliceGreen.add("75K Pounds");
		AliceGreen.add("alice@example.com");
		AliceGreen.add("SDF6543210");
		
		List<String> BobJohnson=new ArrayList<String>();
		BobJohnson.add("E002");
		BobJohnson.add("Bob Johnson");
		BobJohnson.add("Thirty Five");
		BobJohnson.add("Male");
		BobJohnson.add("Marketing");
		BobJohnson.add("Marketing Manager");
		BobJohnson.add("85K Pounds");
		BobJohnson.add("bob@example.com");
		BobJohnson.add("REW6543211");
		
		List<String> CarolWhite=new ArrayList<String>();
		CarolWhite.add("E003");
		CarolWhite.add("Carol White");
		CarolWhite.add("Twenty Eight");
		CarolWhite.add("Female");
		CarolWhite.add("Sales");
		CarolWhite.add("Sales Executive");
		CarolWhite.add("65K Pounds");
		CarolWhite.add("carol@example.com");
		CarolWhite.add("TYR6543212");
		
		//adding details of employees into employee_details table
		Map<String,List<String>> EmployeeDetails =new HashMap<String,List<String>>();
		EmployeeDetails.put("0", AliceGreen);
		EmployeeDetails.put("1", BobJohnson);
		EmployeeDetails.put("2", CarolWhite);
		
		List<String> Laptop=new ArrayList<String>();
		Laptop.add("P001");
		Laptop.add("Laptop");
		Laptop.add("Electronics");
		Laptop.add("12K Pounds");
		Laptop.add("Not Available");
		Laptop.add("2 years");
		Laptop.add("4.5 Stars");
		Laptop.add("Aug 2023");
		Laptop.add("Aug 2028");
		
		List<String> DeskChair=new ArrayList<String>();
		DeskChair.add("P002");
		DeskChair.add("Desk Chair");
		DeskChair.add("Furniture");
		DeskChair.add("150K Pounds");
		DeskChair.add("Two");
		DeskChair.add("Office Depot");
		DeskChair.add("4 Stars");
		DeskChair.add("Sep 2024");
		DeskChair.add("N/A");
		
		List<String> CoffeeMaker=new ArrayList<String>();
		CoffeeMaker.add("P003");
		CoffeeMaker.add("CoffeeMaker");
		CoffeeMaker.add("Kitchen");
		CoffeeMaker.add("75 Pounds");
		CoffeeMaker.add("Two Hundred");
		CoffeeMaker.add("KitchenWorld");
		CoffeeMaker.add("6 months");
		CoffeeMaker.add("4.2 Stars");
		CoffeeMaker.add("Jan 2025");
		CoffeeMaker.add("Jan 2027");
		
		//adding details of products into product_details table
		Map<String,List<String>> ProductDetails =new HashMap<String,List<String>>();
		ProductDetails.put("0", Laptop);
		ProductDetails.put("1", DeskChair);
		ProductDetails.put("2", CoffeeMaker);
		
		//storing all three in to single variable
		Map<String,Map<String,List<String>>> Student_employee_Product_details =new HashMap<String,Map<String,List<String>>>();
		Student_employee_Product_details.put("0", StudentDetails);
		Student_employee_Product_details.put("1", EmployeeDetails);
		Student_employee_Product_details.put("2", ProductDetails);
		
		//accessing the "Office Depot" from above data
		System.out.println(Student_employee_Product_details.get("2").get("1").get(5));
		
		
		
		
		
		
						
					
		
							
					
		
		
							
				
		
		
		
		
							
				
		
								
		 		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
