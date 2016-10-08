/**
 * AverageRunner.java  9/16/2016
 *
 * @author - Matthew Wisniewski
 * @author - Period 8
 * @author - Id 859732
 *
 * @author - I received help from Daniel Willoughby/Steven Lo
 *
*/
public class AverageRunner
{
	public static void main(String[] args)
    {
   		Average average1 = new Average("9 10 5 20");
   		System.out.println("9 10 5 20");
   		System.out.println("average = " + String.format("%.3f", average1.getAverage()));

   		Average average2 = new Average("11 22 33 44 55 66 77");
   		System.out.println("\n" + "11 22 33 44 55 66 77");
   		System.out.println("average = " + String.format("%.3f", average2.getAverage()));

   		Average average3 = new Average("48 52 29 100 50 29");
   		System.out.println("\n" + "48 52 29 100 50 29");
   		System.out.println("average = " + String.format("%.3f", average3.getAverage()));

   		Average average4 = new Average("0");
   		System.out.println("\n" + "0");
   		System.out.println("average = " + String.format("%.3f", average4.getAverage()));

   		Average average5 = new Average("100 90 95 98 100 97");
   		System.out.println("\n" + "100 90 95 98 100 97");
   		System.out.println("average = " + String.format("%.3f", average5.getAverage()));
	}
}