package main;

import java.awt.*;
import javax.swing.*;

public class UI {
	
	Gioco gm;
	
	JFrame frame = new JFrame();
	public JPanel[] schermate = new JPanel[4];
	JLabel[] sfondi = new JLabel[4];
	
	public Tree tree;
	
	public JButton tornaMenu = new JButton();
	public Resource risorse;
	
	JButton mineraliBase1[] = new JButton[46];
	JButton mineraliBase2[] = new JButton[46];
	JButton mineraliBase3[] = new JButton[46];
	JButton mineraliRari1[] = new JButton[46];
	JButton mineraliRari2[] = new JButton[46];
	JButton mineraliRari3[] = new JButton[46];
	JButton mineraliZ1[] = new JButton[46];
	JButton mineraliZ2[] = new JButton[46];
	JButton mineraliZ3[] = new JButton[46];
	
	public UI(Gioco gm) {
		this.gm = gm;
		creaFinestra();
		creaScene();
		frame.setVisible(true);
	}

	public void creaFinestra() {
		//settaggio finestra
		
		Image icon = gm.toolkit.getImage(getClass().getResource("/Logo.png"));
		Cursor cursore = gm.toolkit.createCustomCursor(icon, new Point(0, 0), "custom");
		frame.setIconImage(icon);
		frame.setCursor(cursore);
		
		frame.setResizable(false);
		frame.setSize(gm.risoluzione.width, gm.risoluzione.height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.setLayout(null); //layout personalizzato
		
	}
	
	public void creaBackground(int n, String nomeFile) {
		//setto la schermata
		schermate[n]= new JPanel();
		schermate[n].setBounds(0, 0, gm.risoluzione.width, gm.risoluzione.height);
		schermate[n].setLayout(null);

		frame.add(schermate[n]);
		
		//setto lo sfondo
		sfondi[n]  = new JLabel();
		sfondi[n].setBounds(0, 0, gm.risoluzione.width, gm.risoluzione.height);
		ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource(nomeFile)); //insieme di metodi per trovar e il file sia in IDE che in jar
		Image img = icon.getImage().getScaledInstance(gm.risoluzione.width, gm.risoluzione.height, Image.SCALE_SMOOTH);
		icon = new ImageIcon(img);
		sfondi[n].setIcon(icon); //do alla label un'immagine piuttosto che un testo
		
	}
	
	public void createObject(int bgNum, int objx, int objy, int objWidth, int objHeight, String fileName) {
		JLabel label = new JLabel();
		ImageIcon buttonIcon = new ImageIcon(getClass().getClassLoader().getResource(fileName));
		Image img = buttonIcon.getImage().getScaledInstance(objWidth, objHeight, Image.SCALE_SMOOTH);
		buttonIcon = new ImageIcon(img);
		label.setBounds(objx, objy, objWidth, objHeight);
		label.setIcon(buttonIcon);
		sfondi[bgNum].add(label);
	}
	
	public JButton createButton(int bgNum, int objx, int objy, int objWidth, int objHeight, String fileName, String filePressed, ButtonPressed action) {
		JButton button = new JButton();
		ImageIcon buttonIcon = new ImageIcon(getClass().getClassLoader().getResource(fileName));
		Image img = buttonIcon.getImage().getScaledInstance(objWidth, objHeight, Image.SCALE_SMOOTH);
		buttonIcon = new ImageIcon(img);
		button.setIcon(buttonIcon);
		buttonIcon = new ImageIcon(getClass().getClassLoader().getResource(filePressed));
		img = buttonIcon.getImage().getScaledInstance(objWidth, objHeight, Image.SCALE_SMOOTH);
		buttonIcon = new ImageIcon(img);
		button.setPressedIcon(buttonIcon);
		button.setBounds(objx, objy, objWidth, objHeight);
		button.setBackground(null);
		button.setContentAreaFilled(false);
		button.setFocusPainted(false);
		button.addMouseListener(gm.avviaEv);
		button.setBorderPainted(false);
		button.putClientProperty("azione", action);
		sfondi[bgNum].add(button);
		return button;
	}
	
	public void createTree(int bgNum) {
		tree = new Tree(gm);
		sfondi[bgNum].add(tree);
	}

