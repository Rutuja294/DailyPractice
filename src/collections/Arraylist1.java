package collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		List<String> list=new ArrayList<String>();
		System.out.println("Enter Size of List");
		int n=sc.nextInt();
		System.out.println("Enter Elements");
		for(int i=0;i<n;i++) {
			list.add(sc.next());
		}
		System.out.println(list);
	}
	

}
