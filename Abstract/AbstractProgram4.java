//if we need to pass a rule for naming variable or a method using keyword abstract


abstract class Shape
{
	abstract public void area();
	//thus we are passing a rule to inherit from Shape and develop areas
}


//==========================	Business Logic		================================


//for Circle area by one programmer

class  CircleArea extends Shape
{
	int r;
	double area;
	public CircleArea(int r)
	{
		this.r = r;
	}
	public void area()
	{
		area = 3.14*this.r*this.r;
		System.out.println(this.area);
	}
}

//Rect Area by another one

class  RectArea extends Shape
{
	int l;
	int w;
	double area;
	public RectArea(int l, int w)
	{
		this.l = l;
		this.w = w;
	}
	public void area()
	{
		area = this.l*this.w;
		System.out.println(this.area);
	}
}

	//Tri Area by another one

class TriArea extends Shape
{
	int l;
	int h;
	double area;
	public TriArea(int l,int h)
	{
		this.l = l;
		this.h = h;
	}
	public void area()
	{
		area = 0.5 * this.l * this.h ;
		System.out.println(this.area);
	}
}

class AbstractProgram4
{
	public static void main(String[] args)
	{
		CircleArea c = new CircleArea(5);
		c.area();
		RectArea r = new RectArea(2,4);
		r.area();
		TriArea t = new TriArea(3,6);
		t.area();
	}
}