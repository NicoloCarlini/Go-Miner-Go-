package main;

import java.awt.event.*;
import javax.swing.*;


public  class AvviaEventi implements MouseListener {
	
	Gioco gm;
	
	String gem1Rotta = "gem1", gem2Rotta = "gem2";
	
	public AvviaEventi(Gioco gm) {
		this.gm = gm;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		JButton button = (JButton) e.getSource();
		JComponent componente = (JComponent) e.getSource();
		ButtonPressed bPress = (ButtonPressed) componente.getClientProperty("azione");
		switch(bPress) {
		
		case ButtonPressed.NewGame:
			gm.ev1.round();
			break;
		case ButtonPressed.Chiudi:
			System.exit(0);
			break;
		case ButtonPressed.Menu:
			gm.ev1.menu();
			break;
			
		case ButtonPressed.Tree:
			gm.ev1.tree();
			break;
		
		case ButtonPressed.Combo1B, ButtonPressed.Combo1R, ButtonPressed.Combo1Z, ButtonPressed.Combo2B, ButtonPressed.Combo2R, ButtonPressed.Combo2Z, ButtonPressed.Combo3B, ButtonPressed.Combo3R, ButtonPressed.Combo3Z:
			gm.ev1.combo(button, bPress);
			break;	
			
		case ButtonPressed.StartRound:
			gm.ev1.startRound(e);
			break;
		case ButtonPressed.M1toM2:
			gm.ev1.M1ToM2(e);
			break;
		case ButtonPressed.M2toM3:
			gm.ev1.M2ToM3(e);
			break;
		case ButtonPressed.M3toNull:
			gm.ev1.M3ToNull(e, componente);
			break;
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {}
			
	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

}
