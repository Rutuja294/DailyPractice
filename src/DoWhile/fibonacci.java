package DoWhile;

import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		//Print the Fibonacci series up to the required number of terms.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter terms: ");
		int term=sc.nextInt();
		int i=term-2;
		int a=0,b=1;
		System.out.print(a+" "+b+" ");
		do {
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			i--;
		}while(i>0);
	}

}
