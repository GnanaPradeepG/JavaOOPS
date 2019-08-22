

//here by making abstract we restrict user logic class from creating objects for Sample class
// .'. abstract class can't have non static members
//	 error: test is abstract; cannot be instantiated

//business logic class


abstract class Sample
{
	static int i = 30;
	static double j =30;
	public static void test1()
	{
		System.out.println("In test1...");
	}

	public static void test2()
	{
		System.out.println("In test2...");
	}
}

//user logic class


class  AbstractProgram3
{
	public static void main(String[] args
	{
		Sample.test1();
		Sample.test2();
		
		//can't create a new object here because the class Sample from 
		// which we are accessing members is static
	
	
}