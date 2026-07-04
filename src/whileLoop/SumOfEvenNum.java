package whileLoop;
import java.util.Scanner;
public class SumOfEvenNum {
	//Calculate the sum of all even numbers from 1 up to n.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int sum=0;
		while(i<=n) {
			if(i%2==0) {
				sum+=i;
				
			}
			i++;
		}
		System.out.println(sum);
	}

}
