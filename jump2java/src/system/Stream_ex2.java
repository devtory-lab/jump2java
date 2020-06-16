package system;

import java.io.InputStream;
import java.io.InputStreamReader;

public class Stream_ex2 {

	public static void main(String[] args) throws Exception {
		
		InputStream in = System.in;
		
		InputStreamReader reader = new InputStreamReader(in);
		char[] a = new char[3];		//3글자
		reader.read(a);
		
		System.out.println(a);

	}

}
