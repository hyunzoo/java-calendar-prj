package CalendarProject;

import java.util.Scanner;

public class Prompt {
	
	public int parseDay(String week) {
		if(week.equals("SU")) return 0;
		else if (week.equals("MO")) return 1;
		else if (week.equals("TU")) return 2;
		else if (week.equals("WE")) return 3;
		else if (week.equals("TH")) return 4;
		else if (week.equals("FR")) return 5;
		else if (week.equals("SA")) return 6;
		else
			return 0;
		
	}

	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		sub show = new sub();
		int month = 1;
		int year = 2020;

		while (true) {
			System.out.println("년을 입력하세요. (-1 : 종료)");
			System.out.print("YEAR> ");
			year = scanner.nextInt();
			if(year == -1)
				break;
			System.out.println("달을 입력하세요.");
			System.out.print("MONTH> ");
			month = scanner.nextInt();
//			System.out.println("첫 번째 요일을 입력하세요. (SU, MO, TU, WE, TH, FR, SA)");
//			System.out.print("WEEKDAY> ");
//			String str_weekday = scanner.next();
//			weekday = parseDay(str_weekday);
			
			if (month > 12 || month < 1) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			show.printCalendar(year, month);
		}

		System.out.println("done");

		scanner.close();
	}

	public static void main(String[] args) {
		// 셀 실행
		Prompt p = new Prompt();
		p.runPrompt();
	}
	
	//1582년 10월 15일(금)
}
