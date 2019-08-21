class GrandParents
{
	String name;
	int age;
	public GrandParents(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
}

//============single level inheritance=================


class Parents extends GrandParents
{
	public Parents(String name, int age)
	{
		super(name,age);
	}
}


//============hierarchical inheritance=================


final class Inlaws extends GrandParents

//final class can't be inherited

{
	public Inlaws(String name, int age)
	{
		super(name,age);
	}
}

//===============multi-level inheritance===============


class Children extends Parents
{
	String qualification;
	public Children(String name, int age, String qualification)
	{
		super(name,age);
		this.qualification = qualification;
	}
}

class Single_multilevel_Hierarchical 
{
	public static void main(String[] args) 
	{
		GrandParents g = new GrandParents("Kumar", 68);
		System.out.println(g.name + " "+ g.age);
		System.out.println();
		Parents p = new Parents("Ravi",45);
		System.out.println(p.name + " "+ p.age);
		System.out.println();
		Inlaws i = new Inlaws("Suresh", 44);
		System.out.println(i.name + " "+ i.age);
		System.out.println();
		Children c = new Children ("Pradeep",22,"Btech");
		System.out.println(c.name + " "+ c.age + " " + c.qualification);
	}
}
