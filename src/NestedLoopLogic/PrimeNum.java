package NestedLoopLogic;

import java.util.Scanner;

public class PrimeNum {
	public static void main(String[] args) {
		//Print all prime numbers up to n using nested loop checking.
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		for(int i=2;i<=num;i++) {
			boolean prime=true;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					prime=false;
					break;
				}
			}
			if(prime) {
				System.out.println(i);
			}
		}
	}

}
