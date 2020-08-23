package honux.calendar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Calendar {
	private static final int[] MAX_DAYS = {0, 31,28,31,30,31,30,31,31,30,31,30,31};
	private static final int[] LEAP_MAX_DAYS = {0, 31,29,31,30,31,30,31,31,30,31,30,31};
 	private static final String SAVE_FILE = "calendar.dat";
	
	private HashMap <Date, PlanItem> planMap;
	
	public Calendar() {
		planMap = new HashMap<Date, PlanItem>(); 
		File f = new File(SAVE_FILE);
		if(!f.exists()) {
			return;
		}
		try {
			Scanner sc = new Scanner(f);
			while(sc.hasNext()) {
				String line = sc.nextLine();
				String[] words = line.split(",");
				String date = words[0];
				String detail = words[1]+replaceAll("\"","");
				PlanItem p = new PlanItem(date, detail);
				planMap.put(p.getDate(), p);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void registerPlan(String strDate, String plan) {
		PlanItem p = new PlanItem(strDate, plan);
		planMap.put(p.getDate(), p);
		
		File f = new File(SAVE_FILE);
		String item = p.saveString();
		try {
			FileWriter fw = new FileWriter(f, true);
			fw.write(item);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	public PlanItem searchPlan(String strDate) {
		Date date = PlanItem.getDatefromString(strDate);
		return planMap.get(date);
	}
	
	public boolean isLeapYear(int year) {
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) return true;
		else return false;
	}
	
	public int getMaxDaysOfMonth(int year, int month) {
		if(isLeapYear(year)) return LEAP_MAX_DAYS[month]; 
		else return MAX_DAYS[month];
	}
	
	public void printSampleCalendar(int year, int month) {
		System.out.printf("   <<%d년 %d월>> \n", year, month);
		System.out.println(" 일  월  화  수 목  금  토 ");
		System.out.println(" -------------------------- ");
		
		//get weekday automatically
		int weekday = getWeekDay(year, month, 1);
		for(int i=0; i<weekday; i++) {
			System.out.println("   ");
		}
		int maxDay = getMaxDaysOfMonth(year, month);
		int count = 7-weekday;
		int dailm = count < 7 ? count : 0;
	
		for(int i=0; i<=count; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		count++;
		for(int i=count; i<=maxDay; i++) {
			System.out.printf("%3d", i);
			if(i % 7 == dailm) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println();
	}

	private int getWeekDay(int year, int month, int day) {
		int syear = 1970;
		final int STANDARD_WEEKDAY = 4;
		
		int count = 0;
		
		for(int i = syear; i<year; i++) {
			int delta = isLeapYear(i) ? 366 :365;
			count+=delta; 
		}
		
		for(int i=1; i<month; i++) {
			int delta = getMaxDaysOfMonth(year, i);
			count += delta;
		}
		count += day-1;
		int weekday = (count + STANDARD_WEEKDAY) % 7;
		return count;
	}
	
	public static void main(String[] args) throws ParseException {
		Calendar cal = new Calendar();
		cal.registerPlan("2017-06-23", "밥 먹자");
		System.out.println(cal.searchPlan("2017-06-23").equals("밥 먹자"));
	}
}