package Level_1;

public class Grade {
	public static String checkGrade(int marks) {
		if(marks>=85) {
			return "A Grade";
		}
		
		else if(marks>=70 && marks<=84) {
			return "B Grade";
		}
		
		else if(marks>=55 && marks<=69) {
			return "C Grade";
		}
		else if(marks>=40 && marks<=54) {
			return "D Grade";
		}
		else
		return "F Grade";
	}
	public static void main(String[] args) {
		System.out.println(checkGrade(95));
		System.out.println(checkGrade(66));
		System.out.println(checkGrade(45));
	}

}
