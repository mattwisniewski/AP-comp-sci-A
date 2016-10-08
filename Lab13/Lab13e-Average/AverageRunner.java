/**
 * AverageRunner.java  9/29/2016
 *
 * @author - Matthew Wisniewski
 * @author - Period 8
 * @author - Id 859732
 *
 * @author - I received help from no one
 *
*/
import java.util.Scanner;

import java.io.IOException;
import java.io.File;

public class AverageRunner
{
	public static void main(String[] args) throws IOException
	{
		Scanner file = new Scanner(new File("average.dat"));
		int size = file.nextInt();
		//Clears extra space
		file.nextLine();
		for (int i = 0; i < size; i++)
		{
			Average average1 = new Average(file.nextLine());
			System.out.println(average1.getLine());
			System.out.printf("average = %.2f", average1.getAverage());
			System.out.println("\n");
		}
	}
}