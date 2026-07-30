package DoWhile;

import java.util.Scanner;

public class LargestTillenter0 {
	//Keep taking numbers from the user until 0 is entered, then print the largest number among all inputs.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		int max=0;
		do {
			System.out.println("Enter Number");
			 num=sc.nextInt();
			 if(num>max) {
				 max=num;
			 }
		}while(num!=0);
		System.out.println("Largest Number is: "+max);
		
	}

}
