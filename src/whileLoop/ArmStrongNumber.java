package whileLoop;

import java.util.Scanner;

public class ArmStrongNumber {
	//Check weather the give number is Armstrong Number
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0 , count=0;
		int temp=num;
		while(temp>0) {
			count++;
			temp=temp/10;
			
		}
		temp=num;
		while(temp>0) {
			int digit=temp%10;
			sum=sum+ (int)Math.pow(digit, count);
			temp=temp/10;
		}
		if(num==sum) {
			System.out.println("It's a ArmStrong Number");
			
		}
		else {
			System.out.println("It's Not armstrong number");
		}
	}
	

}