	public void creaScene() {
		//scena1
		creaBackground(1, "sfondo 1.jpg");
		createObject(1, gm.risoluzione.xTitolo, gm.risoluzione.yTitolo, gm.risoluzione.wTitolo, gm.risoluzione.hTitolo, "titolo.png");
		createButton(1, gm.risoluzione.xNewGame, gm.risoluzione.yNewGame, gm.risoluzione.wNewGame, gm.risoluzione.hNewGame, "new game.png", "new game pressed.png",ButtonPressed.NewGame);
		createButton(1, gm.risoluzione.xLoad, gm.risoluzione.yLoad, gm.risoluzione.wLoad, gm.risoluzione.hLoad, "load.png", "", ButtonPressed.Load);
		createButton(1, gm.risoluzione.xOptions, gm.risoluzione.yOptions, gm.risoluzione.wOptions, gm.risoluzione.hOptions, "options.png", "", ButtonPressed.Options);
		createButton(1, gm.risoluzione.xCrediti, gm.risoluzione.yCrediti, gm.risoluzione.wCrediti, gm.risoluzione.hCrediti, "crediti.png", "", ButtonPressed.Crediti);
		createButton(1, gm.risoluzione.xCiccioGhe, gm.risoluzione.yCiccioGhe, gm.risoluzione.wCiccioGhe, gm.risoluzione.hCiccioGhe, "ciccioghe.jpg", "", ButtonPressed.Chiudi);
		schermate[1].add(sfondi[1]);
		
		//scena2
		creaBackground(2, "sfondo 2.jpg");
		tornaMenu = createButton(2, gm.risoluzione.xTornaMenu, gm.risoluzione.yTornaMenu, gm.risoluzione.wTornaMenu, gm.risoluzione.hTornaMenu, "torna menu.png", "", ButtonPressed.Menu);
		createButton(2, gm.risoluzione.xTree, gm.risoluzione.yTree, gm.risoluzione.wTree, gm.risoluzione.hTree, "torna menu.png", "", ButtonPressed.Tree);
		createButton(2, gm.risoluzione.xCiccioGhe, gm.risoluzione.yCiccioGhe, gm.risoluzione.wCiccioGhe, gm.risoluzione.hCiccioGhe, "ciccioghe.jpg", "", ButtonPressed.Chiudi);
		createButton(2, gm.risoluzione.xStartRound, gm.risoluzione.yStartRound, gm.risoluzione.wStartRound, gm.risoluzione.hStartRound, "start round.png", "", ButtonPressed.StartRound);
		creaMinerali("minerale base 1.png", "minerale base 2.png", "minerale base 3.png", "minerale raro 1.png", "minerale raro 2.png", "minerale raro 3.png", "minerale z 1.png", "minerale z 2.png", "minerale z 3.png");
    	listenerMinerali1(ButtonPressed.M1toM2);
    	listenerMinerali2(ButtonPressed.M2toM3);
    	listenerMinerali3(ButtonPressed.M3toNull);
		createObject(2, gm.risoluzione.xCaselle, gm.risoluzione.yCaselle, gm.risoluzione.wCaselle, gm.risoluzione.hCaselle, "caselle.png");
		risorse = new Resource(gm);
		risorse.setResource();
		sfondi[2].add(risorse);
		schermate[2].add(sfondi[2]);
		
		//scena 3
		creaBackground(3, "sfondo 2.jpg");
		createButton(3, gm.risoluzione.xTree, gm.risoluzione.yTree, gm.risoluzione.wTree, gm.risoluzione.hTree, "torna menu.png", "", ButtonPressed.NewGame);
		createButton(3, gm.risoluzione.xTornaMenu, gm.risoluzione.yTornaMenu, gm.risoluzione.wTornaMenu, gm.risoluzione.hTornaMenu, "torna menu.png", "", ButtonPressed.Menu);
		createButton(3, gm.risoluzione.xCiccioGhe, gm.risoluzione.yCiccioGhe, gm.risoluzione.wCiccioGhe, gm.risoluzione.hCiccioGhe, "ciccioghe.jpg", "", ButtonPressed.Chiudi);
		createTree(3);
		schermate[3].add(sfondi[3]);
	}
	
