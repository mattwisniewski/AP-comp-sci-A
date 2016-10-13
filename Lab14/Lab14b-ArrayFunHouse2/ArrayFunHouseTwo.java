/**
 * ArrayFunHouseTwo.java  10/7/2016
 *
 * @author - Matthew Wisniewski
 * @author - Period 4
 * @author - Id 859732
 *
 * @author - I received help no one
 *
*/

public class ArrayFunHouseTwo
{
	//Returns true if all numbers in numArray are increasing
	public static boolean goingUp(int[] numArray)
	{
		int spotminus = numArray[0];
		for (int item : numArray)
		{
			if (item < spotminus)
			{
				return false;
			}
			spotminus = item;
		}
		return true;
	}
	
	//Returns true if all numbers in numArray are decreasing
	public static boolean goingDown(int[] numArray)
	{
		int spotminus = numArray[0];
		for (int item : numArray)
		{
			if (item > spotminus)
			{
				return false;
			}
			spotminus = item;
		}
		return true;
	}
	
	//Creates a new array with all numbers greater than val
	public static int[] greaterThan(int[] numArray, int len, int val)
	{
		int count = 0;
		int[] newray = new int[len];
		for (int i = 0; i < numArray.length; i++)
		{
			if (numArray[i] > val)
			{
				newray[count++] = numArray[i];
			}
			if (count == len)
			{
				return newray;
			}
		}
		return null;
	}
}