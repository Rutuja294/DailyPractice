package ForLoop;

import java.util.Scanner;

public class FibonacciWithSum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int term=sc.nextInt();
		int a=0,b=1,sum=1;
		System.out.print(a+" "+b+" ");
		for(int i=0;i<=term-2;i++) {
			int c=a+b;
			sum+=c;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		System.out.println("\nSum= "+sum);
	}

}
