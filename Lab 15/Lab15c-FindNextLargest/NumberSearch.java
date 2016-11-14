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

public class NumberSearch
{
	public static int getNextLargest(int[] numArray, int searchNum)
	{
		int done = 0;
		//Goes through array and finds the number less than and the next larger than
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
