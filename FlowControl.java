public class FlowControl{
	public static void main(String args[]){
	//	testLoop(args[0]);
	//	testSwitch(args[0],args[1]);
		testMath();
	}

	//To print all the odd integer little than given number in a triangle
	public static void testLoop(String stringn){
		System.out.println("Input max variable:"+stringn);
		int n;
		n=Integer.parseInt(stringn);
		int i,j;
		for(i=1;i<=n;i+=2)
		{
			j=1;
			while(j<=i)
			{
				System.out.print(i+" ");
				j++;
			}
			System.out.println("");
		}
		/* old method
		int finaln,lines,i,j;
		if((n/2)*2==n)
			finaln=n-1;
		else
			finaln=n;
		lines=(finaln+1)/2;
		for(i=1;i<=finaln;i+=2)
		{
			j=1;
			while(j<=i)
			{
				System.out.print(i+" ");
				j++;
			}
			System.out.println("");
		}
		*/
	}

	//Test decides whhich one of two input number is bigger
	public static void testSwitch(String sx, String sy){
		//System.out.println("first number:"+sx);
		//System.out.println("second number:"+sy);
		int x,y;
		x=Integer.parseInt(sx);
		y=Integer.parseInt(sy);
		switch(x>y?1:x==y?2:3){
				case 1:System.out.println(sx+">"+sy);
					   break;
				case 2:System.out.println(sx+"="+sy);
					   break;
				case 3:System.out.println(sx+"<"+sy);
					   break;
				default:System.out.println("input parameters"+ sx+"and"+sy+"are not propal");
						break;
		}
		/* old method
		if(x>y)
			System.out.println(args[0]+">"+args[1]);
		else 
			if(x==y)
				System.out.println(args[0]+"="+args[1]);
			else
				System.out.println(args[0]+"<"+args[1]);
		*/
	}

	public static void testMath(){
		System.out.println("Math.PI="+Math.PI);
		System.out.println("Math.E="+Math.E);
		System.out.println(50d==50f);
		//abs() get a number's abs
		int a=Math.abs(50);
		long b=Math.abs(-50L);
		float c=Math.abs(-50.1f);
		//ceil() get a integer which greater or equal the given variable but also closest to the given
		double d=Math.ceil(8.7);
		double e=Math.ceil(3.2);
		//floor() get a integer which littler or equal the given vatiable but also closest to the given
		double f=Math.floor(3.7);
		//max() get the bigger nubmer from two
		float g=Math.max(11.0f,20.2f);
		//min() get the littler number from two
		double h=Math.min(12.0, 30);
		//random() get a random double type number i, with 0<=i<=1
		double i=(int)Math.random()*10;
		//round() get the closest integer from the given variable
		double j=Math.round(11.5);
		double k=Math.round(-11.5);
		//sin() cos() get sin or cos of a angle in radian measure like pi pi/2
		//Math.toRadians() transfer a angle to radian measure
		double l=Math.sin(Math.toRadians(90.0));
		//sqrt() get the square root of a variable
		double m=Math.sqrt(4.0);
		System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h+" "+i+" "+j+" "+k+" "+l+" "+m);
	}
}
