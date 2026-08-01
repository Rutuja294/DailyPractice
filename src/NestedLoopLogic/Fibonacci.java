package NestedLoopLogic;

import java.util.Scanner;

public class Fibonacci {
//Print the Fibonacci pattern row by row, where each row prints the next Fibonacci numbers
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int term=sc.nextInt();
		
		for(int i=1;i<=term;i++) {
			int a=0,b=1;
			for(int j=1;j<=i;j++) {
				System.out.print(a+" ");
				int c=a+b;
				a=b;
				b=c;
				
			}
			System.out.println(" ");
		}
		
	}
}
