package main;

import java.awt.*;
import events.Event01;

public class Gioco {
	
	//1) 1920. 1080 2) 1366, 768

	Toolkit toolkit = Toolkit.getDefaultToolkit();
	Risoluzione risoluzione = new Risoluzione(this);
	AvviaEventi avviaEv = new AvviaEventi(this);
	public UI ui = new UI(this);
	public CambioSchermate change = new CambioSchermate(this);
	Event01 ev1 = new Event01(this);
	

	public static void main(String[] args) {
		System.setProperty("sun.java2d.uiScale", "1.0");
		new Gioco();
	}
	
	public Gioco() {
		ev1.menu();
	}

}
