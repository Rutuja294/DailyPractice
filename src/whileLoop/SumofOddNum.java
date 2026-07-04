package whileLoop;

import java.util.Scanner;

public class SumofOddNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Calculate the sum of all odd numbers from 1 up to n.
		int num=sc.nextInt();
		int i=1;
		int sum=0;
		while(i<=num) {
			if(i%2!=0) {
				sum+=i;
				
			}
			i++;
		}
		System.out.println(sum);
	}

}
