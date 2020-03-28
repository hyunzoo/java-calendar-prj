package CalendarProject;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {

		String PROMPT = "cal> ";
		Scanner scanner = new Scanner(System.in);
		sub show = new sub();
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
			show.printSampleCalendar(month);
		}

		System.out.println("done");

		scanner.close();
	}

}
