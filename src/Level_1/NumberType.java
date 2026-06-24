package Level_1;

public class NumberType {
	public static String type(int num) {
		if(num>0) {
			return "Positive";
		}
		else if(num<0) {
			return "Negative";
		}
		else
		return "Zero";
	}
	public static void main(String[] args) {
		System.out.println(type(-10));
		
	}

}
