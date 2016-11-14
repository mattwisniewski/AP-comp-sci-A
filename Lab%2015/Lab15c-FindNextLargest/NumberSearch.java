/**
 * NumberSearch.java  10/7/2016
 *
 * @author - Matthew Wisniewski
 * @author - Period 4
 * @author - Id 859732
 *
 * @author - I received help from Ryan Rad
 *
*/

import java.util.Arrays;

public class NumberSearch
{
	public static int getNextLargest(int[] numArray, int searchNum)
	{
		int done = 0;
		for (int num : numArray)
		{
			if (num > searchNum && (num < done || done == 0))
			{
				done = num;
			}
		}
		return done;
	}
}