/**
 * OddsAndEvens.java  10/7/2016
 *
 * @author - Matthew Wisniewski
 * @author - Period 4
 * @author - Id 859732
 *
 * @author - I received help no one
 *
*/

public class OddsAndEvens
{
	//Counts the number of Odds or evens based off of the boolean(True=Odd,False=Even)
	private static int countEm(int[] array, boolean odd)
	{
		int length = 0;
		if (odd)
		{
			for (int i = 0; i < array.length; i++)
			{
				if (array[i] % 2 == 1)
				{
					length++;
				}
			}
		}
		if (!odd)
		{
			for (int i = 0; i < array.length; i++)
			{
				if (array[i] % 2 == 0)
				{
					length++;
				}
			}
		}
		return length;
	}
	//Gets the evens and returns an array with all the evens
	public static int[] getAllEvens(int[] array)
	{
		int count = 0;
		int len = countEm(array, false);
		int[] newray = new int[len];
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] % 2 == 0)
			{
				newray[count++] = array[i];
			}
		}
		return newray;
	}
	//Gets the odds and returns an array with all the odds
	public static int[] getAllOdds(int[] array)
	{
		int count = 0;
		int len = countEm(array, true);
		int[] newray = new int[len];
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] % 2 == 1)
			{
				newray[count++] = array[i];
			}
		}
		return newray;
	}
}