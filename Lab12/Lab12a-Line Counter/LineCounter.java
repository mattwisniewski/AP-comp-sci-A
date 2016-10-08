//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Matthew Wisniewski

import java.util.Scanner;


public class LineCounter
{
   private String line;
	
   public LineCounter()
   {
	line = "";	
   }

   public LineCounter(String s)
   {
   	line = s;
   }

	public void setLine(String s)
	{
	line = s;
	}

	//Returns number of ints in input
	public int getCount()
	{
		int count=0;	
		//Counts the ints in the string
		Scanner scannerline = new Scanner(line);
		while (scannerline.hasNext())
		{
			count++;
			scannerline.next();
		
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