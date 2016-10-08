/**
 * DogFood.java  9/20/2016
 *
 * @author - Matthew Wisniewski
 * @author - Period 8
 * @author - Id 859732
 *
 * @author - I received help from no one
 *
*/
import java.util.Scanner;

public class DogFood
{
   	private double amount;
   	private int weight;
   	private String line;
   	
	public DogFood()
  	{
   		amount = 0.0;
   		weight = 0;
   		line = "";
   	}

    public DogFood(String s, int w, double a)
    {
   		amount = a;
   		weight = w;
   		line = s;
    }

	public void setDogFood(String s, int w, double a)
	{
		amount = a;
   		weight = w;
		line = s;
	}

  	public String getDogFood()
   	{
		Scanner chopper = new Scanner(line);
		double cups = 0.0;
		int amount = 0;
		while (chopper.hasNext())
		{
			weight = chopper.nextInt();
			if (weight >= 2 && weight <= 4) {
				cups += 0.5;
			} else if (weight >= 5 && weight <= 7) {
				cups += 1.0;
			} else if (weight >= 8 && weight <= 9) {
				cups += 1.5;
			} else if (weight >= 10 && weight <= 19) {
				cups += 2.0;
			} else if (weight >= 20 && weight <= 39) {
				cups += 3.5;
			} else if (weight >= 40 && weight <= 59) {
				cups += 4.5;
			} else if(weight >= 60 && weight <= 79) {
				cups += 6.0;
			} else if(weight >= 80) {
				cups += 7.5;
			}
		}
		return cups;
   	}
   	public double getAmount()
   	{
   		return 0;
  	}

	public String getLine()
	{
		return line;
	}
	
	public String toString()
	{
		return getLine();
	}
}