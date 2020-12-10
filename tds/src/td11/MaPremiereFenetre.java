package td11;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MaPremiereFenetre extends JPanel {

	public static void fenetre(String name, int longueur, int largeur) {
		
		JFrame fenetre = new JFrame(name);
		fenetre.setSize(longueur,largeur);
		fenetre.getContentPane().setBackground(Color.DARK_GRAY);
		fenetre.setVisible(true);
		
	}
	
}
