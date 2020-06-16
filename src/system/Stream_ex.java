package system;

import java.io.InputStream;

public class Stream_ex {

	public static void main(String[] args) throws Exception {
		/*
		InputStream in = System.in;
		//a 입력시 97 출력
		
		int a;
		a = in.read();
		
		System.out.println(a);
		*/
		
		//abc 입력시 97,98,99 출력
		InputStream in2 = System.in;
		byte[] b = new byte[3];
		in2.read(b);

		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		

	}

}
