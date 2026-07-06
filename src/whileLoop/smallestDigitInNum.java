package whileLoop;

import java.util.Scanner;

public class smallestDigitInNum {
	public static void main(String[] args) {
		//Find the smallest digit in the given number.
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int min=9;
		while(num>0) {
			int temp=num%10;
			if(temp<min) {
				min=temp;
			}
			num/=10;
		}
		System.out.println(min);
	}

}
