//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;

public class LineTotaller
{
   private String line;

	public LineTotaller()
	{
	line = "";
	}

	public LineTotaller(String s)
	{
	line = s;
	}

	public void setLine(String s)
	{
	line = s;
	}
	//Returns total of ints in line
	public int getSum()
	{
		//Totals the ints in the line
		int total = 0;
		Scanner scannernum = new Scanner(line);
		while (scannernum.hasNextInt())
		{
		total += scannernum.nextInt();
		}
		
		return total;
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