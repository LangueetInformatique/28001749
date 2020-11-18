package td7;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class ex2 {
		
	public static void main(String[]args) {
			
		String a = "";
		Calendar calendrier = Calendar.getInstance();
		
		while(a != "stop"){
			
			int jour = calendrier.get(Calendar.DATE);
			int mois = calendrier.get(Calendar.MONTH);
			int annee = calendrier.get(Calendar.YEAR);
			
			int heure = calendrier.get(Calendar.HOUR);
			int minute = calendrier.get(Calendar.MINUTE);
			int seconde = calendrier.get(Calendar.SECOND);
				
			GregorianCalendar Gcalendrier = new GregorianCalendar();
				
			System.out.println("date de création : "+jour+"/"+mois+"/"+annee);
			System.out.println("heure de création : "+heure+"h"+minute+" et "+seconde+" sec");
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("appuyez sur entrée pour actualiser");
			a = scanner.nextLine();
			
		}
	}
		
}
