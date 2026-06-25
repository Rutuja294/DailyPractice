package StringDemos;

public class ExamplesOfCompileAndRuntimeCon {
	public static void main(String[] args) {
		String s1="ja" +"va";
		String s2="java";
		System.out.println(s1==s2);//true
		
		String s3="Hello";
		String s4=s3+ " World";
		String s5="Hello World";
		System.out.println(s4==s5);//false
		
		String s6="Hello";
		String s7=s6;
		System.out.println(s6==s7);//true
		
		String s8="hello";
		s8="World";
		System.out.println(s8);//World
		
		String s9=new String("Hello");
		String s10="Hello";
		System.out.println(s9==s10);//false
		
		
	}

}
