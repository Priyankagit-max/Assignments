package assignment;

public class Empgroups extends Employees {

	public static void main(String[] args) {
		Empgroups obj =new Empgroups();
		String[] employee_names= {obj.Employee_name1,obj.Employee_name2,obj.Employee_name3};
		int[] employee_ids= {obj.employee_id1,obj.employee_id2,obj.employee_id3};
		System.out.printf("Employee Name: %s, Employee ID: %d\n",obj.Employee_name1,obj.employee_id1);
		System.out.printf("Employee Name: %s, Employee ID: %d\n",obj.Employee_name2,obj.employee_id2);
		System.out.printf("Employee Name: %s, Employee ID: %d\n",obj.Employee_name3,obj.employee_id3);
		
		
		

	}

}
