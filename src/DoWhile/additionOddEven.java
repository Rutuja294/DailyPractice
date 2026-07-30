package DoWhile;

import java.util.Scanner;

public class additionOddEven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		int odd=0,even=0;
		do {
			int temp=num%10;
			if(temp%2==0){
				even+=temp;
			}
			else {
				odd+=temp;
			}
			num=num/10;
		} while (num!=0);
		
		System.out.println("Sum of even Numbers: "+even);
		System.out.println("Sum of Odd Numbers: "+odd);
	}

}
