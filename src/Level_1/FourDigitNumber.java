package Level_1;

public class FourDigitNumber {
	public static String compair(int num) {
		int first=num/1000;
		int last=num%10;
		if(first==last) {
			return "Both Digits are Equal";
		}
		else
		return "Both Are Different";
	}
	
	public static void main(String args[]) {
		System.out.println(compair(1231));
	}

}
