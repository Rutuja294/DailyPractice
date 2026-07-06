package whileLoop;

import java.util.Scanner;

public class LargestDIgitInNum {
	public static void main(String[] args) {
		//Find the largest digit in the given number.
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int max=0;
		while(num>0) {
			int temp=num%10;
			if(temp>max) {
				max=temp;
			}
			num/=10;
		}
		System.out.println(max);
	}

}
