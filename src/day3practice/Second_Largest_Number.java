package day3practice;
import java.util.Arrays;
public class Second_Largest_Number {
	public static void main(String[] args) {
		int[] array= {1,20,4,6,16,10};
		Arrays.sort(array);
		
		System.out.println("Second Largest Number:"+array[array.length-2]);

	}

}
