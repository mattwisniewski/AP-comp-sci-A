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
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class OddOrEvenRunner
{
	public static void main(String[] args) throws IOException
	{
		Scanner file = new Scanner(new File("oddoreven.dat"));
		//Size of the for loop
		int size = file.nextInt();
		//Clears extra space
		file.nextLine();
		//Runs through the file and prints if it is odd or even
		for (int i = 0; i < size; i++)
		{
		   	int num = file.nextInt();
		   	//Initializes with number in the class
		   	OddOrEven oddeven = new OddOrEven(num);
		   	System.out.println(oddeven);
		}
	}
}