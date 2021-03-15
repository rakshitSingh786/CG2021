package test1;
import java.util.Scanner;

class Employee
{
	private String firstName;
	private String lastName;
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

}
public class Test3
{			
	public static void main(String[] args) throws Exception
	{
		validate();	
	}
	
	
	static boolean validate() throws Exception
	{
    
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter first name:");
		String firstName =sc.nextLine();
		System.out.println("Enter second name:");
		String lastName =sc.nextLine();
		System.out.println(firstName+ " "+lastName);
		int n1=firstName.length();
		int n2 = lastName.length();
		try
	    {
	    	if(firstName==""||lastName=="")
	    		throw new NullPointerException("Entry Missing");
	    }
	    
	    catch (NullPointerException e)
	    {
	     System.out.println(e);
	     System.exit(0);
	    }
		
		if(n1<3 || n2<3)
			throw new Exception("Name should be minimum three characters");
		else
		return true;
	}

}
