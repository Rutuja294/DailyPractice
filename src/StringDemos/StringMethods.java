package StringDemos;

public class StringMethods {
	public static void main(String[] args) {
		String s1= new String("");
		String s2=new String("Hello");
		String s3="Rutuja";
		System.out.println(s1);
		System.out.println(s2);
		String s4=new String(s3);
		System.out.println(s4);
		
		
		//char array
		char[] arr= {'R','U','T','U'};
		String s5=new String(arr);
//		arr[0]='T';
		System.out.println(arr);
		
		//Char array Subset
		String s6=new String(arr,0,2);
		System.out.println(s6);
		
		byte[] arr2= {97,98,99};
		String s7=new String(arr2);
		
		System.out.println(s7);
		//StringBuilder StringBuffer
		StringBuilder sb=new StringBuilder("Hello");
		String s8=new String(sb);
		System.out.println(s8);
		
		StringBuilder sbb=new StringBuilder("Hello");
		String s9=new String(sbb);
		System.out.println(s9);
		System.out.println("********String Methods**********");
		//String Methods
		//Length
		
		String s10="Hello";
		System.out.println(s10.length());
		System.out.println(s10.isEmpty());
		System.out.println(s10.isBlank());
		
		
	
	}

}
