package NestedLoopLogic;

import java.util.Scanner;

public class trianglePatternOfNum {
	public static void main(String[] args) {
		//number Pattern
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		for(int i=0;i<=num;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
	}

}
