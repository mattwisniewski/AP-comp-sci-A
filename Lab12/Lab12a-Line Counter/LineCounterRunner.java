//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Matthew Wisniewski

import java.util.Scanner;

public class LineCounterRunner
{
   public static void main( String args[] )
   {
   	//Inputs the line; Prints the count
   	LineCounter count1 = new LineCounter("9 10 5 20 1 2 3");
   	System.out.println("count = " + count1.getCount());
   	
   	LineCounter count2 = new LineCounter("11 22 33 44 55 66 77 5 6 7");
   	System.out.println("count = " + count2.getCount());
   	
   	LineCounter count3 = new LineCounter("48 52 29 100 50 293 4");
   	System.out.println("count = " + count3.getCount());
   	
   	LineCounter count4 = new LineCounter("0");
   	System.out.println("count = " + count4.getCount());
   	
   	LineCounter count5 = new LineCounter("100 90 95 98 100 97");
   	System.out.println("count = " + count5.getCount());
   }
}