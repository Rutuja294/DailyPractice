package DoWhile;

import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		//Print the Fibonacci series up to the required number of terms.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter terms: ");
		int term=sc.nextInt();
		int a=0,b=1;
		int i=term;
		do {
			
			System.out.print(a+" ");
			int c=a+b;
			a=b;
			b=c;
			i--;
		}while(i>0);
	}

}
