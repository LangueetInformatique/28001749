package td5;

public class partie1 {

	public static void main(String[]args) {
		
		Date voulue = new Date(14,7,2021);
		Date today = new Date(22,10,2020);
		int jours = compter(today,voulue);
		System.out.println(jours+" jours");
	}
	
	public static int compter(Date aujd, Date x){
		
		int compteur = 0;
		
		while(aujd.CompareTo(x) == true) {
			
			aujd.Incrementer();
			compteur += 1;
		}
		
		return compteur;
	}
	
}
