package main;

import java.awt.*;

import javax.swing.*;

public class Resource extends JLabel{
	
	int xNg1, yNg1;
	Gioco gm;
	public int nBase = 100, nRari = 100, nZ = 100;

	JLabel[] nBU = new JLabel[10];
	JLabel[] nBD = new JLabel[10];
	JLabel[] nBC = new JLabel[10];
	JLabel[] nBM = new JLabel[10];
	JLabel[] nRU = new JLabel[10];
	JLabel[] nRD = new JLabel[10];
	JLabel[] nRC = new JLabel[10];
	JLabel[] nRM = new JLabel[10];
	JLabel[] nZU = new JLabel[10];
	JLabel[] nZD = new JLabel[10];
	JLabel[] nZC = new JLabel[10];
	JLabel[] nZM = new JLabel[10];
	
	public Resource(Gioco gm) {
		this.gm = gm;
	}
	
	public void setResource() {
		this.setBounds(gm.risoluzione.xLabelResource, gm.risoluzione.yLabelResource, gm.risoluzione.wLabelResource, gm.risoluzione.hLabelResource);
		addLabelGem1();
		addLabelGem2();
		addLabelGem3();
	}
	
	public void addLabelGem1() {
		JLabel gem1 = new JLabel();
		ImageIcon buttonIcon = new ImageIcon(getClass().getClassLoader().getResource("minerale base 1.png"));
		Image img = buttonIcon.getImage().getScaledInstance(gm.risoluzione.wGem, gm.risoluzione.hGem, Image.SCALE_SMOOTH);
		buttonIcon = new ImageIcon(img);
		gem1.setBounds(gm.risoluzione.xGem, gm.risoluzione.yGem, gm.risoluzione.wGem, gm.risoluzione.hGem);
		gem1.setIcon(buttonIcon);
		this.add(gem1);
		for(int c = 0; c<10; c++) {
			nBM[c] = new JLabel();
			nBC[c] = new JLabel();
			nBD[c] = new JLabel();
			nBU[c] = new JLabel();
			buttonIcon = new ImageIcon(getClass().getClassLoader().getResource(c+".png"));
			img = buttonIcon.getImage().getScaledInstance(gm.risoluzione.wNumber, gm.risoluzione.hNumber, Image.SCALE_SMOOTH);
			buttonIcon = new ImageIcon(img);
			nBM[c].setIcon(buttonIcon);
			xNg1 = gm.risoluzione.xNgem123;
			yNg1 = gm.risoluzione.yNgem1;
			nBM[c].setBounds(xNg1, yNg1, gm.risoluzione.wNumber, gm.risoluzione.hNumber);
			nBC[c].setIcon(buttonIcon);
			xNg1 = xNg1+gm.risoluzione.xNgem123Piu;
			nBC[c].setBounds(xNg1, yNg1, gm.risoluzione.wNumber, gm.risoluzione.hNumber);
			nBD[c].setIcon(buttonIcon);
			xNg1 = xNg1+gm.risoluzione.xNgem123Piu;
			nBD[c].setBounds(xNg1, yNg1, gm.risoluzione.wNumber, gm.risoluzione.hNumber);
			nBU[c].setIcon(buttonIcon);
			xNg1 = xNg1+gm.risoluzione.xNgem123Piu;
			nBU[c].setBounds(xNg1, yNg1, gm.risoluzione.wNumber, gm.risoluzione.hNumber);
			this.add(nBM[c]);
			this.add(nBC[c]);
			this.add(nBD[c]);
			this.add(nBU[c]);
			nBM[c].setVisible(false);
			nBC[c].setVisible(false);
			nBD[c].setVisible(false);
			nBU[c].setVisible(false);
		}
		nBM[0].setVisible(true);
	}
	
