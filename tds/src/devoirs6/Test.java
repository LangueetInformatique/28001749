package devoirs6;

import java.io.File;
import java.io.IOException;

/**
 * 
 * @author bezancon
 *
 */
public class Test {

	public static void main(String[]args) throws IOException {
		
		File texte = new File("src/devoirs6/Nom.txt");
		File copie = new File("src/devoirs6/copie.txt");
		File zipper = new File("src/devoirs6/zipper.zip");
		
		FileInputStreamTP7 test = new FileInputStreamTP7(texte);
		test.copier(copie);
		test.compresser(zipper);
		test.propriete();
		test.close();
	}
}
