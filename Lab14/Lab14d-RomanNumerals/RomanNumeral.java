/**
 * RomanNumeral.java  10/7/2016
 *
 * @author - Matthew Wisniewski
 * @author - Period 4
 * @author - Id 859732
 *
 * @author - I received help Ryan Radloff
 *
*/

public class RomanNumeral
{
	//Variables and arrays
	private int number;
	private String roman;
	private int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	private String[] letters = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	//Constructor
	public RomanNumeral(String str)
	{
		roman = str;
	}

	public RomanNumeral(int orig)
	{
		number = orig;
	}

	public void setNumber(int num)
	{
		number = num;
	}

	public void setRoman(String rom)
	{
		roman = rom;
	}

	//Converts a string of roman to an int
	public int getNumber()
	{
		//Loops through the string, coverts to ints
		int sum = 0;
		for (int i = 0; i < letters.length; i++)
		{
			while (roman.indexOf(letters[i]) == 0)
			{
				sum += numbers[i];
				roman = roman.substring(letters[i].length());
			}
		}
		return sum;
	}
	//Converts an int to a string of roman
	public String getRoman()
	{
		String strroman = "";
		for (int i = 0; i < numbers.length; i++)
		{
			while (number >= numbers[i])
			{
				strroman += letters[i];
				number -= numbers[i];
			}
		}
		return strroman;
	}
	//Formats and returns the string romans
	public String toString()
	{
		return getRoman() + "\n";
	}
}