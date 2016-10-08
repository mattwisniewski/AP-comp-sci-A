/**
 * DogFoodRunner.java  9/20/2016
 *
 * @author - Matthew Wisniewski
 * @author - Period 8
 * @author - Id 859732
 *
 * @author - I received help from no one
 *
*/
import java.util.Scanner;

public class DogFoodRunner
{
	public static void main(String[] args)
	{
		DogFood dogfood1 = new DogFood("6 10 14 18 25 32",0,0);
		System.out.println(dogfood1.getDogFood());
		System.out.println(dogfood1.getAmount() + " - 10 POUND BAGS");
			
		DogFood dogfood2 = new DogFood("12 15 20 26 35 42",0,0);
		System.out.println(dogfood2.getDogFood());
		System.out.println(dogfood2.getAmount() + " - 10 POUND BAGS");
			
		DogFood dogfood3 = new DogFood("33 38 45 51 60 65",0,0);
		System.out.println(dogfood3.getDogFood());
		System.out.println(dogfood3.getAmount() + " - 10 POUND BAGS");
			
		DogFood dogfood4 = new DogFood("40 50 60 77 90 101",0,0);
		System.out.println(dogfood4.getDogFood());
		System.out.println(dogfood4.getAmount() + " - 10 POUND BAGS");
	}
}