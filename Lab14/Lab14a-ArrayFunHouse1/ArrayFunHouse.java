/**
 * ArrayFunHouse.java  10/7/2016
 *
 * @author - Matthew Wisniewski
 * @author - Period 8
 * @author - Id 859732
 *
 * @author - I received help from Spencer Sharp
 *
*/
import java.util.Arrays;
public class ArrayFunHouse
{
	//instance variables and constructors could be used, but are not really needed
	
	//getSum() will return the sum of the numbers from start to stop, not including stop
	public static int getSum(int[] nums, int start, int stop)
	{
		int sum = 0;
		for(int i = start; i < stop; i++)
		{
			sum += nums[i];
		}
		return sum;
	}

	//getCount() will return number of times val is present
	public static int getCount(int[] nums, int val)
	{
		int count = 0;
		for(int item : nums) 
		{ 
			if (item == val) 
			{
				count++;
			}
		}
		return count;
	}

	public static int[] removeVal(int[] nums, int val)
	{
		int numDel = getCount(nums,7);
		int[] newray = new int[nums.length - numDel];
		for(int item : nums)
		{
			if (item != val)
			{
				
			}
		}
		return newray;
	}
}