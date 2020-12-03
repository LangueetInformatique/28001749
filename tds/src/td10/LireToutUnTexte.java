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

}
