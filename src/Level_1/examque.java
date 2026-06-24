package Level_1;
import java.util.*;
public class examque {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> list=new ArrayList<Integer>();
		System.out.println("Enter N");
		int n=sc.nextInt();
		
		System.out.println("Enter terms in List");
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}
		int sum=0;
		for(int num:list) {
			int min=9;
			while(num>0) {
				int digit=num%10;
				if(digit<min) {
					min=digit;
				}
				num=num/10;
			}
			sum=sum+min;
		}
		System.out.println(sum);
	}
}
