package assignment;

public class Assignment13 {

	public static void main(String[] args) {
		int number=0;
		boolean is_prime_number=true;
		if(number==1)
		{
			is_prime_number=false;
			System.out.println((is_prime_number?"prime number":"not prime number"));
		}
		else if(number==0)
		{
			System.out.println("0 is neither nor composite");
		}
		else
		{
			for(int i=2;i<number;i++)
			{
				if(number%i==0)
				{
					is_prime_number=false;
				}
			}
			System.out.println((is_prime_number?"prime number":"not prime number"));
		}
		
		

	}

}
