class Details
{
	long id;
	String name;
	String lang;
	public Details(long id, String name, String lang)
	{
		this.id = id;
		this.name = name;
		this.lang = lang;
	}
	public void display()
	{
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.lang);
	}
}

class FrontEndDevo extends Details
{
	public FrontEndDevo(long id, String name, String lang)
	{
		super(id, name, lang);
	}
}

class BackEndDevo extends Details
{
	public BackEndDevo(long id, String name, String lang)
	{
		super(id, name, lang);
	}
}


class  InhPrgm7
{
	public static void main(String[] args) 
	{
		FrontEndDevo f = new FrontEndDevo(123456, "Arcus", "Java Script");
		f.display();
		System.out.println("===============================");
		BackEndDevo b = new BackEndDevo(654321,"Pradeep", "Java");
		b.display();
	}
}