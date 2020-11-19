package devoirs3;

public class main {

	public static void main(String[]arg) {
		
		mammifère flipper = new mammifère("Dauphin");
		
		flipper.social();
		flipper.taille();
		
		boolean d = flipper.dangeureux();
		boolean p = flipper.predateur();
		
		String c = flipper.caracteristique();
		String e = flipper.ecosysteme();
		
		System.out.println("dangeureux ? "+d);
		System.out.println("un prédateur ? "+p);
		System.out.println("sa caracteristique ? "+c);
		System.out.println("son ecosystème ? "+e);
		
		poisson nemo = new poisson("Poisson");
		
		nemo.social();
		nemo.taille();
		
		boolean d2 = nemo.dangeureux();
		boolean p2 = nemo.predateur();
		
		String c2 = nemo.caracteristique();
		String e2 = nemo.ecosysteme();
		
		System.out.println("dangeureux ? "+d2);
		System.out.println("un prédateur ? "+p2);
		System.out.println("sa caracteristique ? "+c2);
		System.out.println("son ecosystème ? "+e2);

	}
	
}
