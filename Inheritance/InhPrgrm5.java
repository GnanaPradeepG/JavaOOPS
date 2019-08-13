//Implicit chaining

class K
{
	public K()
	{
		System.out.println("K class");	
	}
}

class L extends K 
{
	public L()
	{
	//java  compiler will add || super(); || automatically
	System.out.println("L class");
	}
}

class  InhPrgrm5
{
	public static void main(String[] args) 
	{
		L l1 = new L();
	}
}
