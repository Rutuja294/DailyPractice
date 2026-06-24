package Level_1;
import java.util.*;
public class Quaderant {
public static String checkQuaderant(int x,int y) {
	if(x>0 && y>0) {
		return "I Quaderant";
	}
	
	else if(x<0 && y>0) {
		return "II Quaderant";
	}
	
	else if(x<0 && y<0) {
		return "III Quaderant";
	}
	
	else if(x>0 && y<0) {
		return "IV Quaderant";
	}
	
	else
	return "Point lies At Centre";
}
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter x");
	int a=sc.nextInt();
	
	System.out.println("Enter y");
	int b=sc.nextInt();
	
	System.out.println(checkQuaderant(a, b));
}

}
