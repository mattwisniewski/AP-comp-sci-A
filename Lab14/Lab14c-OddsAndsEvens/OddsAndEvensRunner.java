/**
 * OddsAndEvensRunner.java  10/7/2016
 *
 * @author - Matthew Wisniewski
 * @author - Period 4
 * @author - Id 859732
 *
 * @author - I received help no one
 *
*/
import java.util.Arrays;

public class OddsAndEvensRunner
{
	public static void main(String[] args)
	{
		int[] one = {2, 4, 6, 8, 10, 12, 14};
		int[] two = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] three = {2, 10, 20, 21, 23, 24, 40, 55, 60, 61};
		System.out.println("Odds - " + Arrays.toString(OddsAndEvens.getAllOdds(one)));
		System.out.println("Evens - " + Arrays.toString(OddsAndEvens.getAllEvens(one)));

		System.out.println("\n" + "Odds - " + Arrays.toString(OddsAndEvens.getAllOdds(two)));
		System.out.println("Evens - " + Arrays.toString(OddsAndEvens.getAllEvens(two)));

		System.out.println("\n" + "Odds - " + Arrays.toString(OddsAndEvens.getAllOdds(three)));
		System.out.println("Evens - " + Arrays.toString(OddsAndEvens.getAllEvens(three)));
	}
}