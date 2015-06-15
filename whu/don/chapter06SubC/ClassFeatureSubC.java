package whu.don.chapter06SubC;

public class ClassFeatureSubC{
	private static int nprivate=1;
	static int nfriendly=2;
	protected static int nprotected=3;
	public static int npublic=4;

	public static void Access(){
		System.out.println("*******不同包非子类中，可以访问如下变量：");
	//	System.out.println("private member="+nprivate);
	//	System.out.println("friendly member="+nfirendly);
	//	System.out.println("protected member="+nprotected);
		System.out.println("public member="+npublic);
	}
}
