package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;


public class StartRound implements Runnable {

	Gioco gm;
	JButton startRound;
	int probabilitaBase = 33;
	int probabilitaRaro = 66;
	int probabilitaZ = 99;
	public int spawn = 46;
	public List<Integer> posizioniLibere = new ArrayList<>();
	
	public StartRound(Gioco gm, JButton startRound) {
		this.gm = gm;
		this.startRound = startRound;
	}
	
	@Override
	public void run() {
		startSpawnTimer();
	}
	
	private void startSpawnTimer() {

	    int maxSpawn = spawn;
	    int durataMax = 20;
	    int[] durata = {0};
	    
	    for (int i = 0; i < maxSpawn; i++) {
	        posizioniLibere.add(i);
	    }

	    Timer timer = new Timer(1000, e -> {
	       if (durata[0] >= durataMax) {
                ((Timer) e.getSource()).stop();
                gm.ui.tree.combo = 1;
                return;
            }
            
            if (!posizioniLibere.isEmpty()) {
            	spawn--;
            	boolean repeat = false;
            	int numeroRandom;
            	do {
            		repeat = false;
	                numeroRandom = (int) (Math.random() * 46);
	                if(gm.ui.mineraliBase1[numeroRandom].isVisible()||
	                   gm.ui.mineraliBase2[numeroRandom].isVisible()||
	                   gm.ui.mineraliBase3[numeroRandom].isVisible()||
	                   gm.ui.mineraliRari1[numeroRandom].isVisible()||
                       gm.ui.mineraliRari2[numeroRandom].isVisible()||
                       gm.ui.mineraliRari3[numeroRandom].isVisible()||
                       gm.ui.mineraliZ1[numeroRandom].isVisible()||
                       gm.ui.mineraliZ2[numeroRandom].isVisible()||
                       gm.ui.mineraliZ3[numeroRandom].isVisible()) {
	                	repeat = true;
	                }
            	}while(repeat);

                posizioniLibere.remove(spawn);
                int probabilita = (int) (Math.random() * 100);
                if (probabilita <= probabilitaBase) {
                    gm.ui.mineraliBase1[numeroRandom].setVisible(true);
                    gm.ui.mineraliBase2[numeroRandom].setVisible(true);
                    gm.ui.mineraliBase3[numeroRandom].setVisible(true);
                } else if (probabilita <= probabilitaRaro) {
                    gm.ui.mineraliRari1[numeroRandom].setVisible(true);
                    gm.ui.mineraliRari2[numeroRandom].setVisible(true);
                    gm.ui.mineraliRari3[numeroRandom].setVisible(true);
                } else {
                    gm.ui.mineraliZ1[numeroRandom].setVisible(true);
                    gm.ui.mineraliZ2[numeroRandom].setVisible(true);
                    gm.ui.mineraliZ3[numeroRandom].setVisible(true);
                }
            }

            durata[0]++;

            if (durata[0] == durataMax) {
                startRound.setVisible(true);
                gm.ui.tornaMenu.setVisible(true);
                for (int c = 0; c < 46; c++) {
                    gm.ui.mineraliBase1[c].setVisible(false);
                    gm.ui.mineraliBase2[c].setVisible(false);
                    gm.ui.mineraliBase3[c].setVisible(false);
                    gm.ui.mineraliRari1[c].setVisible(false);
                    gm.ui.mineraliRari2[c].setVisible(false);
                    gm.ui.mineraliRari3[c].setVisible(false);
                    gm.ui.mineraliZ1[c].setVisible(false);
                    gm.ui.mineraliZ2[c].setVisible(false);
                    gm.ui.mineraliZ3[c].setVisible(false);
                }
            }
	    });
	    
	    timer.start();
	}
}
