package chapter04;

public class For_ex {

	public static void main(String[] args) {
		
		String[] numbers = {"one", "two", "three"};
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("===================");
		
		int[] marks = {90, 25, 67, 45, 80};
		for(int i=0; i<marks.length; i++) {
		    if (marks[i] < 60) {
		        continue;
		    }
		    System.out.println((i+1)+"번 학생 축하합니다. 합격입니다.");
		}

		System.out.println("===================");
		
		//구구단
		for(int i=2; i<10; i++) {
		    for(int j=1; j<10; j++) {
		        System.out.print(i*j+" ");
		    }
		    System.out.println("");
		}
		
	}

}
