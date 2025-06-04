package assignment;

public class Assignment11 
{

	public static void main(String[] args) 
	{

		int n = 9, k = 1, ipointer, dpointer = ipointer = (n - 1) / 2;
		boolean break_even = false;
		for (int i = 0; i <= n; i++) 
		{
			k = 1;
			for (int j = 0; j <= n; j++)
			{
				if (j < dpointer) 
				{
					System.out.print(" ");
				}
				if ((j >= dpointer && j <= ipointer)&& (((dpointer % 2 == 0) && (j % 2 == 0)) || (!(dpointer % 2 == 0) && !(j % 2 == 0))))
				{
					System.out.print(k + " ");
					k++;
				}
			}
			if (dpointer == 0 && ipointer == n - 1)
			{
				break_even = true;
			}
			if (break_even)
			{
				dpointer++;
				ipointer--;
			}
			else
			{
				dpointer--;
				ipointer++;
			}
			System.out.println("");
		}
	}

}
