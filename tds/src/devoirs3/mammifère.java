package devoirs3;

public class mammifère extends animal_marin implements type_animal,regime_animal,environnement_animal{

	public mammifère(String animal) {
		super(animal); //le nom de l'animal en question
	}
	
	public boolean dangeureux() {
		
		return false;
	}
	
	public void social() {
		
		System.out.println("souvent en groupe d'individus");
	}
	
	public void taille() {
		
		System.out.println("plusieurs mètres de long");
	}
	
	public String caracteristique() {
		
		return "respire de l'air, comme les animaux terrestres";
	}
	
	public boolean predateur() {
		
		return true;
	}
	
	public String ecosysteme() {
		
		return "on en trouve dans plusieurs types d'eau (salée, douce...)";
	}
	

}
