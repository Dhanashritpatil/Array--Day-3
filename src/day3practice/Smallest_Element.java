package day3practice;
import java.util.Scanner;
public class Smallest_Element {
	public static void main(String[] args) {
		int a[]=new int[5];int min;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Element:");
		for( int i=0;i<a.length;i++)
		{a[i]=sc.nextInt();
	}
		min=a[0];
		for( int i=1;i<a.length;i++)
		{if(a[i]<min)
          {min=a[i];
		}
}
   System.out.println("Smallest Element: "+min);
	}
}

