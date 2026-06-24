package Level_1;

public class MiddleNumOfThree {
	public static String compare(int num) {
		int a=num%10;
		int b=(num/10)%10;
		int c=((num/10)/10)%10;
		if(b>a && b>c) {
			return "Middle Number is Largest";
		}
		else if(b<a && b<c) {
			return "Middle Number is Smallest";
		}
		
		else
		return "Neither Both"; 
	}
	public static void main(String args[]) {
		System.out.println(compare(104));
	}

}
