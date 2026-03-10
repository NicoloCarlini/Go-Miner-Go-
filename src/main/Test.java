package main;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Test {
    
    public static void main(String[] args) {
       
    	JFrame frame = new JFrame("Panel draggable");
    	frame.setSize(800, 600);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setLayout(null); // fondamentale

    	JPanel dragPanel = new JPanel();
    	dragPanel.setBounds(200, 150, 300, 200);
    	dragPanel.setBackground(Color.BLUE);

    	frame.add(dragPanel);
    	frame.setVisible(true);

    	final Point[] clickPoint = new Point[1];

    	dragPanel.addMouseListener(new MouseAdapter() {
    	    @Override
    	    public void mousePressed(MouseEvent e) {
    	        clickPoint[0] = e.getPoint(); // punto cliccato nel panel
    	    }
    	});

    	dragPanel.addMouseMotionListener(new MouseMotionAdapter() {
    	    @Override
    	    public void mouseDragged(MouseEvent e) {
    	        int x = dragPanel.getX() + e.getX() - clickPoint[0].x;
    	        int y = dragPanel.getY() + e.getY() - clickPoint[0].y;
    	        dragPanel.setLocation(x, y);
    	    }
    	});

    	
    }
}