/**
 * RomanNumeral.java  10/7/2016
 *
 * @author - Matthew Wisniewski
 * @author - Period 4
 * @author - Id 859732
 *
 * @author - I received help no one
 *
*/

public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	private final static String[] letters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		String roman = "";
	}

	public RomanNumeral(int orig)
	{
		int number = 0;
	}

	public void setNumber(int num)
	{
		number = num;
	}

	public void setRoman(String rom)
	{
		roman = rom;
	}

	public int getNumber()
	{
		return number;
	}
	
	public String getRoman()
	{
		String strroman = "";
		for (int i = 0; i < numbers.length; i++)
		{
			while (number >= numbers[i])
			{
				strroman += letters[i];
				number = number - numbers[i];
			}
		}
		return strroman;
	}
	
	public String toString()
	{
		return getRoman() + "\n";
	}
}