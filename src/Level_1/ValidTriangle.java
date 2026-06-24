package Level_1;

public class ValidTriangle {
	public static String check(int a,int b,int c) {
		if(a+b<c && a+c<b && c+b<a) {
			return "Valid Triangle";
		}
		else
		return "Invalid";
	}
	public static void main(String[] args) {
		System.out.println(check(12, 10, 11));
		
		
	}

}
