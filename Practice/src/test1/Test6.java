package test1;
import java.util.*;
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		System.out.println("Enter a number");
		int n=sc.nextInt();
		String fro=repeatFront(s,n);
		System.out.println("The final string is: "+fro);
	}
	
	public static String repeatFront(String s, int n)
	{
		String q=s.substring(0,n);
		
		while(n>0)
		{
			q=q+s.substring(0,n-1);
			n--;
		}
		return q;
	}

}
