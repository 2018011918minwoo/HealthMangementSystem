package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.WindowFrame;

public class AdderCancelListener implements ActionListener {
	
	WindowFrame frame;
	
	public AdderCancelListener(WindowFrame frame) {
		this.frame = frame;
	}

	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getM());
		frame.revalidate();
		frame.repaint();
	}

}
