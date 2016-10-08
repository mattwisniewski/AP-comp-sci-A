/**
 * OddOrEven.java  9/29/2016
 *
 * @author - Matthew Wisniewski
 * @author - Period 8
 * @author - Id 859732
 *
 * @author - I received help from no one
 *
*/

public class OddOrEven
{
	private int number;
	//Constructor
	public OddOrEven()
	{
		number = 0;
	}
	//Parameter constructor
	public OddOrEven(int num)
	{
		number = num;
	}

	public void setNum(int num)
	{
		number = num;
	}
	//if number isn't evenly divisble return true
	public boolean isOdd(int num)
	{
		if (num % 2 == 0)
		{
			return false;
		}
		return true;
	}
	public String toString()
	{
		//Returns the correct formatting
		if (isOdd(number))
		{
			return number + " is odd.\n\n";
		}
		return number + " is even.\n\n";
	}
}