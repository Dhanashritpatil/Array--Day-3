package day3practice;

public class Even_Position {
	public static void main(String[] args) {
		int[]arr=new int [] {1,2,3,4,5,7,8};
		for( int i=0; i<arr.length;i++)
		{System.out.println(+arr[i]);

	   }
       System.out.println("Even Position:");
       for( int i=1; i<arr.length;i=i+2)
         {System.out.println(+arr[i]);
         }
   }		
	}

