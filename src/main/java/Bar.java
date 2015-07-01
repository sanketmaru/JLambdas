package main.java;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public interface Bar extends MouseListener {
	
	@Override
	default public void mouseClicked(MouseEvent e) {
		System.out.println("In mouse clicked");
		
	}

	@Override
	default public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	default public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	default public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	default public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
