package basicPracticeTwo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetCurrentTime {
	public static void main(String[] args) {
		Date todayDate = new Date();
		System.out.println(todayDate);
		SimpleDateFormat dateformat =new SimpleDateFormat("hh:mm:ss");
		System.out.println(dateformat.format(todayDate));
		SimpleDateFormat Monthformat= new SimpleDateFormat("MM/dd/YYYY");
		System.out.println(Monthformat.format(todayDate));
		SimpleDateFormat Week= new SimpleDateFormat("EEEE");
		System.out.println(Week.format(todayDate));
		SimpleDateFormat clock= new SimpleDateFormat("h:mm a z E M s Y u S X G");
		System.out.println(clock.format(todayDate));
	}

}
