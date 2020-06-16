package system;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Stream_ex3 {

	public static void main(String[] args) throws Exception {
		InputStream in = System.in;
		InputStreamReader reader = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(reader);
		
		//asfasdfasdfasdfafd 입력 후 엔터키시, asfasdfasdfasdfafd 출력
		String a = br.readLine();
		System.out.println(a);
		

	}

}
