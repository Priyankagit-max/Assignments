package assignment;

public class Assignment12 {

	public static void main(String[] args) {
		int[] prices= {7,1,5,3,6,4};
		int max_profit=0;
		for(int i=0;i<prices.length;i++)
		{
			for(int j=i+1;j<prices.length;j++)
			{
				if((prices[j]-prices[i])>0)
				{
					if ( (prices[j]-prices[i])>max_profit)
					{
						max_profit=(prices[j]-prices[i]);
					}
				}
			}
		}
		
		System.out.println("Maximum Profit: "+max_profit);

	}

}
