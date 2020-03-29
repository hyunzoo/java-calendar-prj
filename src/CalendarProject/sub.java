package CalendarProject;

public class sub {

	final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDayOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public void printCalendar(int year, int month) {

		System.out.printf("     <<%4d년  %3d월>>\n", year, month);

		System.out.println("SU  MO  TU  WE  TH  FR  SA");
		System.out.println("----------------------------");

		int maxDay = getMaxDayOfMonth(month);
		
		if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			maxDay = 29;
		}

		for (int i = 1; i <= maxDay; i++) {
			System.out.printf("%2d  ", i);
			if(i % 7 == 0) {
				System.out.println();
			}
		}
		
		System.out.println();

	}
}