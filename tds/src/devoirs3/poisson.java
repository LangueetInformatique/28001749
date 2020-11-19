package devoirs3;

public class poisson extends animal_marin implements type_animal,regime_animal,environnement_animal{

	public poisson(String animal) {
		super(animal); //le nom de l'animal en question
	}
	
	public boolean dangeureux() {
		
		return true;
	}
	
	public void social() {
		
		System.out.println("cela dépend des espèces");
	}
	
	public void taille() {
		
		System.out.println("de quelques centimètres à plusieurs mètres de long");
	}
	
	public String caracteristique() {
		
		return "passent leur vie sous l'eau";
	}
	
	public boolean predateur() {
		
		return true;
	}
	
	public String ecosysteme() {
		
		return "on en trouve dans plusieurs types d'eau (salée, douce...)";
	}
	
}
