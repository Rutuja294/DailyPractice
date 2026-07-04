package whileLoop;

import java.util.Scanner;

public class PerfectNum {
	//Check Weather the given number is a Perfect number.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		int i=1;
		while(i<num) {
			if(num%i==0) {
				sum+=i;
			}
			i++;
		}
		if(num==sum) {
			System.out.println("Perfect Number");
		}
		else {
			System.out.println("Not Perfect Number");
		}
	}

}
