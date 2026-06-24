package Level_1;

public class MultipleOfEachOther {
	public static String multiple(int a,int b) {
		if(a%b==0 || b%a==0) {
			return "It is Multiple";
		}
		else
		return "It's Not";
	}
	public static void main (String args[]) {
		System.out.println(multiple(4,8));
		System.out.println(multiple(4,2));
		System.out.println(multiple(5, 6));
	}

}
