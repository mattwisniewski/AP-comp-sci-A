/**
 * Average.java  9/16/2016
 *
 * @author - Matthew Wisniewski
 * @author - Period 8
 * @author - Id 859732
 *
 * @author - I received help from Daniel Willoughby/Steven Lo
 *
*/
import java.util.Scanner;
public class Average
{
	private String line;
    public Average()
    {
		line = "";
    }
    public Average(String s)
    {
   		line = s;
    }
	public void setLine(String s)
	{
		line = s;
	}
	public int getCount()
	{
		//Counts how many ints are on the line
		int count = 0;
		Scanner scanneravg = new Scanner(line);
		while (scanneravg.hasNext())
		{
			count++;
			scanneravg.next();
		}
		return count;
	}
	//Sums the ints on the line
	public int getSum()
	{
		int sum = 0;
		Scanner scanneravg = new Scanner(line);
		//Loops and adds int to the sum
		while (scanneravg.hasNextInt())
		{
			sum += scanneravg.nextInt();
		}
		return sum;
	}
	public double getAverage()
	{
		//Averages and returns as a double
		double average = 0.0;
		average = (double)getSum() / getCount();
		return average;
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