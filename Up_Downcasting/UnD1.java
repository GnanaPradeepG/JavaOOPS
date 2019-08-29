//single level upasting and down casting

class A
{
	public void	test1()
	{
		System.out.println("Demo1");
	}
}

class B extends A

{
	public void test2()
	{
		System.out.println("Demo2");
	}
}

class  UnD1
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		A a1 = (A) b1;
		a1.test1();
		System.out.println("===========");
		B b2 = (B) a1;
		b2.test1();
		b2.test2();
	}
}
