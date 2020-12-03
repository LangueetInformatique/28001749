package td10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LireToutUnTexte {

	public static String Lire(File fichier) throws IOException {
		
		String contenu = "";
		Scanner lecteur = new Scanner(fichier);
		
		while(lecteur.hasNextLine()) {
				
			contenu = contenu + "\n" +lecteur.nextLine();		
		}
			
		lecteur.close();
		return contenu;
	}	

	public static int Chercher(String texte) {
		
		return texte.length();
	}

	public static String ChercherVoir(String texte, String chaine, int taille_contexte) {
		
		String contexte;
		if(texte.contains(chaine)) {
			
			
			int index_start = texte.indexOf(chaine) - (taille_contexte) ;
			int index_end = texte.indexOf(chaine) + (taille_contexte + chaine.length());
			
			contexte = texte.substring(index_start,index_end);
		}
		else {
			
			contexte = null;
			System.out.println("la chaine cherchée n'est pas dans le texte");
		}
		
		return contexte;
	}
	
}
