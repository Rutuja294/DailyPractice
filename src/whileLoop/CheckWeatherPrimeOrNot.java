package whileLoop;

import java.util.Scanner;

public class CheckWeatherPrimeOrNot {
	public static void main(String[] args) {
		//Check whether the given number is a prime number.
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int j=2;
		boolean prime=true;
		while(j<=num/2) {
			if(num%j==0) {
				prime=false;
				break;
			}
			j++;
		}
		if(prime) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not Prime Number");
		}
	}

}
