package devoirs2;

import java.util.ArrayList;

public class promo {

	/*
	 * fonctionnalités principales d'une promotion étudiante:
	 * 		l'année de la promotion
	 * 		les etudiants qu'il y a dedans
	 */
	
	int annee;
	ArrayList<etudiant> etudiants;
	
	public void addetu(etudiant x) {
		
		etudiants.add(x);
	}
	
	public promo(int annee, ArrayList<etudiant> etudiants) {
		
		this.annee = annee;
		this.etudiants = etudiants;
	}
	
	public int getannee() {
		
		return annee;
	}
	
	public int get_nb_etudiant() {
		
		return etudiants.size();
	}
	
}
