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

public class TheLineRunner
{
	public static void main(String[] args) throws IOException
	{
		Scanner file = new Scanner(new File("line.dat"));
		//Size of the for loop
		int size = file.nextInt();
		//Clears extra space
		file.nextLine();
		//Runs through the file and finds the largest
		for (int i = 0; i < size; i++)
		{
			TheLine line = new TheLine(file.nextLine());
			System.out.println(line);
		}
	}
}