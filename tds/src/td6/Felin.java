package td6;

/** Creation et gestion de felins */
public class Felin extends Animal {
// ajout d'attributs propres a la sous-classe
	protected boolean domestique = false;

	/**
	 * le constructeur de Felins fait appel au constructeur de la sur-classe Animal
	 */
	public Felin(String type, int nb_pattes) { // les felins ont 4 pattes
		super("felin",4);
	}					

	/** presentation des caracteristiques du felin */
	public void presente() {
		super.presente();
		String etat = (domestique) ? "domestique" : "sauvage";
		System.out.println("je suis vraiment un animal " + etat);
	}

	/** cri du felin */
	public void crie() {
		System.out.println("et je miaule fort");
	}
}