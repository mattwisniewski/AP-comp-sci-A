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
import java.util.Arrays;
import java.lang.Math;

public class NumberShifter
{
	public static int[] makeLucky7Array(int size)
	{
		int[] numray = new int[size];
		for (int i = 0; i < numray.length; i++)
		{
			numray[i] = (int)(Math.floor(Math.random() * 10) + 1); 
		}
		return numray;
	}

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