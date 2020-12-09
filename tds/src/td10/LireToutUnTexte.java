package td10;

import java.util.Arrays;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import com.sun.tools.javac.util.ArrayUtils;

import sun.security.util.ArrayUtil;

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
		
		int i = 0;
		String contexte = "";
		
		if(texte.contains(chaine)) {
			
			String[] liste_chaine = chaine.split(" ");
			String[] liste_mots = texte.split(" ");
			
			int index_start = ArrayUtils.indexOf(liste_mots,liste_chaine[0]);
			int index_end = Arrays.asList(liste_mots).(chaine) + taille_contexte + chaine.length();
			
			while(i >= index_start && i <= index_end) {
				
				contexte = contexte + liste_mots[i];
			}
		}
		else {
			
			contexte = "la chaine cherchée n'est pas dans le texte";
		}
		
		return contexte;
	}
	
}
