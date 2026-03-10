package main;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Tree extends JPanel {
	
	Gioco gm;
	Point[] slide = new Point[1];
	public float combo = 1, comboMax = 2;
	int eff;
	int spawn;
	int tRound;
	int rebirth = 0;	
	
	//variabili da spostare alla risoluzione
	int xSlide = 0, ySlide = 0, wSlide = 3000, hSlide = 2500;
	
	public Tree(Gioco gm) {
		this.gm = gm;
		setBackground(Color.BLACK);
		setOpaque(true);
		setBounds(xSlide, ySlide, wSlide, hSlide);
		setLayout(null);
    	setBackground(Color.BLUE);
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				slide[0] = e.getPoint();
			}
		});
		addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = (int) (getX() + e.getX() - slide[0].getX());
				if(x>0) {
					x = 0;
				} else if(x<gm.risoluzione.width-wSlide) {
					x = gm.risoluzione.width-wSlide;
				}
				int y = (int) (getY() + e.getY() - slide[0].getY());
				if(y>0) {
					y = 0;
				} else if(y<gm.risoluzione.height-hSlide) {
					y = gm.risoluzione.height-hSlide;
				}
				setLocation(x, y);
			}
		});
		creaNodi();
	}
	
	public void creaNodi() {
		Nodo nodo1 = new Nodo(gm, 0, 0, "combo", "base", 1);
		this.add(nodo1);
		Nodo nodo2 = new Nodo(gm, 400, 0, "combo", "raro", 1);
		this.add(nodo2);
		Nodo nodo3 = new Nodo(gm, 800, 0, "combo", "z", 1);
		this.add(nodo3);
		nodo1 = new Nodo(gm, 0, 300, "combo", "base", 2);
		this.add(nodo1);
		nodo2 = new Nodo(gm, 400, 300, "combo", "raro", 2);
		this.add(nodo2);
		nodo3 = new Nodo(gm, 800, 300, "combo", "z", 2);
		this.add(nodo3);
		nodo1 = new Nodo(gm, 0, 600, "combo", "base", 3);
		this.add(nodo1);
		nodo2 = new Nodo(gm, 400, 600, "combo", "raro", 3);
		this.add(nodo2);
		nodo3 = new Nodo(gm, 800, 600, "combo", "z", 3);
		this.add(nodo3);
	}

}
