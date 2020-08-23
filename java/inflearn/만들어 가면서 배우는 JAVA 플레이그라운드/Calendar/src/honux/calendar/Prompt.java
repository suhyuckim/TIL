package honux.calendar;

import java.text.ParseException;
import java.util.Scanner;

public class Prompt {
	
	public void printMenu() {
		System.out.println("+-----------------+");
		System.out.println("| 1. 일정 등록      |");
		System.out.println("| 2. 일정 검색 	  |");
		System.out.println("| 3. 달력 보기 	  |");
		System.out.println("| h. 도움말 q.종료   |");
		System.out.println("+-----------------+");
	}
	
	public int parseDay (String week) {
		switch(week) {
			case "su":
				return 0;
			case "mo":
				return 1;
			case "tu":
				return 2;
			case "we":
				return 3;
			case "th":
				return 4;
			case "fr":
				return 5;
			case "sa":
				return 6;
			default:
				return 0;
		}
	}
	
	public void runPrompt() throws ParseException {
		printMenu();
		Scanner sc = new Scanner(System.in);
		
		Calendar cal = new Calendar();

		boolean isLoop = true;
		
		while(isLoop) {
			System.out.print("명령 (1,2,3,h,q) > ");
			String cmd = sc.next();
			switch(cmd) {
				case "1":
					cmdRegister(sc, cal);
					break;
				case "2":
					cmdSerch(sc, cal);
					break;
				case "3":
					cmdCal(sc, cal);
					break;
				case "h":
					printMenu();
					break;
				case "q":
					isLoop = false;
					break;
			}
		}
		System.out.println("Thank you");
		sc.close();
	}
	
	private void cmdCal(Scanner s, Calendar c ) {
		int month = 1;   
		int year = 2017;
		
		System.out.println("년도를 입력하세요.");
		System.out.print("YEAR> ");
		year = s.nextInt();
		
		System.out.println("달을 입력하세요. ");
		System.out.print("MONTH> ");
		month = s.nextInt();
		 
		if(month > 12 || month < 1)  {
			System.out.println("잘못된 입력");
			return; 
		}
		c.printSampleCalendar(year, month);
	}

	private void cmdSerch(Scanner s, Calendar c) {
		System.out.println("[일정 검색]");
		System.out.print("날짜를 입력해주세요 (yyyy-MM-dd) > ");
		String date = s.next();
		PlanItem plan;
		plan = c.searchPlan(date);
		if(plan != null) {
			System.out.println(plan.detail);
		}else {
			System.out.println("일정이 없습니다.");
		}

	}

	private void cmdRegister(Scanner s, Calendar c) throws ParseException {
		System.out.println("[새 일정들록]");
		System.out.print("날짜를 입력해주세요 (yyyy-MM-dd) > ");
		String date = s.next();
		String text = "";
		System.out.print("일정을 입력해주세요.(문장의 끝에 ;을 입력해주세요.)  > ");
		String word = "";
		while(!(word = s.next()).endsWith(";")) { 
			text += word+" ";
		}
		word = word.replace(";", "");
		text += word;
		
		c.registerPlan(date, text);
	}

	public static void main(String[] args) throws ParseException {
		Prompt p = new Prompt();
		p.runPrompt();
	}
}