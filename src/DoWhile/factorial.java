package DoWhile;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		//Calculate and print the factorial of the given number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter NUmber: ");
		int num=sc.nextInt();
		int fact=1;
		if(num==0) {
			System.out.println(1);
		}
		else {
			do {
				fact=num *fact;
				num--;
			} while (num>0);
			System.out.println(fact);
		}
	}

}
