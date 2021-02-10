package td12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AffichDoc {

	public static void main(String[]args) {
		
		JFrame fenetre = new JFrame("ma fenetre");
		JTextArea zone = new JTextArea();
		
		zone.setFont(new Font("Time New Roman",Font.BOLD,18));
		zone.setText("Julien Bezançon");
		
		fenetre.add(new JScrollPane(zone), BorderLayout.CENTER);
		
		fenetre.setSize(300,300);
		fenetre.setVisible(true);
	}
	
}
