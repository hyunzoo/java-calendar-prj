package CalendarProject;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		sub show = new sub();
		show.printSampleCalendar();
		
		System.out.println("달을 입력하세요.");
		int month = scanner.nextInt();
		
		System.out.println(month + "월은 " + show.getMaxDayOfMonth(month) + "일까지 있습니다.");
		scanner.close();
	}

}
