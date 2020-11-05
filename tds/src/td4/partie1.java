package td4;

public class partie1 {

	public static void main(String[]args) {
		
		int p1 = 10, p2 = 9, p3 = -1, p4 = 4, p5 = 8;
		int p6;
		
		if(p1>p2) {p6 = p1;}
		else {p6 = p2;}
		
		if(p3>p6) {p6 = p3;}
		if(p4>p6) {p6 = p4;}
		if(p5>p6) {p6 = p5;}
		
		System.out.println(p6);
		
		if(p1>p2) {p6 = p2;}
		else {p6 = p1;}
		
		if(p3<p6) {p6 = p3;}
		if(p4<p6) {p6 = p4;}
		if(p5<p6) {p6 = p5;}
		
		System.out.println(p6);
		
		//voir correction > fonction utile de mini
		
	}
}
