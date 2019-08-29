interface Demo10
{
	void test1();
}

abstract class Sample10_1
{
	abstract public void test2(); 
}

class Sample10_2 extends Sample10_1 implements Demo10
{
	public void test1()
	{
		System.out.println("In test1");
	}

	public void test2()
	{
		System.out.println("in test2");
	}
}
class  InterfacePrg10
{
	public static void main(String[] args) 
	{
		Sample10_2 s = new Sample10_2();
		s.test1();
		s.test2();
	}
}