interface Demo8_1
{
	void test();
}

interface Demo8_2
{
	void test();
}

class Sample8
{
	public void test()
	{
		System.out.println("inside test");
	}
}
class  InterfacePrg8
{
	public static void main(String[] args) 
	{
		Sample8 s = new Sample8();
		s.test();
	}
}
