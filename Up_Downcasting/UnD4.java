class Demo4_1
{
	public void test1()
	{
		System.out.println("The superclass method");
	}
}

class Demo4_2 extends Demo4_1
{
	public void test1()
	{
		System.out.println("The subclass method");
	}
}

class UnD4 
{
	public static void main(String[] args) 
	{
		Demo4_1 d1 =(Demo4_1) new Demo4_2();
		d1.test1();
	}
}