	public void creaMinerali(String fileName1, String fileName2, String fileName3, String fileName4, String fileName5, String fileName6, String fileName7, String fileName8, String fileName9) {
	    int m1 = 0; 
	    ImageIcon mineraleb1 = new ImageIcon(getClass().getClassLoader().getResource(fileName1));
	    ImageIcon mineraleb2 = new ImageIcon(getClass().getClassLoader().getResource(fileName2));
	    ImageIcon mineraleb3 = new ImageIcon(getClass().getClassLoader().getResource(fileName3));
	    ImageIcon mineraler1 = new ImageIcon(getClass().getClassLoader().getResource(fileName4));
	    ImageIcon mineraler2 = new ImageIcon(getClass().getClassLoader().getResource(fileName5));
	    ImageIcon mineraler3 = new ImageIcon(getClass().getClassLoader().getResource(fileName6));
	    ImageIcon mineralez1 = new ImageIcon(getClass().getClassLoader().getResource(fileName7));
	    ImageIcon mineralez2 = new ImageIcon(getClass().getClassLoader().getResource(fileName8));
	    ImageIcon mineralez3 = new ImageIcon(getClass().getClassLoader().getResource(fileName9));
	    int objx = gm.risoluzione.xCreaMinerali1-gm.risoluzione.xCreaMinerali12Piu;
	    for(int c = 0; c < 7; c++) {
	        objx = objx + gm.risoluzione.xCreaMinerali12Piu;
	        int objy = gm.risoluzione.yCreaMinerali1-gm.risoluzione.yCreaMinerali12Piu;
	        for(int i = 0; i < 4; i++) {
	            objy = objy + gm.risoluzione.yCreaMinerali12Piu;
	            configuraMinerali(mineraliBase1, m1, objx, objy, mineraleb1);
	            configuraMinerali(mineraliBase2, m1, objx, objy, mineraleb2);
	            configuraMinerali(mineraliBase3, m1, objx, objy, mineraleb3);
	            configuraMinerali(mineraliRari1, m1, objx, objy, mineraler1);
	            configuraMinerali(mineraliRari2, m1, objx, objy, mineraler2);
	            configuraMinerali(mineraliRari3, m1, objx, objy, mineraler3);
	            configuraMinerali(mineraliZ1, m1, objx, objy, mineralez1);
	            configuraMinerali(mineraliZ2, m1, objx, objy, mineralez2);
	            configuraMinerali(mineraliZ3, m1, objx, objy, mineralez3);
	            m1++;
	        }
	    }
	    objx = gm.risoluzione.xCreaMinerali2-gm.risoluzione.xCreaMinerali12Piu;
	    for(int c = 0; c < 6; c++) {
	        objx = objx + gm.risoluzione.xCreaMinerali12Piu;
	        int objy = gm.risoluzione.yCreaMinerali2-gm.risoluzione.yCreaMinerali12Piu;
	        for(int i = 0; i < 3; i++) {
	        	objy = objy + gm.risoluzione.yCreaMinerali12Piu;
	        	configuraMinerali(mineraliBase1, m1, objx, objy, mineraleb1);
	            configuraMinerali(mineraliBase2, m1, objx, objy, mineraleb2);
	            configuraMinerali(mineraliBase3, m1, objx, objy, mineraleb3);
	            configuraMinerali(mineraliRari1, m1, objx, objy, mineraler1);
	            configuraMinerali(mineraliRari2, m1, objx, objy, mineraler2);
	            configuraMinerali(mineraliRari3, m1, objx, objy, mineraler3);
	            configuraMinerali(mineraliZ1, m1, objx, objy, mineralez1);
	            configuraMinerali(mineraliZ2, m1, objx, objy, mineralez2);
	            configuraMinerali(mineraliZ3, m1, objx, objy, mineralez3);
		        m1++;
	        }
	    }
	}
	
	private void configuraMinerali(JButton[] minerali, int ind, int x, int y, ImageIcon icon) {
		minerali[ind] = new JButton();
		Image img = icon.getImage().getScaledInstance(gm.risoluzione.wBottoneMinerale, gm.risoluzione.hBottoneMinerale, Image.SCALE_SMOOTH);
		ImageIcon buttonIcon = new ImageIcon(img);
		minerali[ind].setIcon(buttonIcon);
		minerali[ind].setBounds(x, y, gm.risoluzione.wBottoneMinerale, gm.risoluzione.hBottoneMinerale);
		minerali[ind].setContentAreaFilled(false);
		minerali[ind].setFocusPainted(false);
		minerali[ind].setBorderPainted(false);
	    sfondi[2].add(minerali[ind]);
	    minerali[ind].setVisible(false);
	}
	
	public void listenerMinerali1(ButtonPressed action) {
		for(int c = 0; c < 46; c++) {
			mineraliBase1[c].addMouseListener(gm.avviaEv);
			mineraliBase1[c].putClientProperty("azione", action);
			mineraliRari1[c].addMouseListener(gm.avviaEv);
			mineraliRari1[c].putClientProperty("azione", action);
			mineraliZ1[c].addMouseListener(gm.avviaEv);
			mineraliZ1[c].putClientProperty("azione", action);
		}
	}
	
	public void listenerMinerali2(ButtonPressed action) {
		for(int c = 0; c < 46; c++) {
			mineraliBase2[c].addMouseListener(gm.avviaEv);
			mineraliBase2[c].putClientProperty("azione", action);
			mineraliRari2[c].addMouseListener(gm.avviaEv);
			mineraliRari2[c].putClientProperty("azione", action);
			mineraliZ2[c].addMouseListener(gm.avviaEv);
			mineraliZ2[c].putClientProperty("azione", action);
		}
	}
	
	public void listenerMinerali3(ButtonPressed action) {
		for(int c = 0; c < 46; c++) {
			mineraliBase3[c].addMouseListener(gm.avviaEv);
			mineraliBase3[c].putClientProperty("azione", action);
			mineraliBase3[c].putClientProperty("spacca", Rotto.gem1Rotta);
			mineraliRari3[c].addMouseListener(gm.avviaEv);
			mineraliRari3[c].putClientProperty("azione", action);
			mineraliRari3[c].putClientProperty("spacca", Rotto.gem2Rotta);
			mineraliZ3[c].addMouseListener(gm.avviaEv);
			mineraliZ3[c].putClientProperty("azione", action);
			mineraliZ3[c].putClientProperty("spacca", Rotto.gem3Rotta);
		}
	}
	
}
