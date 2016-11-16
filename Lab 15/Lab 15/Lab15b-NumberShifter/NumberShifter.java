/**
 * NumberShifter.java  11/3/2016
 *
 * @author - Matthew Wisniewski
 * @author - Period 4
 * @author - Id 859732
 *
 * @author - I received help from no one
 *
*/
public class NumberShifter
{
	//Makes an array with a size and with all random numbers 1-10
	public static int[] makeLucky7Array(int size)
	{
		int[] numray = new int[size];
		//Adds values to the array with all random numbers 1-10
		for (int i = 0; i < numray.length; i++)
		{
			numray[i] = (int)(Math.floor(Math.random() * 10) + 1);
		}
		return numray;
	}
	//Shifts all 7s in the array to the front and replaces the values of the original 7s with the first few numbers in the array
	public static void shiftEm(int[] ray)
	{
		for (int i = 0; i < ray.length; i++)
		{
			for (int j = i; j < ray.length; j++)
			{
				if (ray[j] == 7)
				{
					int temp = ray[i];
					ray[i] = ray[j];
					ray[j] = temp;
				}
			}
		}
	}
}