package devoirs5;

import java.util.Arrays;

import devoirs5.aelat;

/**
 * methode lancerDes et test de cette methode
 * @author bezancon
 * 
 * 
 */

public class troisdes {

	/**
	 * 
	 * @param une méthode et un main
	 * 
	 */
	
	public static int[] lancerDes(String joueur) {
		
		/**
		 * 
		 * @param le nom d'un joueur
		 * 
		 */
		
		int lancer1 = aelat.aleatoire(1,6);
		int lancer2 = aelat.aleatoire(1,6);
		int lancer3 = aelat.aleatoire(1,6);;
		
		int lancers[] = {lancer1,lancer2,lancer3};
		
		try { // on catch si les dés ont les valeurs 4, 2 et 1
			
			if((lancer1 == 4 || lancer2 == 4 || lancer3 == 4) && lancer1+lancer2+lancer3 == 7){
				
				int e421 = 1/0;
				//on pourrait faire un throw ici, sinon
			
			}	
		}
		
		catch(Exception e){
			
			System.out.println(joueur+" E421");
		}
		
		try {
			
			if( Arrays.stream(lancers).max().getAsInt()+2  == lancer1+lancer2+lancer3){
				
				int e11x = 1/0;
				//on pourrait faire un throw ici, sinon
			
			}	
		}
		
		catch(Exception e) { // on catch si les dés ont deux valeurs 1 et une autre valeur
			
			System.out.println(joueur+" E11x");
		}
		
		System.out.println("le joueur "+joueur+" a fait "+lancer1+" | "+lancer2+" | "+lancer3+" aux dés.");
		return lancers; // juste au cas ou, mais pas demandé
		
		/**
		 * 
		 * @return trois nombres générés aléatoirement entre 0 et 6 (dans une liste)
		 * 
		 */
	}
	
	public static void main(String[]args) {
		
		int Robert[] = lancerDes("Robert");
		
	}
	
}
