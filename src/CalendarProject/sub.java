package CalendarProject;

public class sub {

	final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	final int[] Lip_Year_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	// final String[] DAYS = {"SU", "MO", "TU", "WE", "TH", "FR", "SA"};

	public int getMaxDayOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public void printCalendar(int year, int month, int weekday) {

		System.out.printf("     <<%4d년  %3d월>>\n", year, month);

		System.out.println("SU  MO  TU  WE  TH  FR  SA");
		System.out.println("----------------------------");

		// print blank space
		for (int i = 0; i < weekday; i++) {
			System.out.printf("    ");
		}

		int count = 7 - weekday;
		int delim = (count < 7) ? count : 0;

		int maxDay = getMaxDayOfMonth(month);

		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			maxDay = Lip_Year_MAX_DAYS[month - 1];
		}

		// print first line
		for (int i = 1; i <= count; i++) {
			System.out.printf("%2d  ", i);
		}
		System.out.println();
		
		//print from second line to last
		for (int i = (count + 1); i <= maxDay; i++) {
			System.out.printf("%2d  ", i);
			if (i % 7 == delim) {
				System.out.println();
			}
		}
		
		System.out.println();
		System.out.println();

	}
}