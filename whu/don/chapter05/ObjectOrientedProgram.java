package whu.don.chapter05;

//public class ObjectOrientedProgram
public class ObjectOrientedProgram extends ObjectOrientedProgramSubA
{
	ObjectOrientedProgram(int x)
	{
		//super(x);
		//System.out.println("get his");
	}
	void test(){System.out.println("test");}
	public static void main(String[] args)
	{
		System.out.println("hello from public class");
		System.out.println(ObjectOrientedProgramSubA.x);
		System.out.println(ObjectOrientedProgramSubB.y);
		ObjectOrientedProgramSubB.test();
	//	ObjectOrientedProgramSubA a=new ObjectOrientedProgramSubA("sd");
	//	ObjectOrientedProgramSubB b=new ObjectOrientedProgramSubB();
		System.gc();//only delete the objects never used again
	//	System.out.println("x from a:"+a.x);
	//	System.out.println("y from b:"+b.y);
		new ObjectOrientedProgram(2).test();
	}
}
/*
private class ObjectOrientedProgramSubA
	above sentance lead problem
	because for the outter class, the uper level only be package or other
	non relation class. So the right only can be public and friendly(omit)
	only for inner class(defined in other class or function) the pre can
	be public, protected, friendly and private(right range decrease in order).
    the meaning is the same as for funciton and member variable.
*/
class ObjectOrientedProgramSubA
{
	protected static int x=1;
	//protected static final int x=1;//this will lead fault as x changed later

	/*
	ObjectOrientedProgramSubA(String y){}
	*/
	ObjectOrientedProgramSubA(){
		System.out.println("get none");
	}
	ObjectOrientedProgramSubA(int x)
	{
		this.x=x;
		System.out.println("get int");
	}
	void test(int x){System.out.println(x);}
	public static void main(String[] args)
	{
		System.out.println("hello");
	}
}
class ObjectOrientedProgramSubB
{
	static int y;
	int m;
	public ObjectOrientedProgramSubB(){this.y=2;}
	public ObjectOrientedProgramSubB(int z)
	{
		y=z;//if local variable's name not same as member,no need "this."
	}
	static void test()
	{
		/*
		 *  m=2; this lead problem
		 *  can't use a non-static variable in a static method directly
		 *  because static variable and method get the memory when statement
		 *  come.while non-static varibale didn't get memory untill initialize.
		 *	if you must use a non-static variable in a static method, you 
		 *	should first get a instance of this class in this method and then
		 *	use it by "instanceName.variable".juse like following example for m
		*/
		ObjectOrientedProgramSubB c=new ObjectOrientedProgramSubB();
		c.m=2;
		y=2;
		System.out.println("test finished"+c.m+y);
		int[] ref=null;
		//ref[0]=12; this lead problem,as use a null for point of array
	}
}
