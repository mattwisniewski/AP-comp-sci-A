/**
 * LineBreakerRunner.java  9/16/2016
 *
 * @author - Matthew Wisniewski
 * @author - Period 8
 * @author - Id 859732
 *
 * @author - I received help from no one
 *
*/
public class LineBreakerRunner
{
	public static void main(String[] args)
    {
   		LineBreaker breaker1 = new LineBreaker("1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9", 4);
   		System.out.println("1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9");
   		System.out.println(breaker1.getLineBreaker());
   		LineBreaker breaker2 = new LineBreaker("t h e b i g b a d w o l f h a d b i g e a r s a n d t e e t h", 2);
   		System.out.println("\n" + "t h e b i g b a d w o l f h a d b i g e a r s a n d t e e t h ");
   		System.out.println(breaker2.getLineBreaker());
   		LineBreaker breaker3 = new LineBreaker("a c o m p u t e r s c i e n c e p r o g r a m", 7);
   		System.out.println("\n" + "a c o m p u t e r s c i e n c e p r o g r a m");
   		System.out.println(breaker3.getLineBreaker());
   		LineBreaker breaker4 = new LineBreaker("i a m s a m i a m", 2);
   		System.out.println("\n" + "i a m s a m i a m");
   		System.out.println(breaker4.getLineBreaker());
    }
}