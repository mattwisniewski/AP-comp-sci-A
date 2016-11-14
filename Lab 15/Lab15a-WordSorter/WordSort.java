/**
 * WordSort.java  10/27/2016
 *
 * @author - Matthew Wisniewski
 * @author - Period 4
 * @author - Id 859732
 *
 * @author - I received help from no one
 *
*/
import java.util.Arrays;

public class WordSort
{
	private String[] wordRay;

	public WordSort(String line)
	{
	   setList(line);
	}

	public void setList(String line)
	{
		wordRay = line.split(" ");
	}

	public void sort()
	{
		Arrays.sort(wordRay);
	}

	public String toString()
	{
		sort();
		String output = "";
		for (int i = 0; i < wordRay.length; i++)
		{
			output += "word " + i + " :: " + wordRay[i] + "\n";
		}
		return output;
	}
}