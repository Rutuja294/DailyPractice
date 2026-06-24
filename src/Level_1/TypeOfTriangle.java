package Level_1;

public class TypeOfTriangle {
	public static String type(int a,int b,int c) {
		if(a==b && b==c && c==a ) {
			return "Equilateral";
		}
		
		if(a==b || b==c || c==a){
			return "Isosceles";
		}
		else
		return "Scalene Triangle";
	}
	public static void main(String[] args) {
		System.out.println(type(3, 3, 3));
		System.out.println(type(3, 3, 5));
		System.out.println(type(5, 4, 3));
	}

}
