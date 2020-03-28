package CalendarProject;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		sub show = new sub();
		show.printSampleCalendar();

		System.out.println("반복횟수를 입력하세요.");
		int repeat = scanner.nextInt();
		int[] monthArr = new int[repeat];

		System.out.println("월을 입력하세요.");
		
		for (int i = 0; i < repeat; i++) {
			int month = scanner.nextInt();
			monthArr[i] = month;
		}
		
		System.out.println();
		
		for (int i = 0; i < repeat; i++) {
			System.out.println(monthArr[i] + "월은 " + show.getMaxDayOfMonth(monthArr[i]) + "일까지 있습니다.");
		}

		scanner.close();
	}

}
