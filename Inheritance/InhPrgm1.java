//Single level Inheritance

class A
{
	int i;
	public A(int i)
	{
		this.i = i;
	}
}

class B extends A
{
	int j;
	public B(int i,int j)
	{
		super(i);
		this.j=j;
	}
}

class  InhPrgm1
{
	public static void main(String[] args) 
	{
		A a1 = new A(8);
		System.out.println(a1.i);
		System.out.println("====================");
		B b1 = new B(2,3);
		System.out.println(b1.i);
		System.out.println(b1.j);
	}
}