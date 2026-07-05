package Generics;

public class Demo {
	public static void main(String[] args) {
		box<String> b=new box<>();
		b.value="Rutuja";
		//b.value=100; error
		System.out.println(b.value);
	}

}
 class box<T>{
	 T value;
	 
 }