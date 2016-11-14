/**
 * NumberShifterRunner.java  11/3/2016
 *
 * @author - Matthew Wisniewski
 * @author - Period 4
 * @author - Id 859732
 *
 * @author - I received help from no one
 *
*/

import java.util.Arrays;

public class NumberShifterRunner
{
	public static void main(String args[])
	{
		//add test cases
		int[] ray = NumberShifter.makeLucky7Array(20);
		System.out.println(Arrays.toString(ray));
		NumberShifter.shiftEm(ray);
		System.out.println(Arrays.toString(ray));
		
		int[] ray2 = NumberShifter.makeLucky7Array(20);
		System.out.println("\n" + Arrays.toString(ray2));
		NumberShifter.shiftEm(ray2);
		System.out.println(Arrays.toString(ray2));
	
		int[] ray3 = NumberShifter.makeLucky7Array(20);
		System.out.println("\n" + Arrays.toString(ray3));
		NumberShifter.shiftEm(ray3);
		System.out.println(Arrays.toString(ray3));
	}
}



