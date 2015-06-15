package whu.don.chapter06SubA;

public class ClassFeatureSubA{
	/*
	private static int supnprivate=1;
	static int supnfriendly=2;
	protected static int supnprotected=3;
	public static int supnpublic=4;
	*/
	private static int nprivate=1;
	static int nfriendly=2;
	protected static int nprotected=3;
	public static int npublic=4;

	public static void superAccess(){
		System.out.println("*******不同包子类中，可以访问如下变量：");
	//	System.out.println("private member="+nprivate);
	//	System.out.println("friendly member="+nfriendly);
		System.out.println("protected member="+nprotected);
		System.out.println("public member="+npublic);
	}

	public static void testFriendly(){
		System.out.println("test succeed!");
	}

}
