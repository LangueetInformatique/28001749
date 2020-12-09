package devoirs6;

import java.io.File;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileInputStreamTP7 extends FileInputStream{
	
	File fichier;
	FileInputStream fichierStream;

	public FileInputStreamTP7(File fichier) throws FileNotFoundException {
		
		super(fichier);
		this.fichier = fichier;
		this.fichierStream = new FileInputStream(fichier);
		
	}
	
	public void copier(File copie) throws IOException {

		FileOutputStream copieur = new FileOutputStream(copie);
		int data = fichierStream.read();
		
		while(data != -1) {
				
			copieur.write(data);
			data = fichierStream.read();
			
		}
			
	}
	
	public void compresser(File zipper) throws IOException {

		FileOutputStream copie = new FileOutputStream(zipper);
		ZipOutputStream compresseur = new ZipOutputStream(copie);
		
		compresseur.putNextEntry(new ZipEntry(fichier.getName()));
		
		int length;
		byte[] buffer = new byte[1024];
		
		while((length = fichierStream.read(buffer)) > 0) {
			
			compresseur.write(buffer, 0, length);
		}
		
		
		compresseur.closeEntry();
		compresseur.close();
		
	}
	
	public void propriete() {
		
		System.out.println("dernière modification: "+fichier.lastModified());
		System.out.println("taille: "+fichier.length());
		System.out.println("chemin absolu: "+fichier.getAbsolutePath());
		System.out.println("nom: "+fichier.getName());
		//on peut ici rajouter de nombreuses autres propriétés.
		
	}

	
	
}
