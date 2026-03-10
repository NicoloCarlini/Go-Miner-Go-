package main;

import java.awt.Image;

import javax.swing.*;

public class Nodo extends JButton {
	
	Gioco gm;
	ImageIcon icon;

	public Nodo(Gioco gm, int x, int y, String typeNodo, String minerale, int lvl) {
		this.gm = gm;
		setBounds(x, y, 370, 160);
		switch(typeNodo) {
		case "combo":
			combo(minerale, lvl);
			break;
		case "eff":
			break;
		case "reb":
			break;
		case "mb":
			break;
		case "mr":
			break;
		case "mz":
			break;
		case "sAlbero":
			break;
		case "spawn":
			break;
		case "tRound":
			break;
		}
	}
	
	public void combo(String minerale, int lvl) {
		this.addMouseListener(gm.avviaEv);
		switch(lvl) {
		case 1:
			switch(minerale) {
			case "base":
				icon = new ImageIcon(getClass().getClassLoader().getResource("Combo1B.png"));
				this.putClientProperty("azione", ButtonPressed.Combo1B);
				break;
			case "raro":
				icon = new ImageIcon(getClass().getClassLoader().getResource("Combo1R.png"));
				this.putClientProperty("azione", ButtonPressed.Combo1R);
				break;
			case "z":
				icon = new ImageIcon(getClass().getClassLoader().getResource("Combo1Z.png"));
				this.putClientProperty("azione", ButtonPressed.Combo1Z);
				break;
			}
			break;
		case 2:
			switch(minerale) {
			case "base":
				icon = new ImageIcon(getClass().getClassLoader().getResource("Combo2B.png"));
				this.putClientProperty("azione", ButtonPressed.Combo2B);
				break;
			case "raro":
				icon = new ImageIcon(getClass().getClassLoader().getResource("Combo2R.png"));
				this.putClientProperty("azione", ButtonPressed.Combo2R);
				break;
			case "z":
				icon = new ImageIcon(getClass().getClassLoader().getResource("Combo2Z.png"));
				this.putClientProperty("azione", ButtonPressed.Combo2Z);
				break;
			}
			break;
		case 3:
			switch(minerale) {
			case "base":
				icon = new ImageIcon(getClass().getClassLoader().getResource("Combo3B.png"));
				this.putClientProperty("azione", ButtonPressed.Combo3B);
				break;
			case "raro":
				icon = new ImageIcon(getClass().getClassLoader().getResource("Combo3R.png"));
				this.putClientProperty("azione", ButtonPressed.Combo3R);
				break;
			case "z":
				icon = new ImageIcon(getClass().getClassLoader().getResource("Combo3Z.png"));
				this.putClientProperty("azione", ButtonPressed.Combo3Z);
				break;
			}
			break;
		}
		this.setIcon(icon);
		this.setPressedIcon(icon);
		this.setContentAreaFilled(false);
		this.setFocusPainted(false);
	}
	
	public int efficency() {
		int eff = 0;
		return eff;
	}
	
	public int rebirth() {
		int reb = 0;
		return reb;
	}
	
	public int MB() {
		int mb = 0;
		return mb;
	}
	
	public int MR() {
		int mr = 0;
		return mr;
	}
	
	public int MZ() {
		int mz = 0;
		return mz;
	}
	
	public int sbloccaAlbero() {
		int sAlbero = 0;
		return sAlbero;
	}
	
	public int spawn() {
		int spawn = 0;
		return spawn;
	}
	
	public int tRound() {
		int tRound = 0;
		return tRound;
	}
}
