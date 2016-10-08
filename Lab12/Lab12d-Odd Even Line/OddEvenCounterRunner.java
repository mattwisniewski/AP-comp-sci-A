/**
 * OddEvenCounterRunner.java  9/16/2016
 *
 * @author - Matthew Wisniewski
 * @author - Period 8
 * @author - Id 859732
 *
 * @author - I received help from no one
 *
*/

public class OddEvenCounterRunner
{
    public static void main(String[] args)
    {
   		OddEvenCounter oddeven1 = new OddEvenCounter("9 10 5 20");
   		System.out.println("9 10 5 20");
   		System.out.println("even count = " + oddeven1.getEvenCount());
   		System.out.println("odd count = " + oddeven1.getOddCount());

   		OddEvenCounter oddeven2 = new OddEvenCounter("11 22 33 44 55 66 77");
   		System.out.println("\n" + "11 22 33 44 55 66 77");
   		System.out.println("even count = " + oddeven2.getEvenCount());
   		System.out.println("odd count = " + oddeven2.getOddCount());

   		OddEvenCounter oddeven3 = new OddEvenCounter("3 5 3 1 5 7 5 4 3 2 7 8 9 9 9 6");
   		System.out.println("\n" + "3 5 3 1 5 7 5 4 3 2 7 8 9 9 9 6");
   		System.out.println("even count = " + oddeven3.getEvenCount());
   		System.out.println("odd count = " + oddeven3.getOddCount());

   		OddEvenCounter oddeven4 = new OddEvenCounter("2 4 6 8 2 4 6");
   		System.out.println("\n" + "2 4 6 8 2 4 6");
   		System.out.println("even count = " + oddeven4.getEvenCount());
   		System.out.println("odd count = " + oddeven4.getOddCount());

   		OddEvenCounter oddeven5 = new OddEvenCounter("1 3 5 7 9 1 3 5");
   		System.out.println("\n" + "1 3 5 7 9 1 3 5");
   		System.out.println("even count = " + oddeven5.getEvenCount());
   		System.out.println("odd count = " + oddeven5.getOddCount());
	}
}