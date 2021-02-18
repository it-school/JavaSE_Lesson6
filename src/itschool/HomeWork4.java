package itschool;

import java.util.Arrays;
import java.util.Date;

public class HomeWork4
{
	public static int[] sort(int[] array)
	{
		Arrays.sort(array);
		return array;
	}

	public static void print(int[] array)
	{
		System.out.println(Arrays.toString(array));
	}

	public static boolean contains(int[] array, int number)
	{
		Arrays.sort(array);
		return Arrays.binarySearch(array, number) >= 0;

/*		for (int n:array)
		{
			if (n == number)
				return true;
		}
		return false;
*/
	}

	public static boolean contains(double[] array, double number)
	{
		for (double n : array) {
			if (Math.abs(n - number) < 1E-15) { return true; }
		}
		return false;
	}

	public static void main(String[] args)
	{
		int[] array = {2, 7, 4, 0, -3, 5, 8, 0, 2, 4, 8};

		HomeWork4.print(array);
		array = HomeWork4.sort(array);
		HomeWork4.print(array);

		System.out.println("4 - " + HomeWork4.contains(array, 4));
		System.out.println("6 - " + HomeWork4.contains(array, 6));

		double[] arrayD = {1.4, 6.3, 7.0, 7.1, -4.8, 3, 3.5};
		System.out.println("7.1 - " + HomeWork4.contains(arrayD, 14.2 / 2.0));
		Date date = new Date();
		System.out.println(1900 + date.getYear());
	}
}
