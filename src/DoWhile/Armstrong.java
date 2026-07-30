package DoWhile;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		int temp=num;
		int sum=0,count=0;
		do {
			temp=temp/10;
			count++;
		}while(temp!=0);
		temp=num;
		do {
			int a =temp%10;
			sum=sum+(int)Math.pow(a, count);
			temp=temp/10;
		}while(temp!=0);
		if(num==sum) {
			System.out.println("It's Armstrong Number");
		}
		else {
			System.out.println("It's not Armstrong Number");
		}
		
	}

}
