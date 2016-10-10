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
public class ArrayFunHouse
{
	//Returns the sum of the numbers from start to stop, not including stop
	public static int getSum(int[] nums, int start, int stop)
	{
		int sum = 0;
		for (int i = start; i <= stop; i++)
		{
			sum += nums[i];
		}
		return sum;
	}

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

	//Removes the val from array and creates new array without val
	public static int[] removeVal(int[] nums, int val)
	{
		int numDel = getCount(nums, 7);
		int count = 0;
		int[] newray = new int[nums.length - numDel];
		for (int i = 0; i < nums.length; i++)
		{
			if (nums[i] != val)
			{
				newray[count++] = nums[i];
			}
		}
		return newray;
	}
}