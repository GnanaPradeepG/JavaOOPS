class C
{
	int x;
	int y;
	public C (int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}


class D extends C
{
	double z;
	public D (int x, int y, double z)
	{
		super(x,y);
		this.z = z;
	}
}


class  InhPrgm2
 {
	public static void main(String[] args)
	{
		C c1 = new C(5,2);
		System.out.println(c1.x + c1.y);
		D d1 = new D (5,2,1.9);
		System.out.println(d1.x +d1.y+d1.z);
	}
}
