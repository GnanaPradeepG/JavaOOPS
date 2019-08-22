interface Demo6_1
{
	void test1();
}

interface Demo6_2
{
	void test2();
}

class Sample6 implements Demo6_1 , Demo6_2
{
	public void test1()
	{
		System.out.println("Inside test1");	
	}

	public void test2()
	{
		System.out.println("Inside test2");	
	}
}

class  InterfacePrg6
{
	public static void main(String[] args) 
	{
		Sample6 s = new Sample6();
		s.test1();
		s.test2();
	}
}
