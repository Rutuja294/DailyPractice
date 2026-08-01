package ForLoop;

import java.util.Scanner;

public class possiblePairs {
	public static void main(String[] args) {
		//possible pairs
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				System.out.print("( "+i+","+j+" )");
			}
			System.out.println(" ");
		}
	}

}
