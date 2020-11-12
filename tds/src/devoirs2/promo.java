package devoirs2;

import java.util.ArrayList;

public class promo {

	/*
	 * fonctionnalités principales d'une promotion étudiante:
	 * 		l'année de la promotion
	 * 		les etudiants qu'il y a dedans
	 */
	
	static int annee;
	static ArrayList<etudiant> etudiants;
	
	public static void addetu(etudiant x) {
		
		etudiants.add(x);
	}
	
	public promo(int annee, ArrayList<etudiant> etudiants) {
		
		promo.annee = annee;
		promo.etudiants = etudiants;
	}
	
	public static void afficher_promo() {
		
		System.out.println(annee);
		System.out.println("nombre d'étudiants = "+etudiants.size());
		//System.out.println("les etudiants = "+etudiants);
	}
	
	public static void main(String[]args) {
		
		etudiant Xavier = new etudiant("Xavier","Dupont",12345678,12);
		etudiant Bastien = new etudiant("Bastien","Dupuis",23568913,8);
		etudiant Leo = new etudiant("Leo","Monte",87654321,15);

		addetu(Xavier);
		addetu(Bastien);
		addetu(Leo);
		
		promo promo2020 = new promo(2020,etudiants);
		
		afficher_promo();
	}
	
}
