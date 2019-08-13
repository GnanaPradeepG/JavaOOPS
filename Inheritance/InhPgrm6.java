class Dimensions
{
	int base;
	int height;
	double area;
	public Dimensions(int base, int height )
	{
		this.base= base;
		this.height = height;
	}
	public void area()
	{
		this.area = 0.5 *this.base * this.height;
	}
}

class RT extends Dimensions
{
	public RT(int base, int height)
	{
		super(base,height);
		super.area();
		System.out.println(this.area);
	}
}


class LT extends Dimensions
{
	public LT(int base, int height)
	{
		super(base,height);
		area();
		System.out.println(this.area);
	}
}



class  InhPgrm6
{
	public static void main(String[] args) 
	{
		RT r1 = new RT(3,6);
		LT l1 = new LT(23,56);
	}
}
