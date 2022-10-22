package day3practice;

public class Odd_Position {
	public static void main(String[] args) {
		int []arr=new int[] {15,6,7,5,346,7,5,4,4};
		for( int i=0;i<arr.length;i++)
		{System.out.println("index:"+arr[i]);
		
		}
		System.out.println("Odd Position:");
		for( int i=0;i<arr.length;i=i+2)
		{System.out.println("Value:"+arr[i]);

	}
		}
}
