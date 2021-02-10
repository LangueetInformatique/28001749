package devoirs2;

import java.util.ArrayList;

public class promo {

	/*
	 * fonctionnalités principales d'une promotion étudiante:
	 * 		l'année de la promotion
	 * 		les etudiants qu'il y a dedans
	 * 		une moyenne
	 */
	
	int annee;
	ArrayList<etudiant> etudiants;
	
	public promo(int setannee, ArrayList<etudiant> setetudiants) {
		
		this.annee = setannee;
		this.etudiants = setetudiants;
	}
	
	public int getannee() {
		
		return annee;
	}
	
	public int get_nb_etudiant() {
		
		return etudiants.size();
	}
	
	public float moyenne() {
		
		float total = 0;
		int nb_etudiant = get_nb_etudiant();
		
		for(int i =0;i<nb_etudiant;i++) {
			
			total = total + etudiants.get(i).getnote();
		}
		
		total = total/nb_etudiant;
		return total;
	}
	
}
