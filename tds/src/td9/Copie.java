package td9;

import java.io.*;
import java.util.Scanner;

public class Copie {

	public static void main(String[]args) throws IOException {
		
		File texte = new File("Nom.txt");
		File copie = new File("copie.txt");

		copier(texte,copie);
			
	}
		
	public static void copier(File fichier, File copie) throws IOException {
		
		Scanner lecteur = new Scanner(fichier);
		FileWriter ecrire = new FileWriter(copie);
		
		while(lecteur.hasNextLine()) {
				
			String line = lecteur.nextLine();
			ecrire.write(line+"\n");
			
		}
			
		lecteur.close();
		ecrire.close();
	}	
}
