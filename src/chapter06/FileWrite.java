package chapter06;

import java.io.FileOutputStream;

public class FileWrite {

	public static void main(String[] args) throws Exception {
		FileOutputStream output = new FileOutputStream(".\\src\\out.txt");
		
		for (int i = 1; i < 11; i++) {
			String data = i + " 번째 줄입니다.\r\n";
			output.write(data.getBytes());
		}
		
		output.close();

	}

}
