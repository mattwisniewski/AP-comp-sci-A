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
		//Counts the number of digits in number by subtracting the last digit with /
		while (number > 0)
		{
			number /= 10;
			count++;
		}
		return count;
	}
	//Gets the sorted array with the correct length that getNumDigits gets
	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];
		//Loops through and adds the last digit of number to the array with %
		for (int i = 0; i < sorted.length; i++)
		{
			sorted[i] = number % 10;
			number /= 10;
		}

		//Sorts the array
		for (int k = 0; k < sorted.length - 1; k++)
		{
			int min = k;
			for (int j = k + 1; j < sorted.length; j++)
			{
				if (sorted[j] < sorted[min])
				{
					min = j;
				}
			}
			if (min != k)
			{
				int temp = sorted[min];
				sorted[min] = sorted[k];
				sorted[k] = temp;
			}
		}
		return sorted;
	}
}