package Level_1;

public class TypesOfMethods {
	public static void nikhil() {
		System.out.println("Nikhil Patil is Static");
	}
	public void rutuja() {
		System.out.println("Rutuja Patil is Non Static");
	}
	public static void main(String[] args) {
		TypesOfMethods tc=new TypesOfMethods();
		nikhil();
		tc.rutuja();
	}

}
