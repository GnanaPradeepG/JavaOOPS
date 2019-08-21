
//Method Overriding requires inheritance for sure

class A1
{
	public void move()
	{
		System.out.println("Inside superclass move");
	}
}

class B1 extends A1
{
	public void move()
	{
		System.out.println("Inside subclass move");
	}
}

class	MethodOverriding  
{
	public static void main(String[] args) 
	{
		A1 a = new A1();
		a.move();
		B1 b = new B1();
		b.move();
	}
}
