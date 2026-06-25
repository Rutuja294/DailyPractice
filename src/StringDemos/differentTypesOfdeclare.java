package StringDemos;

public class differentTypesOfdeclare {
	public static void main(String[] args) {
		//declaring Using literals 
		String s1="Hello";
		String s2="Hello";
		String s3="World";
		
		//declaring Using new 
		String s4=new String("Hello");
		String s5=new String("Hello");
		String s6=new String("World");
		
		//Difference between == and .equals()
		System.out.println(s1==s2); //true
		System.out.println(s1==s3); //false
		System.out.println(s1==s4); //false
		System.out.println(s4==s5); //false
		System.out.println(s4==s6); //false
		
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1.equals(s3)); //false
		System.out.println(s1.equals(s4)); //true
		System.out.println(s4.equals(s5)); //true
		System.out.println(s4.equals(s6)); //false
	}

}
