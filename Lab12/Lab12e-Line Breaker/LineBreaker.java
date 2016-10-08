/**
 * LineBreaker.java  9/16/2016
 *
 * @author - Matthew Wisniewski
 * @author - Period 8
 * @author - Id 859732
 *
 * @author - I received help from no one
 *
*/
import java.util.Scanner;


public class LineBreaker
{
	private String line;
   	private int breaker;

   	public LineBreaker()
   	{
   		line = "";
   		breaker = 0;
   	}

   	public LineBreaker(String s, int b)
   	{
   		line = s;
   		breaker = b;
   	}

	public void setLineBreaker(String s, int b)
	{
		line = s;
		breaker = b;
	}
	
	//Makes the box and prints it
	public String getLineBreaker()
	{
		String box = "";
		Scanner scannerlinebreaker = new Scanner(line);
		int count = 0;
		while (scannerlinebreaker.hasNext())
		{
			box += scannerlinebreaker.next();
			count++;
			//Checks to see if you broke at the right place
			if (count == breaker)
			{
				System.out.println(box);
				box = "";
				count = 0;
			}
		}
		return box;
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