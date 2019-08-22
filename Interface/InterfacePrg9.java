interface Demo9
{
	void test1();
	void test2();
}

abstract class Sample9_1 implements Demo9
{
	public void test1()
	{
		System.out.println("Inside test1");
	}
}

class Sample9_2 extends Sample9_1
{
	public void test2()
	{
		System.out.println("Inside test2");
	}
}

class  InterfacePrg9
{
	public static void main(String[] args) 
	{
		Sample9_2 s = new Sample9_2();
		s.test1();
		s.test2();
	}
}