	public void addLabelGem2() {
		JLabel gem2 = new JLabel();
		ImageIcon buttonIcon = new ImageIcon(getClass().getClassLoader().getResource("minerale raro 1.png"));
		Image img = buttonIcon.getImage().getScaledInstance(gm.risoluzione.wGem, gm.risoluzione.hGem, Image.SCALE_SMOOTH);
		buttonIcon = new ImageIcon(img);
		gem2.setBounds(gm.risoluzione.xGem, gm.risoluzione.yGem+gm.risoluzione.yGemPiu, gm.risoluzione.wGem, gm.risoluzione.hGem); 
		gem2.setIcon(buttonIcon);
		this.add(gem2);
		for(int c = 0; c<10; c++) {
			nRM[c] = new JLabel();
			nRC[c] = new JLabel();
			nRD[c] = new JLabel();
			nRU[c] = new JLabel();
			buttonIcon = new ImageIcon(getClass().getClassLoader().getResource(c+".png"));
			img = buttonIcon.getImage().getScaledInstance(gm.risoluzione.wNumber, gm.risoluzione.hNumber, Image.SCALE_SMOOTH);
			buttonIcon = new ImageIcon(img);
			nRM[c].setIcon(buttonIcon);
			xNg1 = gm.risoluzione.xNgem123;
			yNg1 = gm.risoluzione.yNgem2;
			nRM[c].setBounds(xNg1, yNg1, gm.risoluzione.wNumber, gm.risoluzione.hNumber);
			nRC[c].setIcon(buttonIcon);
			xNg1 = xNg1+gm.risoluzione.xNgem123Piu;
			nRC[c].setBounds(xNg1, yNg1, gm.risoluzione.wNumber, gm.risoluzione.hNumber);
			nRD[c].setIcon(buttonIcon);
			xNg1 = xNg1+gm.risoluzione.xNgem123Piu;
			nRD[c].setBounds(xNg1, yNg1, gm.risoluzione.wNumber, gm.risoluzione.hNumber);
			nRU[c].setIcon(buttonIcon);
			xNg1 = xNg1+gm.risoluzione.xNgem123Piu;
			nRU[c].setBounds(xNg1, yNg1, gm.risoluzione.wNumber, gm.risoluzione.hNumber);
			this.add(nRM[c]);
			this.add(nRC[c]);
			this.add(nRD[c]);
			this.add(nRU[c]);
			nRM[c].setVisible(false);
			nRC[c].setVisible(false);
			nRD[c].setVisible(false);
			nRU[c].setVisible(false);
		}
		nRM[0].setVisible(true);
	}
	
	public void addLabelGem3() {
		JLabel gem3 = new JLabel();
		ImageIcon buttonIcon = new ImageIcon(getClass().getClassLoader().getResource("minerale z 1.png"));
		Image img = buttonIcon.getImage().getScaledInstance(gm.risoluzione.wGem, gm.risoluzione.hGem, Image.SCALE_SMOOTH);
		buttonIcon = new ImageIcon(img);
		gem3.setBounds(gm.risoluzione.xGem, gm.risoluzione.yGem+gm.risoluzione.yGemPiu*2, gm.risoluzione.wGem, gm.risoluzione.hGem);
		gem3.setIcon(buttonIcon);
		this.add(gem3);
		for(int c = 0; c<10; c++) {
			nZM[c] = new JLabel();
			nZC[c] = new JLabel();
			nZD[c] = new JLabel();
			nZU[c] = new JLabel();
			buttonIcon = new ImageIcon(getClass().getClassLoader().getResource(c+".png"));
			img = buttonIcon.getImage().getScaledInstance(gm.risoluzione.wNumber, gm.risoluzione.hNumber, Image.SCALE_SMOOTH);
			buttonIcon = new ImageIcon(img);
			nZM[c].setIcon(buttonIcon);
			xNg1 = gm.risoluzione.xNgem123;
			yNg1 = gm.risoluzione.yNgem3;
			nZM[c].setBounds(xNg1, yNg1, gm.risoluzione.wNumber, gm.risoluzione.hNumber);
			nZC[c].setIcon(buttonIcon);
			xNg1 = xNg1+gm.risoluzione.xNgem123Piu;
			nZC[c].setBounds(xNg1, yNg1, gm.risoluzione.wNumber, gm.risoluzione.hNumber);
			nZD[c].setIcon(buttonIcon);
			xNg1 = xNg1+gm.risoluzione.xNgem123Piu;
			nZD[c].setBounds(xNg1, yNg1, gm.risoluzione.wNumber, gm.risoluzione.hNumber);
			nZU[c].setIcon(buttonIcon);
			xNg1 = xNg1+gm.risoluzione.xNgem123Piu;
			nZU[c].setBounds(xNg1, yNg1, gm.risoluzione.wNumber, gm.risoluzione.hNumber);
			this.add(nZM[c]);
			this.add(nZC[c]);
			this.add(nZD[c]);
			this.add(nZU[c]);
			nZM[c].setVisible(false);
			nZC[c].setVisible(false);
			nZD[c].setVisible(false);
			nZU[c].setVisible(false);
		}
		nZM[0].setVisible(true);
	}
	
