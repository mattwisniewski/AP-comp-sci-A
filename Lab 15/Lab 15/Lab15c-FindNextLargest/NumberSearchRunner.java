/**
 * NumberSearchRunner.java  10/7/2016
 *
 * @author - Matthew Wisniewski
 * @author - Period 4
 * @author - Id 859732
 *
 * @author - I received help from Ryan Rad
 *
*/
public class NumberSearchRunner
{
	public static void main(String[] args)
	{
		//Sets the array and prints the next largest
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 7, 6, 5, 4, 3, 2, 1};
		int find = 5;
		System.out.println("The next largest value after " + find + " is " + NumberSearch.getNextLargest(array, find) + "\n");

		//add more case
		//Sets the array and prints the next largest
		int[] array1 = {10, 30, 20, 40, 50, 15};
		find = 12;
		System.out.println("The next largest value after " + find + " is " + NumberSearch.getNextLargest(array1, find) + "\n");

		int[] array2 = {3, 4, 5, 6, 8, 9, 10, 11, 2, 3, 4, 65};
		find = 25;
		System.out.println("The next largest value after " + find + " is " + NumberSearch.getNextLargest(array2, find) + "\n");

		int[] array3 = {100, 110, 1000, 25000, 65535};
		find = 32767;
		System.out.println("The next largest value after " + find + " is " + NumberSearch.getNextLargest(array3, find) + "\n");
	}
}



