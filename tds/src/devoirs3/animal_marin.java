package devoirs3;

public abstract class animal_marin {

	String animal;
	
	//ses caracteristiques
	public abstract boolean dangeureux();
	public abstract void social();
	public abstract void taille();
	public animal_marin(String animal) {this.animal = animal;} //pour afficher après cette information
	public String getanimal() {return animal;} //l'affichage en question
}
