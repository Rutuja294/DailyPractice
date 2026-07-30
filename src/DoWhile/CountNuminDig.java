package DoWhile;

import java.util.Scanner;

public class CountNuminDig {
	public static void main(String[] args) {
		//Count and print the number of digits in the given number
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Number: ");
	    int num=sc.nextInt();
	    int count=0;
	    do {
	    	num=num/10;
	    	count++;
	    }while(num!=0);
	    System.out.println(count);
	}

}
