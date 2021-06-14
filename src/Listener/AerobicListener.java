package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.WindowFrame;

public class AerobicListener implements ActionListener {
	WindowFrame frame;
	 
	public AerobicListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getA());
		frame.revalidate();
		frame.repaint();
	}

}
