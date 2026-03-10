package events;

import java.awt.event.MouseEvent;

import javax.swing.*;

import main.ButtonPressed;
import main.Gioco;
import main.Rotto;
import main.StartRound;

public class Event01 {
	
	Gioco gm;
	StartRound sr;
	
	public Event01(Gioco gm) {
		this.gm = gm;
	}
	
	public void menu() {
		gm.ui.schermate[1].setVisible(true);
		gm.ui.schermate[2].setVisible(false);
		gm.ui.schermate[3].setVisible(false);
	}
	
	public void round() {
		gm.ui.schermate[1].setVisible(false);
		gm.ui.schermate[2].setVisible(true);
		gm.ui.schermate[3].setVisible(false);
	}
	
	public void tree() {
		gm.ui.schermate[1].setVisible(false);
		gm.ui.schermate[2].setVisible(false);
		gm.ui.schermate[3].setVisible(true);
	}
	
	public void startRound(MouseEvent e) {
		JButton start = (JButton) e.getSource();
		start.setVisible(false);
		gm.ui.tornaMenu.setVisible(false);
		sr = new StartRound(gm, (JButton) e.getSource());
		Thread round = new Thread(sr);
		round.start();
	}
	
	public void M1ToM2(MouseEvent e) {
		((JButton) e.getSource()).setVisible(false);
	}
	
	public void M2ToM3(MouseEvent e) {
		((JButton) e.getSource()).setVisible(false);
	}
	
	public void M3ToNull(MouseEvent e, JComponent componente) {
		Rotto chiRotto = (Rotto) componente.getClientProperty("spacca");
		((JButton) e.getSource()).setVisible(false);
		sr.spawn++;
        sr.posizioniLibere.add(sr.spawn);
        int i;
        boolean repeat;
        do {
        	repeat = false;
	        i = (int) (Math.random() * 4);
	        if(i<1) {
	        	repeat = true;
	        }
        }while(repeat);
        i = (int) (i*gm.ui.tree.combo);
        gm.ui.tree.combo += 0.1;
        if(gm.ui.tree.combo> gm.ui.tree.comboMax) {
        	gm.ui.tree.combo = gm.ui.tree.comboMax;
        }
        System.out.println( gm.ui.tree.combo);
        switch(chiRotto) {
        case Rotto.gem1Rotta:
        	gm.ui.risorse.addGem1(i);
        	break;
        case Rotto.gem2Rotta:
        	gm.ui.risorse.addGem2(i);
        	break;
        case Rotto.gem3Rotta:
        	gm.ui.risorse.addGem3(i);
        	break;
        }
	}
	
	public void combo(JButton button, ButtonPressed bPress) {
		switch(bPress) {
		case ButtonPressed.Combo1B, ButtonPressed.Combo1R, ButtonPressed.Combo1Z:
			if(bPress==ButtonPressed.Combo1B) {
				if(gm.ui.risorse.nBase >= 15) {
					button.setVisible(false);
					gm.ui.risorse.nBase -= 15;
					gm.ui.risorse.addGem1(0);
					gm.ui.tree.comboMax += 0.2;
					System.out.println(gm.ui.tree.comboMax);
				}
			} else if(bPress==ButtonPressed.Combo1R) {
				if(gm.ui.risorse.nRari >= 15) {
					button.setVisible(false);
					gm.ui.risorse.nRari -= 15;
					gm.ui.risorse.addGem2(0);
					gm.ui.tree.comboMax += 0.2;
					System.out.println(gm.ui.tree.comboMax);
				}
			} else {
				if(gm.ui.risorse.nZ >= 15) {
					button.setVisible(false);
					gm.ui.risorse.nZ -= 15;
					gm.ui.risorse.addGem3(0);
					gm.ui.tree.comboMax += 0.2;
					System.out.println(gm.ui.tree.comboMax);
				}
			}
			break;
			
		case ButtonPressed.Combo2B, ButtonPressed.Combo2R, ButtonPressed.Combo2Z:
			if(bPress==ButtonPressed.Combo2B) {
				if(gm.ui.risorse.nBase >= 25) {
					button.setVisible(false);
					gm.ui.risorse.nBase -= 25;
					gm.ui.risorse.addGem1(0);
					gm.ui.tree.comboMax += 0.3;
					System.out.println(gm.ui.tree.comboMax);
				}
			} else if(bPress==ButtonPressed.Combo2R) {
				if(gm.ui.risorse.nRari >= 25) {
					button.setVisible(false);
					gm.ui.risorse.nRari -= 25;
					gm.ui.risorse.addGem2(0);
					gm.ui.tree.comboMax += 0.3;
					System.out.println(gm.ui.tree.comboMax);
				}
			} else {
				if(gm.ui.risorse.nZ >= 25) {
					button.setVisible(false);
					gm.ui.risorse.nZ -= 25;
					gm.ui.risorse.addGem3(0);
					gm.ui.tree.comboMax += 0.3;
					System.out.println(gm.ui.tree.comboMax);
				}
			}
			break;
			
		case ButtonPressed.Combo3B, ButtonPressed.Combo3R, ButtonPressed.Combo3Z:
			if(bPress==ButtonPressed.Combo3B) {
				if(gm.ui.risorse.nBase >= 50) {
					button.setVisible(false);
					gm.ui.risorse.nBase -= 50;
					gm.ui.risorse.addGem1(0);
					gm.ui.tree.comboMax += 0.5;
					System.out.println(gm.ui.tree.comboMax);
				}
			} else if(bPress==ButtonPressed.Combo3R) {
				if(gm.ui.risorse.nRari >= 50) {
					button.setVisible(false);
					gm.ui.risorse.nRari -= 50;
					gm.ui.risorse.addGem2(0);
					gm.ui.tree.comboMax += 0.5;
					System.out.println(gm.ui.tree.comboMax);
				}
			} else {
				if(gm.ui.risorse.nZ >= 50) {
					button.setVisible(false);
					gm.ui.risorse.nZ -= 50;
					gm.ui.risorse.addGem3(0);
					gm.ui.tree.comboMax += 0.5;
					System.out.println(gm.ui.tree.comboMax);
				}
			}
			break;
		}
	}
}
