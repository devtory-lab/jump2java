package chapter04;

public class switch_ex {

	public static void main(String[] args) {
		int month = 8;
		String monthString = "";
		
		switch (month) {
		case 1:
			monthString = "1월";
			break;
		case 2:
			monthString = "2월";
			break;
		case 3:
			monthString = "3월";
			break;
		case 4:
			monthString = "4월";
			break;
		case 5:
			monthString = "5월";
			break;
		case 6:
			monthString = "6월";
			break;
		case 7:
			monthString = "7월";
			break;
		case 8:
			monthString = "8월";
			break;
		default:
			monthString = "Invalid month";
			break;
		}
		
		System.out.println(monthString);

	}

}
