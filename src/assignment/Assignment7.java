package assignment;

public class Assignment7 {

	public static void main(String[] args) {
		//A bank evaluates loan applicants based on the following criteria
		int credit_score=0;
		boolean loan_approval=false;
		int customer_income=10;
		boolean customer_employment_status=true;
		int DTI_ratio=40;
		//If the credit score is above 750, the loan is automatically approved.
		if((credit_score)>750)
		{
			loan_approval=true;
		}
		//If the credit score is between 650 and 750, additional checks are performed.
		else if(credit_score>=650&& credit_score<=750)
		{
			 //the customer’s income must be at least $50,000 for the loan to be considered.
			if(customer_income>=50000) 
			{
				//If the customer is employed, the system checks the debt-to-income (DTI) ratio
				if(customer_employment_status==true)
				{
					//If the DTI ratio is less than 40%, the loan is approved
					if(DTI_ratio<40)
					{
						loan_approval=true;
					}
				}
				
			}
		}
		System.out.println((loan_approval?"Loan approved":"Loan denied"));

	}

}
