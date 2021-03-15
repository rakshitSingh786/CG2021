package test1;
import java.util.*;
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two strings");
		String a=sc.nextLine();
		String b=sc.nextLine();
		String mix=mixString(a,b);
		System.out.println("The final string is: "+mix);
	}
	
	public static String mixString(String a, String b)
	{
	    String mix="";
	    int len;

	    if (a.length()>=b.length())
	        len=a.length();
	    else
	        len=b.length();

	    for (int i=0;i<len;i++)
	    {
	        if (i<a.length())	        
	            mix+=a.charAt(i);	        

	        if (i<b.length())	        
	            mix+=b.charAt(i);
	    }
	    return mix;
	}
	}


