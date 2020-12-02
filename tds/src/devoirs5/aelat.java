package devoirs5;

/**
 * 
 * @author bezancon
 *
 */

public class aelat {

	/**
	 * 
	 * @param methode aleatoire
	 * 
	 */
	
	public static int aleatoire(int mini, int maxi) {

		/**
		 * 
		 * @param un minimum et un maximum, les limites de la génération aléatoire.
		 * 
		 */
		
		int nombre = (int)(Math.random()*(maxi-mini+1))+mini;
		return nombre;
		
		/**
		 * 
		 * @return un nombre aleatoire.
		 * 
		 */
	}
	
}
