package whileLoop;

import java.util.Scanner;

public class CubeNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Print the cube of each number from 1 to n.
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		int i=1;
		while(i<=num) {
			System.out.println(i+"= "+(i*i*i));
			i++;
		}
	}

}
