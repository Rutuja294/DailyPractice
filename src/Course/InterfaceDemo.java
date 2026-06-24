package Course;

public class InterfaceDemo {
	public static void main(String[] args) {
		car c=new BlackThar();
		c.drive();
		
		//Dynamic Polymorphism
		payment pc=new Credit();
		pc.pay();
		
		payment pd=new Debit();
		pd.pay();
		
		//variable inside interface
	System.out.println(mathsConstant.pivalue);
	}

}
interface car{
	void drive();
}
 abstract class  Thar implements car{
	abstract public void drive();
	}
class BlackThar extends Thar{
	public void drive() {
		System.out.println("Hello I'm Driving Thar");
	}
}



//Dynamic Polymorphism 
interface payment{
	void pay();
}
class Credit implements payment{
	@Override
	public void pay() {
		System.out.println("Money Credited");
	}
}
class Debit implements payment{
	@Override
	public void pay() {
		System.out.println("Money Debited");
	}
}


//Variable inside Interface 
interface mathsConstant {
	double pivalue=3.14;
}

