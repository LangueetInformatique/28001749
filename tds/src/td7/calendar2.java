package td7;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class calendar2 {

	boolean cours;
	static Calendar calendrier = Calendar.getInstance();
		
	public static int creation() {
			
		int jour = calendrier.get(Calendar.DATE);
		int mois = calendrier.get(Calendar.MONTH);
		int annee = calendrier.get(Calendar.YEAR);
			
		int heure = calendrier.get(Calendar.HOUR);
		int minute = calendrier.get(Calendar.MINUTE);
		int seconde = calendrier.get(Calendar.SECOND);
				
		GregorianCalendar Gcalendrier = new GregorianCalendar();
				
		System.out.println("date de création : "+jour+"/"+mois+"/"+annee);
		System.out.println("heure de création : "+heure+"h"+minute+" et "+seconde+" sec");
		
		return seconde;
	}
	
	public static int afficher() {
		
		int jour = calendrier.get(Calendar.DATE);
		int mois = calendrier.get(Calendar.MONTH);
		int annee = calendrier.get(Calendar.YEAR);
			
		int heure = calendrier.get(Calendar.HOUR);
		int minute = calendrier.get(Calendar.MINUTE);
		int seconde = calendrier.get(Calendar.SECOND);
				
		GregorianCalendar Gcalendrier = new GregorianCalendar();
				
		System.out.println("date : "+jour+"/"+mois+"/"+annee);
		System.out.println("heure : "+heure+"h"+minute+" et "+seconde+" sec");
		
		return seconde;
	}
	
	public static void duree(int seconde1, int seconde2) {

		int delais = seconde1 - seconde2;
		
		System.out.println("objet créé depuis "+delais+" secondes");
	}
	
	public static void main(String[]args) {

		int seconde2 = afficher();
		int seconde1 = creation();
		duree(seconde1,seconde2);
	}
}
