/**
 * WordSortRunner.java  10/27/2016
 *
 * @author - Matthew Wisniewski
 * @author - Period 4
 * @author - Id 859732
 *
 * @author - I received help from no one
 *
*/
import java.util.Arrays;

public class WordSortRunner
{
	public static void main(String args[])
	{
		//add test cases
		WordSort test = new WordSort("abc ABC 12321 fred alexander");
		System.out.print(test.toString());
		test.setList("a zebra friendly acrobatics 435 TONER PRinTeR");
		System.out.print("\n" + test.toString());
		test.setList("a b x 4 r s y $");
		System.out.print("\n" + test.toString());
		test.setList("123 ABC abc 034 dog cat sally sue bob 2a2");
		System.out.print("\n" + test.toString());
	}
}