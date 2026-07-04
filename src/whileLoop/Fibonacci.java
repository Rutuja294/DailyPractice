package whileLoop;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		//Print the Fibonacci series up to n terms.
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int a=0;
		int b=1;
		System.out.print(a+" "+b+" ");

		while(i<=n-2) {
			int c=a+b;
			System.out.print(c+" ");
			a=c;
			i++;
		}
	}

}
