package td10;

import java.io.File;
import java.io.IOException;

/**
 * 
 * @author bezancon
 *
 */

public class test {

	/**
	 * tests de LireToutUnTexte
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[]args) throws IOException {
		
		File adolphe = new File("src/td10/adolphe.txt");
		String contenu_adolphe = LireToutUnTexte.Lire(adolphe);
		
		int longueur_adolphe = LireToutUnTexte.Chercher(contenu_adolphe);
		String contexte_adolphe = LireToutUnTexte.ChercherVoir(contenu_adolphe, "Adolphe", 10);
		
		System.out.println(longueur_adolphe);
		System.out.println(contexte_adolphe);
		LireToutUnTexte.ChercherER(contenu_adolphe,"(\\baim\\w+\\b)"); //version simple de l'expression
		
	}
	
	
}
