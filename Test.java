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
		String classtype="ClassA";
		System.out.println(classtype);
		ClassA A=new ClassA();
		//classtype A=new classtype();
		A.write();
	}
}

class ClassA{
	public void write(){
		System.out.println("test success!");
	}
}

