package Level_1;
import java.util.*;
public class DivisibleBy7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number Of the range");
		int a=sc.nextInt();
		System.out.println("Enter Last digit of range");
		int b=sc.nextInt();
		for(int i=a;i<=b;i++) {
			if(i%7==0) {
				System.out.println(i);
			}
		}
	}

}
