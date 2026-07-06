package DoWhile;

import java.util.Scanner;

public class MultiplicationTable {
public static void main(String[] args) {
	//Print the multiplication table of a given number.
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int i=1;
	do {
		System.out.println(i*num);
		i++;
	}while(i<=10);
}
}
