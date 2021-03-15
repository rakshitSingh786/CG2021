package test1;
class Fruit
{ 
	protected String name,taste; 
	Fruit(String n,String t)
	{ 
		name=n;
		taste=t;
	}
	void eat() 
	{ 
		System.out.println(name+" "+taste); 
	} 
}

class Apple extends Fruit
{
	Apple(String n, String t)
	{
		super(n,t); 
	}
	
	@Override void eat() 
	{ 
		System.out.println(name+" "+taste); 
	}
}


class Orange extends Fruit
{ 
	Orange(String n, String t) 
	{
		super(n,t); 
	} 

	@Override void eat() 
	{ 
		System.out.println(name+" "+taste); 
	}
}


public class Test1
{
	public static void main(String args[]) 
	{ 
		Apple a= new Apple("Apple","Sweet"); 
		Orange o=new Orange("Orange","Sour");
		a.eat();
		o.eat();
	}
 }

