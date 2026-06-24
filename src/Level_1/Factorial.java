package Level_1;
import java.util.*;
public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int fact=1;
		if(num==0 || num==1) {
			fact=0;
		}
		else {
			for(int i=num;i>0;i--){
				fact=fact*i;
			
		}}
		System.out.println(fact);

			}}
	


