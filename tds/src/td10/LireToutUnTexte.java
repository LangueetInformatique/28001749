package td10;

import java.util.Arrays;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.*;

/**
 * 
 * @author bezancon
 *
 */

public class LireToutUnTexte {
	
	/**
	 * prend en entree un texte et enregistre son contenu dans un String
	 * @param fichier
	 * @return string
	 * @throws IOException
	 */
	public static String Lire(File fichier) throws IOException {
		
		String contenu = "";
		Scanner lecteur = new Scanner(fichier);
		
		while(lecteur.hasNextLine()) {
				
			contenu = contenu + "\n" +lecteur.nextLine();		
		}
			
		lecteur.close();
		return contenu;
	}	

	/**
	 * prend en entree un texte string et return sa longueur
	 * @param texte
	 * @return int
	 */
	public static int Chercher(String texte) {
		
		return texte.length();
	}
	
	/**
	 * prend en entrée un texte, une chaine, et un nombre, et return le contexte de la chaine
	 * dans le texte en fonction du nombre
	 * @param texte
	 * @param chaine
	 * @param taille_contexte
	 * @return contexte
	 */
	public static String ChercherVoir(String texte, String chaine, int taille_contexte) {

		String contexte = "";
		
		if(texte.contains(chaine)) {
			
			String[] liste_chaine = chaine.split(" ");
			String[] liste_mots = texte.split(" ");
			
			int index_start = Arrays.asList(liste_mots).indexOf(liste_chaine[0]);
			int index_end = Arrays.asList(liste_mots).indexOf(liste_chaine[0]) + liste_chaine.length-1;
			
			if(index_start-taille_contexte >= 0){index_start = index_start-taille_contexte;}
			else {index_start = 0;}
			
			if(index_end+taille_contexte <= liste_mots.length){index_end = index_end+taille_contexte;}
			else {index_end = liste_mots.length;}

			int i = index_start;
			while(i <= index_end) {
				
				contexte = contexte +" "+ liste_mots[i];
				i++;
			}
		}
		else {
			
			contexte = "la chaine cherchée n'est pas dans le texte";
		}
		
		return contexte;
	}
	
	/**
	 * prend en entrée un texte et une regex, et va chercher tous les termes correspondants
	 * à la regex.
	 * @param texte
	 * @param pattern
	 */
public static void ChercherER(String texte, String pattern) {
		
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(texte);
		
		while(m.find()) {
			
			System.out.println("match trouvé: "+m.group());
		}
	}
	
}
