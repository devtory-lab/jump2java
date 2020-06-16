package chapter04;

import java.util.ArrayList;

public class For_Each_ex {

	public static void main(String[] args) {
		String[] numbers = {"one", "two", "three"};
		for (String number : numbers) {
			System.out.println(number);
		}
		
		System.out.println("===============");
		
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("one1");
		aList.add("two2");
		aList.add("three3");
		for (String number : aList) {
			System.out.println(number);
		}

	}

}
