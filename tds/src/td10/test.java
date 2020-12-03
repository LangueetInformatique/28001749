package td10;

import java.io.File;
import java.io.IOException;

public class test {

	public static void main(String[]args) throws IOException {
		
		File adelaide = new File("src/td10/adelaide.txt");
		File adolphe = new File("src/td10/adolphe.txt");
		
		String contenu_adelaide = LireToutUnTexte.Lire(adelaide);
		String contenu_adolphe = LireToutUnTexte.Lire(adolphe);
		
		int longueur_adolphe = LireToutUnTexte.Chercher(contenu_adolphe);
		
		System.out.println(contenu_adelaide);
		System.out.println(longueur_adolphe);
	}
	
}
