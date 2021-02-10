package td4;

import java.util.Arrays;

public class partie3 {

	public static void main(String[]args) {
		

		int p1 = 10, p2 = -1, p3 = 9, p4 = 4, p5 = 8;

		mediane(p1, p2, p3);
		mediane(p1, p3, p2);
		mediane(p2, p1, p3);
		mediane(p2, p3, p1);
		mediane(p3, p1, p2);
		mediane(p3, p2, p1);
		
		int pliste[] = {p1,p2,p3,p4,p5};
		
		mediane2(pliste);
	}
	
	public static int mediane2(int pliste[]) {
		
		int p6;
		
		Arrays.sort(pliste);
		int half = pliste.length/2;
		
		if(pliste.length%2 == 0) {
			p6 = (pliste[half-1]+pliste[half])/2;
		}
		else {
			p6 = pliste[half];
		}
		
		System.out.println(p6);
		return p6;
	}
	
	public static int mediane(int p1, int p2, int p3) {
		int p4;

		if (p1 > p2) {
			if (p3 > p1)
				p4 = p1;
			else {
				if (p3 > p2)
					p4 = p3;
				else
					p4 = p2;
			}
		} else {
			if (p3 > p2)
				p4 = p2;
			else {
				if (p3 > p1)
					p4 = p3;
				else
					p4 = p1;
			}
		}

		System.out.print(p4);

		return p4;
	}
	
}
