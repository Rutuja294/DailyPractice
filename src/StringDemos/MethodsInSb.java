package StringDemos;

public class MethodsInSb {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		sb.append("Rutuja");
		sb.append(" Patil");
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println(sb.capacity());
		String str=sb.toString();
		System.out.println(str);
	}

}