	public void numberOff(JLabel[] label1, JLabel[] label2, JLabel[] label3, JLabel[] label4) {
		for(int c = 0; c<label1.length; c++) {
			label1[c].setVisible(false);
			label2[c].setVisible(false);
			label3[c].setVisible(false);
			label4[c].setVisible(false);
		}
	}
	
	public int calculateUnit(int n) {
		int unit = 0;
		while(n>=1000) {
			n = n-1000;
		} 
		while(n>=100) {
			n = n-100;
		}
		while(n>=10) {
			n = n-10;
		}
		while(n>0) {
			n = n-1;
			unit++;
		}
		return unit;
	}
	
	public int calculateDecin(int n) {
		int decin = 0;
		while(n>=1000) {
			n = n-1000;
		} 
		while(n>=100) {
			n = n-100;
		}
		while(n>=10) {
			n = n-10;
			decin++;
		}
		return decin;
	}
	
	public int calculateCent(int n) {
		int cent = 0;
		while(n>=1000) {
			n = n-1000;
		}
		
		while(n>=100) {
			n = n-100;
			cent++;
		}
		return cent;
	}
	
	public int calculateMigl(int n) {
		int migl = 0;
		while(n>=1000) {
			n = n-1000;
			migl++;
		}
		return migl;
	}
	
	public void addGem1(int i) {
		numberOff(nBM, nBC, nBD, nBU);
		nBase = nBase + i;
		if(nBase>9999) {
			nBase = 9999;
		}
		if(nBase<10) {
			nBM[nBase].setVisible(true);
		} else if(nBase<100) {
			nBM[calculateDecin(nBase)].setVisible(true);
			nBC[calculateUnit(nBase)].setVisible(true);
		} else if(nBase<1000) {
			nBM[calculateCent(nBase)].setVisible(true);
			nBC[calculateDecin(nBase)].setVisible(true);
			nBD[calculateUnit(nBase)].setVisible(true);
		} else {
			nBM[calculateMigl(nBase)].setVisible(true);
			nBC[calculateCent(nBase)].setVisible(true);
			nBD[calculateDecin(nBase)].setVisible(true);
			nBU[calculateUnit(nBase)].setVisible(true);
		}
	}
	
	public void addGem2(int i) {
		numberOff(nRM, nRC, nRD, nRU);
		nRari = nRari + i;
		if(nRari>9999) {
			nRari = 9999;
		}
		if(nRari<10) {
			nRM[nRari].setVisible(true);
		} else if(nRari<100) {
			nRM[calculateDecin(nRari)].setVisible(true);
			nRC[calculateUnit(nRari)].setVisible(true);
		} else if(nRari<1000) {
			nRM[calculateCent(nRari)].setVisible(true);
			nRC[calculateDecin(nRari)].setVisible(true);
			nRD[calculateUnit(nRari)].setVisible(true);
		} else {
			nRM[calculateMigl(nRari)].setVisible(true);
			nRC[calculateCent(nRari)].setVisible(true);
			nRD[calculateDecin(nRari)].setVisible(true);
			nRU[calculateUnit(nRari)].setVisible(true);
		}
	}
	
	public void addGem3(int i) {
		numberOff(nZM, nZC, nZD, nZU);
		nZ = nZ + i;
		if(nZ>9999) {
			nZ = 9999;
		}
		if(nZ<10) {
			nZM[nZ].setVisible(true);
		} else if(nZ<100) {
			nZM[calculateDecin(nZ)].setVisible(true);
			nZC[calculateUnit(nZ)].setVisible(true);
		} else if(nZ<1000) {
			nZM[calculateCent(nZ)].setVisible(true);
			nZC[calculateDecin(nZ)].setVisible(true);
			nZD[calculateUnit(nZ)].setVisible(true);
		} else {
			nZM[calculateMigl(nZ)].setVisible(true);
			nZC[calculateCent(nZ)].setVisible(true);
			nZD[calculateDecin(nZ)].setVisible(true);
			nZU[calculateUnit(nZ)].setVisible(true);
		}
	}
}
