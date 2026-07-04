package whileLoop;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		//Calculate and print the factorial of a given number.
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i=1 , fact=1;
		while(i<=num) {
			fact*=i;
			i++;
		}
		System.out.println(fact);
	}

}
