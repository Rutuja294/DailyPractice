package Course;

public class Demo {
	int x=10;
	public static void main(String[] args) {
		Demo d=new Demo();
		Demo.sample2 s2=d.new sample2();
	Demo.sample obj=new Demo.sample();
		obj.display();
		s2.show();
	}
	static class sample{
		void display() {
			System.out.println("Hello");
			//System.out.println(x);
			
		}
	}
	class sample2{
	    void show() {
	    	System.out.println(x);
	    }
	}

}
