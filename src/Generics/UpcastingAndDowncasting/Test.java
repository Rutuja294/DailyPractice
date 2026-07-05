package Generics.UpcastingAndDowncasting;

public class Test {
	public static void main(String[] args) {
		Animal a=new Dog();
		//Upcasting
		a.sound();
		//Downcasting
		Dog dd=(Dog) a;
		dd.eat();
		dd.sound();
		
		Dog d=new Dog();
		d.eat();
		d.sound();
	}
	
	

}
