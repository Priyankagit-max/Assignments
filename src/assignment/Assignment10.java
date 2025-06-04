package assignment;

public class Assignment10 {

	public static void main(String[] args) {
		int a[] = { 12, 34, 11, 36, 87, 98, 93 };
		int first_largest = a[0], second_largest = a[0], third_largest = a[0];
		for (int i = 0; i < 7; i++) 
		{
			if (a[i] > first_largest)
			{
				third_largest = second_largest;
				second_largest = first_largest;
				first_largest = a[i];
			}
			else if ((first_largest == second_largest && a[i] < first_largest)
					|| (first_largest != second_largest && a[i] > second_largest && a[i] < first_largest))
			{
				third_largest = second_largest;
				second_largest = a[i];
			} 
			else if ((second_largest == third_largest && a[i] < second_largest)
					|| (second_largest != first_largest && a[i] > third_largest)) 
			{
				third_largest = a[i];
			}
		}
		System.out.println("Second largest numer in array:" + second_largest + "\n" + "Third largest numer in array:"
				+ third_largest + "\n");

	}

}
