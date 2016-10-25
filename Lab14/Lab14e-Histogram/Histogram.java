/**
 * Histogram.java  10/7/2016
 *
 * @author - Matthew Wisniewski
 * @author - Period 4
 * @author - Id 859732
 *
 * @author - I received help from no one
 *
*/
public class Histogram
{
	//add an int[] array instance variable
	private int[] nums;
	private int val;

	//constructor
	public Histogram()
	{
		nums = new int[0];
		val = 0;
	}

	public Histogram(int[] hist, int num)
	{
		nums = new int[hist.length];
		int index = 0;
		for (int item : hist)
		{
			nums[index] = item;
			index++;
		}
		val = num;
	}

	public void setHistogram(int[] hist, int num)
	{
		nums = hist;
		val = num;
	}

	//Returns the number of times val is in array
	public int getCount()
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

	//toString formats the histogram
	public String toString()
	{
		return val + " - " + getCount();
	}
}