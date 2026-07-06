package whileLoop;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		//Find the LCM (Least Common Multiple) of two given numbers.
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int i=1;
		while(i<=(a*b)) {
			if(i%a==0 && i%b==0) {
				System.out.println(i);
				break;
			}
			i++;
		}
	System.out.println("Done");
	}

}
