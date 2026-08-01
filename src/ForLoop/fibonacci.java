package ForLoop;

import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of terms: ");
		int term=sc.nextInt();
		int a=0;
		int b=1;
		System.out.print(a+" "+b+" ");
		for(int i=1;i<=term-2;i++) {
			int temp=a+b;
			System.out.print(temp+" ");
			a=b;
			b=temp;
		}
	}

}
