
//incomplete methods are known as abstract methods 

abstract class Demo2
//class wid abstract method is also abstarct class (a class can't be complete holding a incomplete method)
{
	abstract public void move();
	//abstract syntax-
	//1.abstract at starting of method and
	//2. " ; " at the end
}

abstract class Sample2_1 extends Demo2
{
// here we inherited so we have 2 op[tons
//	1.override the abstract method
//	2.or name the class as abstract
}

class Sample2_2 extends Sample2_1
{
	public void move()
	{
		System.out.println("Move method complete");
	}
	//thus we inherit and override at any level of inheritance
}

class AbstractProgram2  
{
	public static void main(String[] args) 
	{
		Sample2_2 s = new Sample2_2();
		s.move();
	}
}
