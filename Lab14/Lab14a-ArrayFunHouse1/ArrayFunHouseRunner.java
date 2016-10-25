/**
 * ArrayFunHouseRunner.java  10/7/2016
 *
 * @author - Matthew Wisniewski
 * @author - Period 4
 * @author - Id 859732
 *
 * @author - I received help from no one
 *
*/
import java.util.Arrays;

public class ArrayFunHouseRunner
{
	public static void main(String[] args)
	{
		//Sets the array to the given array
		int[] one = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};
		System.out.println(Arrays.toString(one));
		System.out.println("sum of spots 3-6  =  " + ArrayFunHouse.getSum(one, 3, 6));
		System.out.println("sum of spots 2-9  =  " + ArrayFunHouse.getSum(one, 2, 9));
		System.out.println("# of 4s  =  " + ArrayFunHouse.getCount(one, 4));
		System.out.println("# of 9s  =  " + ArrayFunHouse.getCount(one, 9));
		System.out.println("# of 7s  =  " + ArrayFunHouse.getCount(one, 7));
		System.out.println("new array with all 7s removed = " + Arrays.toString(ArrayFunHouse.removeVal(one, 7)));
		System.out.println("# of 7s  =  " + ArrayFunHouse.getCount(ArrayFunHouse.removeVal(one, 7), 7));
		//Sets the array to the given array
		int[] two = {7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 7, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8, 7};
		System.out.println("\n\n" + Arrays.toString(two));
		System.out.println("sum of spots 3-6  =  " + ArrayFunHouse.getSum(two, 3, 16));
		System.out.println("sum of spots 2-9  =  " + ArrayFunHouse.getSum(two, 2, 9));
		System.out.println("# of 0s  =  " + ArrayFunHouse.getCount(two, 0));
		System.out.println("# of 3s  =  " + ArrayFunHouse.getCount(two, 3));
		System.out.println("# of 7s  =  " + ArrayFunHouse.getCount(two, 7));
		System.out.println("new array with all 7s removed = " + Arrays.toString(ArrayFunHouse.removeVal(two, 7)));
		System.out.println("# of 7s  =  " + ArrayFunHouse.getCount(ArrayFunHouse.removeVal(two, 7), 7));
	}
}