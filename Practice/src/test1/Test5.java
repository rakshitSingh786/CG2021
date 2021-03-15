package test1;
import java.util.*;
public class Test5 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		String q=s.substring(s.length()-n);
		
		for(int i=1;i<=n;i++)
		{
			System.out.print(q);
		}
		
	}

}
