/**
 * HistogramRunner.java  10/7/2016
 *
 * @author - Matthew Wisniewski
 * @author - Period 4
 * @author - Id 859732
 *
 * @author - I received help no one
 *
*/

public class HistogramRunner
{
	public static void main(String args[])
	{
		int[] one = {1, 5, 3, 4, 5, 5, 5, 4, 3, 2, 5, 5, 5, 3};
		for(int i = 0; i <= 9; i++)
		{
			System.out.println(i + " = " + Histogram.getCount(one, i));
		}
		
		int[] two = {2, 3, 4, 5, 6, 7, 8, 9, 0, 2, 3, 5, 6, 8, 8, 8, 9, 4, 5};
		System.out.println("\n");
		for(int i = 0; i <= 9; i++)
		{
			System.out.println(i + " = " + Histogram.getCount(two, i));
		}
		
		int[] three = {2, 3, 4, 5, 6, 7, 8, 2, 0, 2, 3, 5, 6, 8, 8, 8, 9, 4, 5};
		System.out.println("\n");
		for(int i = 0; i <= 9; i++)
		{
			System.out.println(i + " = " + Histogram.getCount(three, i));
		}
	}
}