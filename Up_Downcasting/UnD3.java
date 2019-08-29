//hierarchical inheritance upcasting and downcasting

class Demo3_1
{
	public void test1()
	{
		System.out.println("Demo1");
	}
}

class Demo3_2 extends Demo3_1
{
	public void test2()
	{
		System.out.println("Demo2");
	}
}

class Demo3_3 extends Demo3_1
{
	public void test3()
	{
		System.out.println("Demo3");
	}
}

class  UnD3
{
	public static void main(String[] args) 
	{
		Demo3_1 d1 = new Demo3_3();
		d1.test1();
//		d1.test3();   //		  |||debugging|||   //upcasting\\
		System.out.println("===========================");
		Demo3_3 d3= (Demo3_3) d1;
		d3.test1();				//downcasting\\
		d3.test3();
		System.out.println("===========================");
		Demo3_1 d2 = new Demo3_2();				//upcasting\\
		d2.test1();						
		System.out.println("===========================");
		Demo3_2 d4 = (Demo3_2) d2;
		d4.test1();
		d4.test2();
	}
}
