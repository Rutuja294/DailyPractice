package whileLoop;

import java.util.Scanner;

public class PalindromeNum {
	//check weather the given number is a palindrome.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int rev=0;
		while(num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			num /=10;
			
		}
		if(rev == temp) {
			System.out.println("Palindrome");
			
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
