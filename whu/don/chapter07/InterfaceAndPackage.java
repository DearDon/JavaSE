package whu.don.chapter07;

public class InterfaceAndPackage implements Interface{
	static int x=1;
	/*
	InterfaceAndPackage(int y){
		this.x=y;
		System.out.println("test succeed!"+x);
	}
	*/

	public static void main(String args[]){
//		InterfaceAndPackage a=new InterfaceAndPackage(3);
//		AbstractInterfaceAndPackage.test();
//		AbstractInterfaceAndPackage b=new AbstractInterfaceAndPackage();
		InterfaceAndPackage c=new InterfaceAndPackage();
		InterfaceAndPackage d=new InterfaceAndPackage();
//		c.m=100;
		x=Interface.m;
		System.out.println("test succeed!"+x);
		
	}

	public void test(){
		System.out.println("test succeed! from Interface"+x);
	}
}

abstract class AbstractInterfaceAndPackage{
	static int x=2;
	AbstractInterfaceAndPackage(){
		System.out.println("test succeed! from Abstract"+x);
	}
	static void test(){
		System.out.println("test succeed! from Abstract"+x);
	}
}

interface Interface{
	int m=200;
	void test();
}
