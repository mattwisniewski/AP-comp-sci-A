/**
 * ArrayFunHouse.java  10/7/2016
 *
 * @author - Matthew Wisniewski
 * @author - Period 4
 * @author - Id 859732
 *
 * @author - I received help from Spencer Sharp
 *
*/
import java.util.Scanner;

public class Histogram
{
	//add an int[] array instance variable

	//constructor

	//Returns the number of times val is in array
	public static int getCount(int[] nums, int val)
	{
		int count = 0;
		for (int item : nums)
		{
			if (item == val)
			{
				count++;
			}
		}
		return count;
	}
	
	//toString
}