/**
 * NumberSorterRunner.java  10/7/2016
 *
 * @author - Matthew Wisniewski
 * @author - Period 4
 * @author - Id 859732
 *
 * @author - I received help from no one
 *
*/
public class NumberSorterRunner
{
	public static void main(String args[])
	{
		int[] cases = {567891, 901912468, 864213507, 898777, 234422};
		for(int test : cases)
		{
			int[] one = NumberSorter.getSortedDigitArray(test);
			for(int item : one)
			{
				System.out.print(item + " ");
			}
			System.out.println();
		}
	}
}