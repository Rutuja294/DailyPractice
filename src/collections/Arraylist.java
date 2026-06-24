package collections;
import java.util.ArrayList;
import java.util.List;
public class Arraylist {
	public static void main(String args[]) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		List<Integer> arr1=new ArrayList<Integer>();
		List<Integer>list=List.of(3,4,5,6);
		arr.add(20);
		arr.add(30);
//		arr.remove(1);
//		System.out.println(arr);
		arr.add(50);
		arr.add(10);
		arr.set(0, 1);
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		System.out.println("*****************");
		for(int x:arr) {
			System.out.println(x);
		}
		System.out.println(list);
	}

	
}
