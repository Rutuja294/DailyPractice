package whileLoop;
import java.util.Scanner;
public class PrintSum {
	//Calculate and print the sum of the first n natural numbers.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int i=1;
		while(i<=n) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
	}

}
