package ForLoop;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int max=1;
		int lcm=(a*b)/max;
		for(int i=1;i<=Math.min(a, b);i++) {
			if(a%i==0 && b%i==0) {
				max=i;
			}
		}
		System.out.println(lcm);
		
				
	}

}
