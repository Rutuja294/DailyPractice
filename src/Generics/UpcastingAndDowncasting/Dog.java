package Generics.UpcastingAndDowncasting;

public class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("Dog Barking");
		
	}
	
	void eat() {
		System.out.println("Dog is Eating");
	}

}
