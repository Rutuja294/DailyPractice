package whileLoop;

import java.util.Scanner;

public class PrimeNumFrom1To100 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=2;
		while(i<=100) {
			boolean prime=true;
			int j=2;
			while(j<=i/2) {
				if(i%j==0) {
					prime=false;
					break;
				}
				j++;
			}
			if(prime) {
				System.out.println(i);
			}
			i++;
		}
		
		
	}

}
