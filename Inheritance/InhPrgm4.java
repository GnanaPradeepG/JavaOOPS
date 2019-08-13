//Hierarchical Inheritance

class H
{
	int x;
	public H(int x)
	{
		this.x = x;
	}
}

class I extends H
{
	int y;
	public I (int x, int y)
	{
		super(x);
		this.y = y;
	}
}

class J extends H
{
	double z;
	public J(int x, double z )
	{
		super(x);
		this.z = z;
	}
}

class  InhPrgm4
{
	public static void main(String[] args) 
	{
		H h1 = new H(5);
		System.out.println(h1.x);
		System.out.println("===============");
		I i1 = new I(2,5);
		System.out.println(i1.x * i1.y);
				System.out.println("================");
		J j1 = new J(1,4.56);
		System.out.println(j1.x +  j1.z);
	}
}
