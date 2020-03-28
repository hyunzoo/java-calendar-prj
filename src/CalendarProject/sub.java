package CalendarProject;

public class sub {

	final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public void printSampleCalendar(int month) {

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println("일    월     화   수    목    금    토");
			System.out.println("---------------------");
			System.out.println(" 1  2  3  4  5  6  7");
			System.out.println(" 8  9 10 11 12 13 14");
			System.out.println("15 16 17 18 19 20 21");
			System.out.println("22 23 24 25 26 27 28");
			System.out.println("29 30 31");
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println("일    월     화   수    목    금    토");
			System.out.println("---------------------");
			System.out.println(" 1  2  3  4  5  6  7");
			System.out.println(" 8  9 10 11 12 13 14");
			System.out.println("15 16 17 18 19 20 21");
			System.out.println("22 23 24 25 26 27 28");
			System.out.println("29 30");
		} else {
			System.out.println("일    월     화   수    목    금    토");
			System.out.println("---------------------");
			System.out.println(" 1  2  3  4  5  6  7");
			System.out.println(" 8  9 10 11 12 13 14");
			System.out.println("15 16 17 18 19 20 21");
			System.out.println("22 23 24 25 26 27 28");

		}
	}

	public int getMaxDayOfMonth(int month) {
		return MAX_DAYS[month - 1];

	}

}
