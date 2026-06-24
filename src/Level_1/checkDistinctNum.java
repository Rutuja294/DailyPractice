package Level_1;
import java.util.*;
public class checkDistinctNum {
	public static String check(int num) {
		while(num>0) {
			int d1= num%10;
			int temp=num/10;
			while(temp>0) {
				int d2=temp%10;
				if(d1==d2) {
					return "Numbers are not Distinct";
				}
				temp=temp/10;
			}
			num=num/10;
		}
	
		return "All Digits Distinct";
	}
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int a=sc.nextInt();
		System.out.println(check(a));
	}

}
