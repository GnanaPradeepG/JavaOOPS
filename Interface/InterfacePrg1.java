interface Demo1
{
	void test1();
}

class Sample1 implements Demo1
{
	public void test1()
	{
		System.out.println("test1 implment by Sample1 class");
	}
}

class  InterfacePrg1
{
	public static void main(String[] args) 
	{
		Sample1 s1 = new Sample1();
		s1.test1();
	}
}