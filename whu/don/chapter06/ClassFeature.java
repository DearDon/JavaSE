package whu.don.chapter06;

import whu.don.chapter06SubA.*;
import whu.don.chapter06SubC.*;

public class ClassFeature extends ClassFeatureSubA{
	private static int nprivate=1;
	static int nfriendly=2;
	protected static int nprotected=3;
	public static int npublic=4;

	public static void main(String args[]){
	//	System.out.println("test vi succeed");

	//	ClassFeatureSubA.testFriendly();
	//	whu.don.chapter06SubA.ClassFeatureSubA.testFriendly();
	//	ClassFeatureSubA a=new ClassFeatureSubA();

		Access();
		ClassFeatureSubB.Access();
		superAccess();
		ClassFeatureSubC.Access();

	}

	static void Access(){
		System.out.println("*******同一类中，可以访问如下变量：");
		System.out.println("private member="+nprivate);
		System.out.println("friendly member="+nfriendly);
		System.out.println("protected member="+nprotected);
		System.out.println("public member="+npublic);
	}
}

class ClassFeatureSubB{
	private static int nprivate=1;
	static int nfriendly=2;
	protected static int nprotected=3;
	public static int npublic=4;

	static void Access(){
		System.out.println("*******同一包中，可以访问如下变量：");
	//	System.out.println("private member="+nprivate);
		System.out.println("friendly member="+nfriendly);
		System.out.println("protected member="+nprotected);
		System.out.println("public member="+npublic);
	}
}
