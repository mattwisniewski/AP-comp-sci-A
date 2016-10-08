/**
 * OddEvenCounter.java  9/16/2016
 *
 * @author - Matthew Wisniewski
 * @author - Period 8
 * @author - Id 859732
 *
 * @author - I received help from no one
 *
*/
import java.util.Scanner;
public class OddEvenCounter
{
	private String line;
	public OddEvenCounter()
    {
   		line = "";
    }

    public OddEvenCounter(String s)
    {
   		line = s;
    }

	public void setLine(String s)
	{
		line = s;
	}

	public int getEvenCount()
	{
		//Counts the number of evens in the line
		int count = 0;
		Scanner scanneroddeven = new Scanner(line);
		while (scanneroddeven.hasNextInt())
		{
			if (scanneroddeven.nextInt() % 2 == 0)
			{
				count++;
			}
		}
		return count;
	}

	public int getOddCount()
	{
		//Counts the number of odd in the line
		int count = 0;
		Scanner scanneroddeven = new Scanner(line);
		while (scanneroddeven.hasNextInt())
		{
			if (scanneroddeven.nextInt() % 2 == 1)
			{
				count++;
			}
		}
		return count;
	}
	public String getLine()
	{
		return line;
	}
	public String toString()
	{
		return getLine();
	}
}