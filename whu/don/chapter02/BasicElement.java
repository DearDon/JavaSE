package whu.don.chapter02;
/*
 * Purpose:
 * This class is to test Symbols, basic data types
 * and expression,including data type transfering
 */
public class BasicElement
{
	public static void main(String args[])
	{
		//testConstant();
		testVariable();
		//testTypeTransfer();
	}	

	//To test constant data
	public static void testConstant()
	{
		System.out.println("Integer constant:"+"\ndecimal(10):\t"+10+
				"\nhexadecimal(0XA):\t"+0XA);
		System.out.println("\nFloat constant:"+"\ndecimal fraction(11.12):\t"+
				11.12+"\nexponent(1.112E1):\t"+1.112E1);
		System.out.println("\nChar constant:"+"\nchar formal('A'):\t"+'A');
		System.out.println("\nString constant:"+"\nwords with special"+ 
				" symbol(hello world\\n):"+"hello world\n"+
				"\nonly words(hello world):"+"hellow world");
	}

	//To test Variable
	public static void testVariable()
	{
		short shortV=015;
		byte byteV=127;
		//if a variable's data type is float,the given constant must end with f
		//like the following sentance 12.3f.if given 12.3,compiler will wrong.
		float floatV=12.3f;
		double doubleV=1.3;
		boolean booleanV=(12==12L);
		booleanV=(12.3f==12.3);
		String StringV="How are you?";
		System.out.println("shortV="+shortV+";byteV="+byteV);
		System.out.println("floatV="+floatV+";doubleV="+doubleV);
		System.out.println("booleanV="+booleanV);
		System.out.println("StringV="+StringV);
	}

	//To test type transfer
	public static void testTypeTransfer()
	{
		char c='A';
		int a=10;
		float b=(float)3/2;
		a=a+c;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
	}

}
