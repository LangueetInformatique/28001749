package devoirs6;

import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * 
 * @author bezancon
 *
 */
public class FileInputStreamTP7 extends FileInputStream{
	
	String name;
	File fichier;
	FileInputStream fichierStream;
	/**
	 * constructeur de la classe
	 * @param fichier
	 * @throws FileNotFoundException
	 */
	public FileInputStreamTP7(File fichier) throws FileNotFoundException {
		
		super(fichier);
		this.fichier = fichier;
		this.name = this.fichier.getName();
		this.fichierStream = new FileInputStream(fichier);
	}
	
	/**
	 * fait une copie du fichier
	 * @param copie
	 * @throws IOException
	 */
	public void copier(File copie) throws IOException {

		FileOutputStream copieur = new FileOutputStream(copie);
		int data = fichierStream.read();
		
		while(data != -1) {
				
			copieur.write(data);
			data = fichierStream.read();
			
		}
			
		copieur.close();
	}
	
	/**
	 * crée une copie du fichier dans un zip
	 * @param zipper
	 * @throws IOException
	 */
	public void compresser(File zipper) throws IOException {

		FileInputStream original = new FileInputStream(name);
		FileOutputStream copie = new FileOutputStream(zipper);
		ZipOutputStream compresseur = new ZipOutputStream(copie);
		
		compresseur.putNextEntry(new ZipEntry(name));
		
		int length;
		byte[] buffer = new byte[1024];
		
		while((length = original.read(buffer)) > 0) {
			
			compresseur.write(buffer, 0, length);
		}
		
		original.close();
		compresseur.closeEntry();
		compresseur.close();		
	}
	
	/**
	 * affiche certaines propriétés du fichier
	 */
	public void propriete() {
		
		System.out.println("dernière modification: "+fichier.lastModified());
		System.out.println("taille: "+fichier.length());
		System.out.println("chemin absolu: "+fichier.getAbsolutePath());
		System.out.println("nom: "+fichier.getName());
		System.out.println("dossier parent: "+fichier.getParent());

		//on peut ici rajouter de nombreuses autres propriétés.
		//certaines données sont au format brut, et n'ont pas encore été converties.	
	}

	
	
}
