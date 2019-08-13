//MultiLevel Inheritance

class E
{
	int x;
	int a;
	public E(int x)
	{
		this.x = x;
	}
}

class F extends E
{
	double y;
	public F(int x, double y)
	{
		super(x);
		this.y = y;
	}
}

class G extends F
{
	double z;
	public G(int x , double y, double z)
	{
		super(x,y);
		this.z = z;
	}
}


class  InhPrgm3
{
	public static void main(String[] args) 
	{
		E e1 = new E(5);
		System.out.println(e1.x);
		F f1 = new F(5,1.4);
		System.out.println( f1.y * f1.x);
		G g1 = new G(2,35.5,34.9);
		System.out.println(g1.x * (g1.y / g1.z));
	}
}
