package devoirs2;

public class etudiant {

	String nom, prenom;
	int numetu; 
	float note;
	
	/*
	 * constructeur vide
	 */
	public etudiant() {}
	
	/*
	 * constructeur non-vide
	 */
	public etudiant(String nom, String prenom, int numetu, float note) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.numetu = numetu;
		this.note = note;
	}
	
	public String getnom() {
		
		return nom;
	}
	
	public String getprenom() {
		
		return prenom;
	}

	public int getnumetu() {
	
		return numetu;
	}

	public float getnote() {
	
		return note;
	}
	
}
