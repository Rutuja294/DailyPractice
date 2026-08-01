package ForLoop;

import java.util.Scanner;

public class CheckPrime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		boolean prime =true;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				prime=false;
				break;
			}
		}
		if(prime) {
			System.out.println("It's Prime");
		}
		else {
			System.out.println("It's not Prime");
		}
	}

}
