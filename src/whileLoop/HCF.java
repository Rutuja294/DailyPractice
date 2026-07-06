package whileLoop;

import java.util.Scanner;

public class HCF {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Find the HCF (Highest Common Factor) of two given numbers.
		System.out.println("Enter a: ");
		int a=sc.nextInt();
		
		System.out.println("Enter b: ");
		int b=sc.nextInt();
		
		int i=1;
		int max=i;
		while(i<=Math.min(a, b)) {
			if(a%i==0 && b%i==0) {
				max=i;
			}
			i++;
		}
		System.out.println(max);
	}

}
