package whileLoop;
import java.util.Scanner;
public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Print the multiplication table of a given number from n × 1 to n × 10.
		int num=sc.nextInt();
		int i=1;
		while(i<=10) {
			System.out.print(num*i+" ");
			i++;
		}
	}

}
