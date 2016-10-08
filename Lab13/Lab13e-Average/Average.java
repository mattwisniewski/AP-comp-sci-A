/**
 * Average.java  9/29/2016
 *
 * @author - Matthew Wisniewski
 * @author - Period 8
 * @author - Id 859732
 *
 * @author - I received help from no one
 *
*/
import java.util.Scanner;
public class Average
{
   	private String line;

   	//write two constructors
	public Average()
	{
		line = "";
	}

	public Average(String s)
	{
		line = s;
	}

	//write a setLine method
	public void setLine(String s)
	{
		line = s;
	}

	//Gets the lowest value in string
	private int getLowest()
	{
		Scanner low = new Scanner(line);
		//Sets lowest to first int
		int lowest = low.nextInt();
		while (low.hasNext())
		{
			int num = low.nextInt();
			//Checks if lower than lowest
			if (num < lowest)
			{
				lowest = num;
			}
		}
		return lowest;
	}

	//Gets the sum
	private double getSum()
	{
		Scanner s = new Scanner(line);
		int sum = 0;
		while (s.hasNextInt())
		{
			sum += s.nextInt();
		}
		return sum;
	}

	//Gets the count
	private int getCount()
	{
		Scanner s = new Scanner(line);
		int count = 0;
		while (s.hasNextInt())
        {
        	count++;
            s.nextInt();
        }
        return count;
	}

	//Gets the average
	public double getAverage()
	{
		double average = 0.0;
        Scanner avg = new Scanner(line);
        //Deletes the lowest value and returns the average
        average = (getSum() - getLowest()) / (getCount() - 1);
		return average;
	}

	//write a getLine method
	public String getLine()
	{
		return line;
	}

	//write a toString method
	public String toString()
	{
		return "average = " + (double) Math.round(getAverage() * 100) / 100;
	}
}