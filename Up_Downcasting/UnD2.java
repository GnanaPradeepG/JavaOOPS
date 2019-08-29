//multilevel level upcasting and downcasting

class Demo2_1
{
	public void	test1()
	{
		System.out.println("Demo1");
	}
}

class Demo2_2 extends Demo2_1

{
	public void test2()
	{
		System.out.println("Demo2");
	}
}

class Demo2_3 extends Demo2_2
{
	public void test3()
	{
		System.out.println("Demo3");
	}
}

class  UnD2
{
	public static void main(String[] args) 
	{
		Demo2_3 d1 = new Demo2_3();
		Demo2_2 d2 = (Demo2_2) d1;
		d2.test1();
		d2.test2();
		System.out.println("===================");
		Demo2_1 d3 = (Demo2_1) d2;
		d3.test1();
		System.out.println("===================");
		Demo2_2 d4 = (Demo2_2) d3;
		d4.test1();
		d4.test2();
		System.out.println("===================");
		Demo2_3 d5 = (Demo2_3) d4;
		d5.test1();
		d5.test2();
		d5.test3();
	}
}
