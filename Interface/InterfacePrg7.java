interface Demo7
{
	void test1();
}

class Sample7_1
{
	public void test2()
	{
		System.out.println("Inside test2");
	}
}

class Sample7_2 extends Sample7_1 implements Demo7

// A class should first iherit class and then any no. of interfaces
{
	public void test1()
	{
		System.out.println("inside test1");
	}

}
class  InterfacePrg7
{
	public static void main(String[] args) 
	{
		Sample7_2 s = new Sample7_2();
		s.test1();
		s.test2();
	}
}
