package td9;

import java.io.*;
import java.util.Scanner;

public class MonPremierFichierTexte {

	public static void main(String[]args) throws IOException {
		
		String noms = "Julien\nMorgann\nJoyce\nAlexane\nChenyangli\nAnna\nMustapha";
		File texte = new File("Nom.txt");
		
		FileWriter ecrire = new FileWriter("Nom.txt");
		ecrire.write(noms);
		ecrire.close();
		
		verifier(texte, noms);
		
	}
	
	public static void verifier(File fichier, String contenu) throws FileNotFoundException {
		
		String verif;
		boolean check = true;
		
		Scanner lecteur = new Scanner(fichier);
		while(lecteur.hasNextLine() && check) {
			
			String line = lecteur.nextLine();
			verif = line;
			
			if(verif != contenu) {		
				System.out.println("les noms ne sont pas les memes\n"+verif+"\n"+line);
				check = false;
			}
			
			else {
				
				System.out.println("les noms sont les memes");
			}
		}
		
		lecteur.close();
	}
	
}
