package Level_1;
import java.util.*;
public class MultipleOfSeven {
	public static String check(int num) {
		if(num%10==7 || num%7==0) {
			return "Given Number is Multiple of 7 Or ends with 7";
		}
		else
		return "Given Number Is Not Multiple of 7 Or ends With 7";
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int a=sc.nextInt();
		System.out.println(check(a));
		
	}

}
