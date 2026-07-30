package DoWhile;

import java.util.Scanner;

public class palindromeNum {
	public static void main(String[] args) {
		//Check whether the given number is a palindrome
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		int temp=num;
		int rev=0;
		do {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}while(num!=0);
		if(rev==temp) {
			System.out.println("It's Palindrome");
		}
		else {
			System.out.println("It's not Palindrome");
		}
	}

}
