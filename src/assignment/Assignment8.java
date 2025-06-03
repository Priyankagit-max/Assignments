package assignment;
import java.util.*;
public class Assignment8 {

	public static void main(String[] args) {
		List<Integer> Transactions =new ArrayList<Integer>();
		Transactions.add(50000);
		Transactions.add(-2000);
		Transactions.add(3000);
		Transactions.add(-15000);
		Transactions.add(-200);
		Transactions.add(-300);
		Transactions.add(4000);
		Transactions.add(-3000);
		
		
		int number_of_credit_transactions,number_of_debit_transactions=number_of_credit_transactions=0;
		int amount_credited,amount_debited=amount_credited=0;
		int number_of_suspicious_transactions=0;
		
		for(int i : Transactions)
		{
			if(i==-10000||i==10000)
			{
				number_of_suspicious_transactions++;
				System.out.println("Suspicious credit/ debit Transaction with Amount "+((i<0)?-i:i));
			}
			if(i<0)
			{ 
				// total number of debit transactions completed
				number_of_debit_transactions++;
				
				//total amount debited in account
				amount_debited+=i;
			}
			else if(i>0)
			{
				//total number of credit transactions completed
				number_of_credit_transactions++;
				
				//total amount credited  in account
				amount_credited+=i;
				
			}
		}
		
		//1.Print total number of credit and debit transactions completed
		System.out.println
		(
				"Number of credit transactions: "+number_of_credit_transactions+"\n"+
				"Number of debit transactions: "+number_of_debit_transactions+"\n"+
				"Total Number of Transactions: "+Transactions.size()
	    );
		
		
		//2.Print the total amount credited and debited in account
		System.out.println
		(
				"Amount credited: "+amount_credited+"\n"+
		        "Amount debited: "+amount_debited
		);
		
		//3.Print total amount remaining at the end in Bank Account
		System.out.println("Total amount remaining in account: "+(amount_credited-(-amount_debited)));
		
		//4. print total number of suspicious transactions
		System.out.println("Number of suspicious transactions: "+number_of_suspicious_transactions);
		
		
		
		
	   
		
		
		

	}

}
