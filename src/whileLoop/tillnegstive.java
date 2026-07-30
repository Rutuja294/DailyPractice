package whileLoop;

import java.util.Scanner;

public class tillnegstive {
	public static void main(String[] args) {
		//Keep taking numbers from the user until a negative number is entered, then count how many positive numbers were entered.
		Scanner sc=new Scanner(System.in);
		
		int num;
		int count=-1;
		do {
			System.out.println("Enter Number: ");
			 num=sc.nextInt();
			 count++;
		}while(num>=0);
		System.out.println(count);
	}

}
