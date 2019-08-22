interface Demo5_1
{
	int a = 4;
}

interface Demo5_2
{
	int b =5;
}

interface Demo5_3 extends Demo5_1 , Demo5_2
{
	void test();
}

class Sample5 implements Demo5_3
{

	public void test()
	{
		System.out.println(Demo5_3.a *Demo5_3.b);
	}

}

class  InterfacePrg5
{
	public static void main(String[] args) 
	{
		Sample5 s = new Sample5();
		s.test();
	}
}
