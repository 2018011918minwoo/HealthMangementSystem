package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.WindowFrame;

public class SelectionListener implements ActionListener {
	
	WindowFrame frame;
 
	public SelectionListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getS());
		frame.revalidate();
		frame.repaint();
	}

}
