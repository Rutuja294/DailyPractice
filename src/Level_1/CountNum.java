package Level_1;
import java.util.*;
public class CountNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Digit");
		int digit=sc.nextInt();
		int count=0;
		while(digit>0) {
			digit=digit/10;
			count++;
		}
			System.out.println(count);
		}
	}


