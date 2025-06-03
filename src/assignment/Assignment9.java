package assignment;

import java.util.*;

public class Assignment9 {

	public static void main(String[] args) {

		List<String> Names = new ArrayList<String>();
		Names.add("Alice johnson");
		Names.add("Bob Smith");
		Names.add("Carol Davis");
		Names.add("David Brown");
		Names.add("Eva Green");

		Map<String, Double> Alice_johnson = new HashMap<String, Double>();
		Alice_johnson.put("Base salary", 75000.0d);
		Alice_johnson.put("Experience (Years)", 5.1d);
		Alice_johnson.put("Year-End Rating (Out of 5)", 4.2d);

		Map<String, Double> Bob_Smith = new HashMap<String, Double>();
		Bob_Smith.put("Base salary", 68000.0d);
		Bob_Smith.put("Experience (Years)", 3.2d);
		Bob_Smith.put("Year-End Rating (Out of 5)", 3.8d);

		Map<String, Double> Carol_Davis = new HashMap<String, Double>();
		Carol_Davis.put("Base salary", 82000.0d);
		Carol_Davis.put("Experience (Years)", 7.1d);
		Carol_Davis.put("Year-End Rating (Out of 5)", 4.5d);

		Map<String, Double> David_Brown = new HashMap<String, Double>();
		David_Brown.put("Base salary", 90000.0d);
		David_Brown.put("Experience (Years)", 10.2d);
		David_Brown.put("Year-End Rating (Out of 5)", 2.5d);

		Map<String, Double> Eva_Green = new HashMap<String, Double>();
		Eva_Green.put("Base salary", 60000.0d);
		Eva_Green.put("Experience (Years)", 2.4d);
		Eva_Green.put("Year-End Rating (Out of 5)", 3.5d);

		List<Map<String, Double>> employee_table = new ArrayList<Map<String, Double>>();
		employee_table.add(Alice_johnson);
		employee_table.add(Bob_Smith);
		employee_table.add(Carol_Davis);
		employee_table.add(David_Brown);
		employee_table.add(Eva_Green);

		Map<String, Double> hike_percentages = new HashMap<String, Double>();
		int index = 0;
		for (Map<String, Double> employee : employee_table) 
		{
			double hike = 0.0d;
			double hike_percentage = 0.0d;
			double variable_pay = 0.0d;
			int bonus = 0;
			int reward = 0;
			reward = employee.get("Experience (Years)") >= 5 ? 5000 : 0;
			if (employee.get("Year-End Rating (Out of 5)") >= 4.0)
			{
				variable_pay = 15.0f;
				bonus = 1500;
			}
			else if (employee.get("Year-End Rating (Out of 5)") >= 3
					&& employee.get("Year-End Rating (Out of 5)") < 4)
			{
				variable_pay = 10.0f;
				bonus = 1200;
			} 
			else if (employee.get("Year-End Rating (Out of 5)") < 3)
			{
				variable_pay = 3.0f;
				bonus = 300;
			}
			hike = ((employee.get("Base salary") * (variable_pay)) + bonus + reward);
			hike_percentage = hike / employee.get("Base salary");
			hike_percentages.put(Names.get(index), hike_percentage);
			index++;
		}
		System.out.println(hike_percentages);

	}

}
