package assignment;

public class Assignment14 {
	float power(float x,int n)
	{
		float result=x;
		for(int i=1;i<n;i++)
		{
			result=result*x;
		}
		return result;
	}

	public static void main(String[] args) {
		Assignment14 obj =new Assignment14();
		float x=2.00000f;
		int n=10;
		System.out.printf("result is %.4f",obj.power(x,n));
		

	}

}
