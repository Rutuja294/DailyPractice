package collections;
import java.util.ArrayList;
import java.util.Collections;
public class ReverseArrayList {
	public static void main(String args[]) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		Collections.reverse(list);
		System.out.print(list);
		
	}
}
