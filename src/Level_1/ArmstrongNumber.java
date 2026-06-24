package Level_1;
import java.util.*;
public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int sum=0;
		int count=0;
		int temp=num;
		int original=num;
		while(num>0) {
			num=num/10;
			count++;
		}
		while(temp>0) {
			int digit=temp%10;
			sum=sum+ (int)Math.pow(digit,count);
			temp=temp/10;
		}
		if(original == sum) {
			System.out.println("Given Number is Armstrong Number");
		}
		else {
			System.out.println("It's Not");
		}
		
	}

}
