package devoirs4;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class calendar2 extends Calendar {
	
	boolean cours;
	int jour,mois,annee,heure,minute,seconde;
	Calendar calendrier = Calendar.getInstance();
	
	public void testcours(int heure) {
		
		if(calendrier.get(Calendar.DAY_OF_WEEK)==4){
			
			if(12 > heure && heure < 9) {
				
				cours = true;
				System.out.println("objet créé pendant le cours de M. Montacié\n");

			}
		}	
	}
	
	public void creation() {
		
		this.jour = calendrier.get(Calendar.DATE);
		this.mois = calendrier.get(Calendar.MONTH);
		this.annee = calendrier.get(Calendar.YEAR);
			
		this.heure = calendrier.get(Calendar.HOUR);
		this.minute = calendrier.get(Calendar.MINUTE);
		this.seconde = calendrier.get(Calendar.SECOND);
		
		System.out.println("date de création de l'objet:");
		System.out.println("date : "+jour+"/"+mois+"/"+annee+"\nheure : "+heure+"h"+minute+" et "+seconde+" sec\n");
		
		testcours(heure);
	}
	
	public void afficher() {
				
		this.jour = calendrier.get(Calendar.DATE);
		this.mois = calendrier.get(Calendar.MONTH);
		this.annee = calendrier.get(Calendar.YEAR);
			
		this.heure = calendrier.get(Calendar.HOUR);
		this.minute = calendrier.get(Calendar.MINUTE);
		this.seconde = calendrier.get(Calendar.SECOND);
		
		System.out.println("date courante:");
		System.out.println("date : "+jour+"/"+mois+"/"+annee+"\nheure : "+heure+"h"+minute+" et "+seconde+" sec\n");
		
		testcours(heure);
	}
	
	public int getseconde() {
		
		return seconde;
	}
	
	public static void duree(int seconde1, int seconde2) {

		int delais = seconde1 - seconde2;
		
		System.out.println("objet créé depuis "+delais+" secondes");
	}

	@Override
	public void add(int arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void computeFields() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void computeTime() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getGreatestMinimum(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLeastMaximum(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMaximum(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMinimum(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void roll(int arg0, boolean arg1) {
		// TODO Auto-generated method stub
		
	}
}
