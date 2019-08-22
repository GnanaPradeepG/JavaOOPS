interface Demo4
{
	int a = 20;
	int b = 10;
	void test();
}

class Sample4_1 implements Demo4
{
	public void test()
	{
		System.out.println(this.a + this.b);
	}
}

class Sample4_2 implements Demo4
{
	public void test()
	{
		System.out.println(this.a - this.b);	
	}
}

class  InterfacePrg4
{
	public static void main(String[] args) 
	{
		Sample4_1 s1 = new Sample4_1();
		s1.test();
		Sample4_2 s2 = new Sample4_2();
		s2.test();
	}
}
