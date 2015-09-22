package week04;
//import java.util.Calendar;

public class Date { // a mockup for Date
	private static int dayNum = 43;
	public static int today(){
		//return Calendar.getInstance().get(Calendar.DAY_OF_YEAR);
		return dayNum;
	}
	public static void setToday(int day){
		dayNum = day;
	}
}
