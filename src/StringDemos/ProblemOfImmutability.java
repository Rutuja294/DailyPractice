package StringDemos;

public class ProblemOfImmutability {
public static void main(String[] args) {
	String s=" ";
	for(int i=0;i<5;i++) {
		s +=i;
		System.out.println(s);
	}
	
	System.out.println("*******************");
	String s1=" ";
	for(int j=0;j<5;j++) {
		s1+="*";
		System.out.println(s1);
	}
}
}
