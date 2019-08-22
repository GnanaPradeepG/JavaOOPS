
//incomplete methods are known as abstract methods 

abstract class Demo
//class wid abstract method is also abstarct class (a class can't be complete holding a incomplete method)
{
	abstract public void move();
	//abstract syntax-
	//1.abstract at starting of method and
	//2. " ; " at the end
}

class Sample extends Demo
{
	public void move()
	{
		System.out.println("Move method complete");
	}
	//thus we inherit and override
}

class AbstractProgram1  
{
	public static void main(String[] args) 
	{
		Sample s = new Sample();
		s.move();
	}
}
