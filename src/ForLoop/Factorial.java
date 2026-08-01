package ForLoop;

import java.util.Scanner;

public class Factorial {
	//Calculate and print the factorial of a given number.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact *=i;
		}
		System.out.println(fact);
	}

}
