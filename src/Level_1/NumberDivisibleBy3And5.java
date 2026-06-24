package Level_1;

public class NumberDivisibleBy3And5 {
	public static String divisible(int num) {
		if(num%3==0 && num%5==0) {
			return num+" is divisible by 3 and 5";
		}
		else
		return num+" is not divisible by 3 and 5";
	}
	public static void main(String[] args) {
		System.out.println(divisible(15));
		System.out.println(divisible(20));
	}

}
