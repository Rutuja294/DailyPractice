package whileLoop;

import java.util.Scanner;

public class SumOfDigitInNum {
	//Find and print sum of Digits of given Number
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		while(num>0) {
			int temp=num%10;
			sum=sum+temp;
			num=num/10;
		}
		System.out.println(sum);
	}

}
