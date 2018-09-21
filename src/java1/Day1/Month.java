package java1.Day1;

public class Month {

	public static void main(String[] args) {

		int month = 11;
		int days = 0;

		switch (month) {
		case 2:
			days = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		default:
			days = 31;
			break;
		}

		System.out.println(month + "월은" + " " + days + "일로 구성되어 있습니다.");

		if (month == 2) {
			days = 28;
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			days = 30;
		} else {
			days = 31;
		}
		
		System.out.println(month + "월"+ days + "일");
	}

}
