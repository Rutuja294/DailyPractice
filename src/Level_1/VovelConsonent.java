package Level_1;

public class VovelConsonent {
	public static String check(char a) {
		 a=Character.toLowerCase(a);
		 if(a=='a' || a=='e' || a=='i' || a=='o'  || a=='u' ) {
			 
			 return a+" is Vovel";
		 }
		 else
		return a+" is Consonent";
	}
	public static void main(String[] args) {
		System.out.println(check('c'));
		System.out.println(check('o'));
		
	}

}
