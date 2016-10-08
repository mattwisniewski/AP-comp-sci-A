/**
 * Social.java  9/29/2016
 *
 * @author - Matthew Wisniewski
 * @author - Period 8
 * @author - Id 859732
 *
 * @author - I received help from no one
 *
*/
import java.util.Scanner;
public class Social
{
   	private String socialNum;

	public Social()
	{
		socialNum = "";
	}
	//Constructor
	public Social(String soc)
	{
		socialNum = soc;
	}

	public void setSocial(String soc)
	{
		socialNum = soc;
	}

	public int getSum()
	{
		Scanner sums = new Scanner(socialNum);
		//Sets scanner to split with "-"
		sums.useDelimiter("\\-");
		int sum = 0;
		//Runs until all ints are added
		while (sums.hasNextInt())
		{
			int num = sums.nextInt();
			sum += num;
		}
		return sum;
	}

	public String toString()
	{
		return "SS# " + socialNum + " has a sum of " + getSum() + "\n";
	}
}