package td11;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class MaPremiereFenetre extends JPanel {
	
	public static void fenetre(String name, int longueur, int largeur) {
		
		JFrame fenetre = new JFrame(name);
		fenetre.setSize(longueur,largeur);
		fenetre.getContentPane().setBackground(Color.DARK_GRAY);
		
		String[] nomMenus = {"Julien","Bezançon"};
		JMenuBar menus = new JMenuBar();
		fenetre.add(menus);
		JMenu m = new JMenu("prenoms");
		menus.add(m);
		
		for(int i=0;i<nomMenus.length;i++) {
			
		m.add(nomMenus[i]);
		}
		
		
		fenetre.setVisible(true);
	}
}
