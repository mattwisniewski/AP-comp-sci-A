/**
 * Box.java  9/29/2016
 *
 * @author - Matthew Wisniewski
 * @author - Period 8
 * @author - Id 859732
 *
 * @author - I received help from no one
 *
*/
import java.util.Scanner;

public class Box
{
   	private String let;
   	private int size;

	//make two constructors
	public Box()
	{
		size = 0;
		let = "";
	}
	//Constructor
	public Box(String line)
	{
		//Sets the parameters
		Scanner boxes = new Scanner(line);
		let = boxes.next();
		size = boxes.nextInt();
	}

	public String makeBox(String let, int size)
	{
		String box = "";
		//Row numbers
		for (int i = 0; i < size; i++)
		{
			//Column numbers and letters
			for (int n = 0; n < size; n++)
			{
				box += let;
			}
			box += "\n";
		}
		return box;
	}

	public String toString()
	{
		//Outputs the made box
		return makeBox(let, size) + "\n";
	}
}