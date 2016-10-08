/**
 * BoxRunner.java  9/29/2016
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

public class BoxRunner
{
	public static void main(String[] args) throws IOException
	{
		Scanner file = new Scanner(new File("box.dat"));
		int size = file.nextInt();
		//Clears extra space
		file.nextLine();
		for (int i = 0; i < size; i++)
		{
			Box box = new Box(file.nextLine());
			System.out.println(box);
		}
	}
}