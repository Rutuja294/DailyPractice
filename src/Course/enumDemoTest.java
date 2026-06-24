package Course;

public class enumDemoTest {
	public static void main(String[] args) {
		enumDemo status=enumDemo.SUCCESS;
		System.out.println(status.name());
		System.out.println(enumDemo.FAILED);
		String a="success";
		if(a=="success") {
			System.out.println(enumDemo.SUCCESS);
		}
		else {
			System.out.println(enumDemo.PENDING);
		}
	}

}
