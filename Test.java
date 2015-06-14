public class Test{
	public Test(){
	}
	public static void main(String[] args){

		testReflect();
	}

	//Test java.lang.reflect,This test show that we must use reflect
	//technic to "dynimicly" get a instance of an class.
	//use a String variable to dynimicly get a instace is to gona work
	public static void testReflect(){
		String classtype="TestSubA";
		System.out.println(classtype);
		TestSubA A=new TestSubA();
		//classtype A=new classtype();
		A.write();
	}
}
/*
class TestSubA{
	public void write(){
		System.out.println("test success!");
	}
}
I can add something here
*/

