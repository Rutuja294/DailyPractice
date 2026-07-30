package DoWhile;

import java.util.Scanner;

public class sumOfDig {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int sum=0;
		do {
			int temp=num%10;
			sum+=temp;
			num/=10;
		} while (num!=0);
		System.out.println(sum);
	}

}
