package whu.don.chapter04;

public class ArrayAndString
{
	public static void main(String args[])
	{
		testArray();
		testArgs(args);
		testString();
		testStringTransfer();
	}

	public static void testArray()
	{
		/////////////////////////////////////////////////////////////
		//static initialization
		int intoneArrays[]={1,2,3};

		String stringoneArrays[]={"adc","ds"};

		int inttwoArrays[][]={{2,2},{2,3},{4,5,6}};
		//static example done
		////////////////////////////////////////////////////////////////
		
		/////////////////////////////////////////////////////////////////
		//dynamic initialization
		int intoneArrayd[];
		intoneArrayd=new int[5];//or int intoneArrayd[]=new int[5];
		
		//complex data type
		String stringoneArrayd[];
		stringoneArrayd=new String[2];
		stringoneArrayd[0]=new String("hi");
		stringoneArrayd[1]=new String("you");

		int inttwoArrayd[][];
		inttwoArrayd=new int[2][3];//or int inttwoArrayd[][]=new int[2][3];
		
		//complex data type
		String stringtwoArrayd[][]=new String[2][];
		stringtwoArrayd[0]=new String[2];
		stringtwoArrayd[1]=new String[3];
		stringtwoArrayd[0][0]=new String("hi");
		stringtwoArrayd[0][1]=new String("you");
		stringtwoArrayd[1][0]=new String("are");
		stringtwoArrayd[1][1]=new String("very");
		stringtwoArrayd[1][2]=new String("good");
		//dynamic example done
		/////////////////////////////////////////////////////////////////
	}

	public static void testArgs(String arg[])
	{
		System.out.println("args"+arg);
		System.out.println("args.length="+arg.length);
		if(arg.length==2)
		{
			System.out.println("the input is:");
			for(String s:arg)
				System.out.println(s);
		}
		else
			System.out.println("please input two arguments");
	}

	public static void testString()
	{
		String s1;
		s1=new String("how are you!");
		int l=s1.length();				//get length
		char c=s1.charAt(8); 			//get the s1[8]
		int i=s1.indexOf('a');			//get where 'a' first coming
		int j=s1.indexOf("are",0);	//get where "are" first coming after s1[0]
		int m=s1.indexOf("are",8);	//get where "are" first coming after s1[8]
		String s2=s1.substring(8,11); //get substring from s1[8]-s1[11]
		System.out.println("s1="+s1);
		System.out.println("l="+l+" c="+c+" i="+i+" j="+j+" m="+m+" s2="+s2);
		if(s1.equals(s2))
			System.out.println("s1 equals to s2");
		else
			System.out.println("s1 didn't equal to s2");
	}

	public static void testStringTransfer()
	{
		int x=456;
		boolean y=true;
		String s1=String.valueOf(x);
		String s2=String.valueOf(y);
		x=Integer.parseInt(s1);
		y=Boolean.getBoolean(s2);
		float f=Float.parseFloat("42.3");
		double d=Double.parseDouble("23.2");
	}
}
