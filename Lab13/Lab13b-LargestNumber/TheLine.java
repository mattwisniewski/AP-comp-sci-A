/**
 * OddOrEvenRunner.java  9/29/2016
 *
 * @author - Matthew Wisniewski
 * @author - Period 8
 * @author - Id 859732
 *
 * @author - I received help from no one
 *
*/
import java.util.Scanner;
public class TheLine
{
	private String line;

  	public TheLine()
  	{
  		line = "";
   	}
	//Constructor
   	public TheLine(String s)
   	{
   		line = s;
   	}

	public int getLargest()
	{
		Scanner theline = new Scanner(line);
		//Sets largest to first number in the string(line)
		int largest = theline.nextInt();
		while (theline.hasNext())
		{
			//Sets num to the next int
			int num = theline.nextInt();
			//Checks to see if the int is the largest
			if (num > largest)
			{
				largest = num;
			}
		}
		return largest;
	}

	//Returns the correct formatting
	public String toString()
	{
		return line + " - Largest == " + getLargest();
	}
}