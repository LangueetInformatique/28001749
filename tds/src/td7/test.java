package td7;

public class test {
	
	public static void main(String[]args) {
		
		calendar2 objet1 = new calendar2();
		objet1.creation();
		
		calendar2 objet2 = new calendar2();
		objet2.afficher();
		
		calendar2.duree(objet1.getseconde(),objet2.getseconde());

	}

}
