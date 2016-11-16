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
	public static void main(String[] args)
	{
		//Sets ray2 with a size of 20
		int[] ray = NumberShifter.makeLucky7Array(20);
		System.out.println(Arrays.toString(ray));
		NumberShifter.shiftEm(ray);
		System.out.println(Arrays.toString(ray));
		//Sets ray2 with a size of 20
		int[] ray2 = NumberShifter.makeLucky7Array(20);
		System.out.println("\n" + Arrays.toString(ray2));
		NumberShifter.shiftEm(ray2);
		System.out.println(Arrays.toString(ray2));
		//Sets ray3 with a size of 20
		int[] ray3 = NumberShifter.makeLucky7Array(20);
		System.out.println("\n" + Arrays.toString(ray3));
		NumberShifter.shiftEm(ray3);
		System.out.println(Arrays.toString(ray3));
	}
}



