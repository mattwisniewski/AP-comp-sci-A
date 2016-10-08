//(c) A+ Computer Science
//www.apluscompsci.com
//Name -


import java.util.Scanner;

public class LineTotallerRunner
{
   public static void main( String args[] )
   {
   	//Inputs the line; Prints the line; Prints the total
   	LineTotaller total1 = new LineTotaller("1 2 3 4 5 6");
   	System.out.println("1 2 3 4 5 6");
   	System.out.println("sum = " + total1.getSum());
   	
   	LineTotaller total2 = new LineTotaller("10 20 30 40 50 60");
   	System.out.println("10 20 30 40 50 60");
   	System.out.println("sum = " + total2.getSum());

   	LineTotaller total3 = new LineTotaller("250 657 2154 345 6796");
   	System.out.println("250 657 2154 345 6796");
   	System.out.println("sum = " + total3.getSum());
  	
   	LineTotaller total4 = new LineTotaller("0");
   	System.out.println("0");
   	System.out.println("sum = " + total4.getSum());
	
   	LineTotaller total5 = new LineTotaller("-99 45 -98 92 87");
   	System.out.println("-99 45 -98 92 87");
   	System.out.println("sum = " + total5.getSum());
   
	}
}