package Course;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedreaderDemo {
public static void main(String[] args) throws IOException {
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	System.out.println("Enter Your Name");
	String name=br.readLine();
	System.out.println("Enter Your Age");
	int age = Integer.parseInt(br.readLine());
	System.out.println(name);
	System.out.println(age);
	
}
}
