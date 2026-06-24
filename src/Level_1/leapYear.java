package Level_1;

public class leapYear {
	public static String Leap(int year) {
		if(year%4==0) {
			return year+" is Leap Year";
		}
		else
		return year+" is not Leap Year";
	}
	public static void main(String[] args) {
		System.out.println(Leap(2024));
		System.out.println(Leap(1999));
		
	}

}
