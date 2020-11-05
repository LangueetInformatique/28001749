package td4;

public class bouclecondi {

	public static void main(String[]args) {
		
		String s1 = "azerty", s2 = "ytreza";
		
		posteriori(s1,s2);
		priori(s1,s2);
		
	}
	
	public static boolean posteriori(String s1, String s2) {
		
		int i1 = 0, i2 = s2.length()-1;
		char c1, c2;
		boolean flag;
		
		do {			
			c1 = s1.charAt(i1); c2 = s2.charAt(i2);
			
			if(c1 != c2 | s1.length() != s2.length()) {
				flag = false; break;
			}
			
			else {	
				flag = true;
			}
			
			i1 ++;
			i2 --;					
		}
		while(i1 < s1.length());

		System.out.println(flag);
		return flag;
		
	}
	
public static boolean priori(String s1, String s2) {
		
		int i1 = 0, i2 = s2.length()-1;
		char c1, c2;
		boolean flag = false; //la boucle a priori a besoin d'une valeur de départ.
		
		while(i1 < s1.length()){
			c1 = s1.charAt(i1); c2 = s2.charAt(i2);
			
			if(c1 != c2 | s1.length() != s2.length()) {
				flag = false; break;
			}
			
			else {	
				flag = true;
			}
			
			i1 ++;
			i2 --;					
		}

		System.out.println(flag);
		return flag;
		
	}
	
}
