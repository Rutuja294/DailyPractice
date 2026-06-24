package collections;
import java.util.Scanner;
import java.util.ArrayList;
public class LargestFromArrayList {
	public static void main(String args[]) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of List");
		int n=sc.nextInt();
		System.out.println("Enter Elements");
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}
		int max=list.get(0);
		for(int i=1;i<n;i++) {
			if(list.get(i)>max) {
				max=list.get(i);
			}	
		}
		System.out.println("Largest Number is "+max);	
	}

}
