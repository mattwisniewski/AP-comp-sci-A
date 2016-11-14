/**
 * NumberSorter.java  10/7/2016
 *
 * @author - Matthew Wisniewski
 * @author - Period 4
 * @author - Id 859732
 *
 * @author - I received help from no one
 *
*/

public class NumberSorter
{
	//instance variables and other methods not shown
	private int[] ray;

	private static int getNumDigits(int number)
	{
		int count = 0;
		while (number > 0)
		{	
			number /= 10;
			count++;
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];
		for (int i = 0; i < sorted.length; i++)
		{
			number %= 10;
			sorted[i] = number;
		}
		return sorted;
	}
}