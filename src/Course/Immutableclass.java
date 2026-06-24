package Course;

public class Immutableclass {
	public static void main(String[] args) {
		Immutableclass s1=new Immutableclass(23, "Rutuja");
		System.out.println(s1.getAge());
		System.out.println(s1.getName());
	}
	private final int age;
	private final String name;
	public Immutableclass(int age,String name) {
		this.age=age;
		this.name=name;
		// TODO Auto-generated constructor stub
		
	}
	public int getAge() {
		return this.age;
	}
	
	public String getName() {
		return this.name;
	}

}
