package td7;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ex2 {
		
	public static void main(String[]args) {
			
		Calendar calendrier = Calendar.getInstance();
			
			
		int date = calendrier.get(Calendar.DATE);
		int mois = calendrier.get(Calendar.MONTH);
		int heure = calendrier.get(Calendar.HOUR);
			
		GregorianCalendar Gcalendrier = new GregorianCalendar();
			
		System.out.println("date de création : "+date+"/"+mois);
		System.out.println("heure de création : "+heure+"h");
	}
		
}
