package devoirs2;

import java.util.ArrayList;

public class test {

	public static void main(String[]args) {
		
		etudiant Albert = new etudiant("Albert","Laroche",28453219,15);
		etudiant Robert = new etudiant("Robert","Spierre",12345678,20);
		etudiant Pierre = new etudiant("Pierre","caillou",39876543,10);
		
		System.out.println(Albert.getnom());
		System.out.println(Robert.getprenom());
		System.out.println(Pierre.getnote());
		
		ArrayList<etudiant> etudiants = new ArrayList<etudiant>();
		
		etudiants.add(Albert);
		etudiants.add(Robert);
		etudiants.add(Pierre);
		
		promo lastyear = new promo(2020, etudiants);
		
		System.out.println(lastyear.getannee());
		System.out.println(lastyear.get_nb_etudiant());
		System.out.println(lastyear.moyenne());
	}
	
}
