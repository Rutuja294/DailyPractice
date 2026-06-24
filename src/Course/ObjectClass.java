package Course;

public class ObjectClass {
	public static void main(String[] args) {
		ObjectClass obj=new ObjectClass();
		obj.name="Rutuja";
		obj.age=23;
		System.out.println(obj.toString());
		ObjectClass obj1=new ObjectClass("Anjali", 23);
		ObjectClass obj2=new ObjectClass("Anjali", 23);
		System.out.println(obj1.equals(obj1));
		System.out.println(obj.hashCode());
		System.out.println(obj.hashCode());
		System.out.println(obj.getClass());
	}
	String name;
	int age;
	public ObjectClass(String name,int age) {
		this.age=age;
		this.name=name;
	}
	public ObjectClass() {}
	@Override
	public String toString(){
		
		return "name: "+name+" age: "+age;
	}

}
