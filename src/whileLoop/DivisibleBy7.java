package whileLoop;

import java.util.Scanner;

public class DivisibleBy7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Print all numbers between a and b that are divisible by 7.
		System.out.println("For range Enter first number: ");
		int a=sc.nextInt();
		System.out.println("For range Enter last number: ");
		int b=sc.nextInt();
		
		while(a<=b){
			if(a%7==0) {
				System.out.println(a);
			}
			a++;
		}
		
	}

}
