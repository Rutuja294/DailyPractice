package NestedLoopLogic;

import java.util.Scanner;

public class SumOfFactors {
	//For every number from 1 to n, count and print the total number of its factors.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			int fact=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					fact++;
				}
			}
			System.out.println(i+" ->"+fact+" factor/factors");
		}
	}

}
