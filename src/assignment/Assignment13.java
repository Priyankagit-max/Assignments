package assignment;

public class Assignment13 {

	public static void main(String[] args) {
		int number=10;
		boolean is_prime_number=true;
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
