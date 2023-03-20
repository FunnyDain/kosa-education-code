package day11;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateTimeTest {

	public static void main(String[] args) throws Exception {
		Date d = new Date();
		System.out.println(d.toString());
		System.out.println(d.getTime());		//시간을 long 값으로 계산해서 return

		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.get(GregorianCalendar.DAY_OF_WEEK));		//요일
		gc = new GregorianCalendar(2023, 2, 31);						// 0이 1월 11은 12월, 그래서 2023년 3월 31일
		System.out.println(gc.get(GregorianCalendar.DAY_OF_WEEK));

		System.out.println(timeToStrDate(new Date().getTime()));
		System.out.println(parseStrDate("2019년 01월 01일"));

		//자바8부터 
		LocalDate currentDate = LocalDate.now();
		LocalDate targetDate = LocalDate.of(2023, 7, 26);
		System.out.println(currentDate.getDayOfWeek());		//MONDAY
		System.out.println(currentDate.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.KOREAN));		//월
		System.out.println(currentDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));		//월요일
		System.out.println(targetDate.getDayOfWeek());
		System.out.println(targetDate.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.KOREAN));
		System.out.println(targetDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
		
		//시간
		LocalTime currentTime = LocalTime.now();
		LocalTime targetTime = LocalTime.of(9, 10, 20);
		System.out.println(currentTime);
		System.out.println(targetTime);

		//공식적인 날짜 규격임
		LocalDateTime currentDateTime = LocalDateTime.now();
		LocalDateTime targetDateTime = LocalDateTime.of(2023, 12, 25, 12, 30);
		System.out.println(currentDateTime);
		System.out.println(targetDateTime);
	}

	public static String timeToStrDate(long time) {
		DateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");		//월은 대문자를 사용함, month와 minute을 구분하기 위해
		return formatter.format(time);
	}

	public static Date parseStrDate(String strDate) throws ParseException {
		DateFormat formatter = new SimpleDateFormat("yyyy년 MM월 dd일");
		return formatter.parse(strDate);
	}

}
