package Level_1;

public class EvenOdd {
	public static String EvenOdd(int num) {
		if(num%2==0) {
			return "Even";
		}
		else {
		return "Odd";
		}
	}
	public static void main(String[] args) {
		System.out.println(EvenOdd(10));
	}

}
