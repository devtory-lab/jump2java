package chapter03;

import java.util.ArrayList;

public class Generics_ex {

	public static void main(String[] args) {
		ArrayList aList = new ArrayList();
		aList.add("hello");
		aList.add("world");

		String hello = (String) aList.get(0);
		String world = (String) aList.get(1);

		System.out.println(hello);
		System.out.println(world);
		
		System.out.println("===================");
		
		ArrayList<String> bList = new ArrayList<String>();
		bList.add("java");
		bList.add("script");

		String java = bList.get(0);
		String script = bList.get(1);

		System.out.println(java);
		System.out.println(script);

	}

}
