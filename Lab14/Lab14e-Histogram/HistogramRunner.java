/**
 * HistogramRunner.java  10/7/2016
 *
 * @author - Matthew Wisniewski
 * @author - Period 4
 * @author - Id 859732
 *
 * @author - I received help no one
 *
*/

public class HistogramRunner
{
	public static void main(String[] args)
	{
		//Sets the object
		//Formats and prints
		int[] one = {1, 5, 3, 4, 5, 5, 5, 4, 3, 2, 5, 5, 5, 3};
		Histogram test = new Histogram(one, 0);
		for (int i = 0; i <= 9; i++)
		{
			test.setHistogram(one, i);
			System.out.println(test);
		}

		int[] two = {2, 3, 4, 5, 6, 7, 8, 9, 0, 2, 3, 5, 6, 8, 8, 8, 9, 4, 5};
		System.out.println("\n");
		for (int i = 0; i <= 9; i++)
		{
			test.setHistogram(two, i);
			System.out.println(test);
		}

		int[] three = {2, 3, 4, 5, 6, 7, 8, 2, 0, 2, 3, 5, 6, 8, 8, 8, 9, 4, 5};
		System.out.println("\n");
		for (int i = 0; i <= 9; i++)
		{
			test.setHistogram(three, i);
			System.out.println(test);
		}
	}
}