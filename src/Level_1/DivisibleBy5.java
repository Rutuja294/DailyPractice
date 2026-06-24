package Level_1;

public class DivisibleBy5 {
	public static String IfDivisible(int num) {
		if(num%5==0) {
			return num+" is divisible By 5";
		}
		else
		return num+" is not divisible by 5";
	}
	public static void main(String[] args) {
		System.out.println(IfDivisible(20));
		System.out.println(IfDivisible(22));
		
	}

}
