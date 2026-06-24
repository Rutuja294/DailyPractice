package Level_1;
import java.util.*;
public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of Array");
		int n=sc.nextInt();
		String arr[] = new String[n];
		System.out.println("Enter Array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.next();
		}
		
		int start=0;
		int end=n-1;
		while(start<end) 
		{
			String temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		System.out.println("Reversed Array");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+"");		
		}	
		}
	}


