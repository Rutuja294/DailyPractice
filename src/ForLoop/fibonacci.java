package ForLoop;

import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of terms: ");
		int term=sc.nextInt();
		int a=0;
		int b=1;
	
		for(int i=1;i<=term;i++) {
			
			System.out.print(a+" ");
			int temp=a+b;
			a=b;
			b=temp;
		}
	}

}
