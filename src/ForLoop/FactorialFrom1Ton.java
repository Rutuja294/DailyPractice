package ForLoop;

import java.util.Scanner;

public class FactorialFrom1Ton {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int fact=1;
			for(int j=1;j<=i;j++) {
				fact *=j;
				
			}
			System.out.println("factorial of "+i+" is "+fact);
		}
	}

}
