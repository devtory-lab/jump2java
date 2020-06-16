package chapter04;

public class While_ex {

	public static void main(String[] args) {

		int hit = 0;
		while (hit < 10) {
			hit++;
			System.out.println("나무를 "+ hit +"번 찍었습니다.");
			if (hit == 10) {
				System.out.println("나무가 넘어갑니다.");
			}
		}
		
		System.out.println("================");
		
		int coffee = 10;
		int money = 300;
		while (money > 0) {
			System.out.println("돈을 받았으니 커피를 줍니다.");
			coffee--;
			System.out.println("남은 커피의 양은 "+ coffee +"입니다.");
			if (coffee == 0) {
				System.out.println("커피가 다 떨어졌습니다. 판매를 중지합니다.");
				break;
			}
		}
		
		System.out.println("================");
		
		int a = 0;
		while (a < 10) {
			a++;
			if (a % 2 == 0) {
				continue;
			}
			System.out.println(a);
		}

	}

}
