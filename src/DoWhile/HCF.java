package DoWhile;

import java.util.Scanner;

public class HCF {
	public static void main(String[] args) {
		//Find the HCF (Highest Common Factor) of the given numbers.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number: ");
		int a=sc.nextInt();
		System.out.println("Enter 2nd Number: ");
		int b=sc.nextInt();
		int i=1;
		int max=i;
		
		do {
			if(a%i==0 && b%i==0) {
				max=i;
			}
			i++;
		}while(i<=Math.min(a, b));
		
		System.out.println(max);
	}

}
