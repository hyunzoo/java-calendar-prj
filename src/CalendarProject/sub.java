package CalendarProject;

public class sub {

	final int[] MAX_DAYS = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	final int[] Lip_Year_MAX_DAYS = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean isLeapYear(int year) {
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			return true;
		} else
			return false;
	}

	public int getMaxDayOfMonth(int year, int month) {
		if(isLeapYear(year))
			return Lip_Year_MAX_DAYS[month];
		else
			return MAX_DAYS[month];
	}

	public void printCalendar(int year, int month) {

		System.out.printf("     <<%d년  %d월>>\n", year, month);

		System.out.println("SU  MO  TU  WE  TH  FR  SA");
		System.out.println("----------------------------");

		// get weekday automatically
		int weekday = getWeekDay(year, month, 1);
		
		// print blank space
		for (int i = 0; i < weekday; i++) {
			System.out.printf("    ");
		}

		int count = 7 - weekday;
		int delim = (count < 7) ? count : 0;

		int maxDay = getMaxDayOfMonth(year, month);

		// print first line
		for (int i = 1; i <= count; i++) {
			System.out.printf("%2d  ", i);
		}
		System.out.println();

		// print from second line to last
		for (int i = (count + 1); i <= maxDay; i++) {
			System.out.printf("%2d  ", i);
			if (i % 7 == delim) {
				System.out.println();
			}
		}

		System.out.println();
		System.out.println();

	}

	private int getWeekDay(int year, int month, int day) {
		int syear = 1970;
		final int STANDARD_DAY = 3;
		
		int count = 0;
		
		for(int i = syear; i < year ; i++) {
			int delta = isLeapYear(i) ? 366 : 365;
			count += delta;
		}
		
		for(int i = 1; i < month;i++) {
			int delta = getMaxDayOfMonth(year, i);
			count += delta;
		}
		
		count += day;
		
		int weekday = (count + STANDARD_DAY) % 7;
		return weekday;
	}
}