package chapter04;

import java.util.ArrayList;

public class if_ex {

	public static void main(String[] args) {
		
		boolean money = true;
		
		if (money) {
			System.out.println("택시를 타고 가라");
		} else {
			System.out.println("걸어가라");
		}
		System.out.println("=============");
		
		int x = 3;
		int y = 4;
		System.out.println(x > y);
		System.out.println(x != y);
		System.out.println("=============");
		
		int money2 = 2000;
		if (money2 >= 3000) {
		    System.out.println("택시를 타고 가라");
		}else {
		    System.out.println("걸어가라");
		}
		
		System.out.println("===============");
		
		int money3 = 2000;
		boolean hasCard = true;

		if (money3 >= 3000 || hasCard) {
		    System.out.println("택시를 타고 가라");
		} else {
		    System.out.println("걸어가라");
		}

		System.out.println("===============");
		
		//array, contains 활용
		ArrayList<String> pocket = new ArrayList<String>();
		pocket.add("money");
		pocket.add("handphone");
		pocket.add("paper");
		
		if (pocket.contains("money")) {
			System.out.println("택시를 타고 가라");
		} else {
		    System.out.println("걸어가라");
		}
		System.out.println("===============");

		boolean hasCard2 = true;
		ArrayList<String> pocket2 = new ArrayList<String>();
		pocket2.add("money");
		pocket2.add("handphone");
		
		if (pocket2.contains("money")) {
			System.out.println("택시를 타고 가라");
		} else if (hasCard2) {
			System.out.println("택시를 타고 가라");
		} else {
			System.out.println("걸어가라");
		}
		
		
	}

}
