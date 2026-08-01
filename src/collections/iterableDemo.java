package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class iterableDemo {
	public static void main(String[] args) {
		List<Integer> list=new LinkedList<Integer>();
		list.add(13);
		list.add(45);
		list.add(65);
		list.add(67);
		list.add(89);
		
		Iterator<Integer> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	

}
