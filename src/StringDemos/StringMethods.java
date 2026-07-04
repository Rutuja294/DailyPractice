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
		//Character Access
		System.out.println(s10.charAt(0));
		char[] arr1=s10.toCharArray();
		System.out.println(arr1);
		
		//Comparison
		System.out.println(s10.equals(arr1));
		//Lexographical Comparision
		System.out.println(s10.compareTo(s9));
		
		//Extraction and Transformation
		String str="  Rutuja";
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
        System.out.println(str.trim());
        System.out.println(str.strip()); //Unicode Friendly
        System.out.print(str.repeat(3));
        
        
        String str1="Rutuja, Anjali, Rajendra";
        String[] arr3=str1.split(",");
        for(String abc: arr3){
        	System.out.println(abc);
        }
        
		System.out.println(String.join("-", "a","b","c"));
		
		//Conversion
		byte[] byar=str.getBytes();
		for(byte ac:byar) {
			System.out.print(ac+" ");
		}
		String name = "Rutu";
		int age = 23;
//format() Method
		String result = String.format(
		        "My name is %s and I am %d years old.",
		        name,
		        age);

		System.out.println(result);
	
	}

}
