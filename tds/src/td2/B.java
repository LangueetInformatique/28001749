package td2;

/**
 * 
 * @author JulienB
 *
 */
public class B {
	/**
	 * retourne n divisé par deux si divisible par 13 ( n + 2 sinon).
	 * 
	 * @param n
	 * @return n/2 si divisible par 13 (n+2 sinon).
	 */
	public static int divise(int n) {
		if (A.treize(n) == true)
			return n / 2;
		else
			return n + 2;

	}

}
