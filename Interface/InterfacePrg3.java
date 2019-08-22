interface Inf1
{
	void test();
}

interface Inf2 extends Inf1
{
	void test();
}

class Sample3 implements Inf2
{
	public void test()
	{
		System.out.println("Sample3 implements Inf2");
	}
}
class  InterfacePrg3
{
	public static void main(String[] args) 
	{
		Sample3 s = new Sample3();
		s.test();
	}
}
