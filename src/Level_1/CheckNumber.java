package Level_1;
import java.util.*;
public class CheckNumber {
	public static String check(int num) {
		if(num<10 && num>=0) {
			return "Single Digit";
		}
		
		else if(num<=99 && num>=10) {
			return "Double Digit";
		}
		
		return "Multidigit";
	}
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
		int a=sc.nextInt();
		System.out.println(check(a));
		
	}

}
