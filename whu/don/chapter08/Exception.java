package whu.don.chapter08;

import java.io.*;

public class Exception{
	public static void main(String args[]){
		try{
			test();
		//	float a=14.4;
		}catch(IOException e){
			System.out.println(e);	//why can't print?
		}finally{
			System.out.println("Exception occur in test()! from finally");
		}


	}

	//Cause IOException when compile
	static void test() throws IOException{
		String s="hello";
		FileWriter fo = new FileWriter("file.txt");
		fo.write(s);
		fo.close();
	}
}
