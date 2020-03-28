package CalendarProject;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {

		String PROMPT = "cal> ";
		Scanner scanner = new Scanner(System.in);
		sub show = new sub();
		show.printSampleCalendar();

		System.out.println("반복횟수를 입력하세요.");

		int month = 1;

		while (true) {
			System.out.println("달을 입력하세요.");
			System.out.print(PROMPT);
			month = scanner.nextInt();
			if (month == -1) {
				break;
			}
			if(month > 12) {
				continue;
			}
			System.out.println(month + "월은 " + show.getMaxDayOfMonth(month) + "일까지 있습니다.");
		}

		System.out.println("done");

		scanner.close();
	}

}
