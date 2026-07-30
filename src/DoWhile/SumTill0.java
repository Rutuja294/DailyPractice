package DoWhile;

import java.util.Scanner;

public class SumTill0 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//Keep taking numbers from the user until 0 is entered, then print the sum of all entered numbers.
		int sum=0;
		boolean found=true;
		do {
			System.out.println("Enter Number: ");
			int a=sc.nextInt();
			sum+=a;
			if(a==0) {
				found=false;
			}
		}while(found);
		System.out.println(sum);
	}


}
