package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.WindowFrame;

public class WeightListener implements ActionListener {
	WindowFrame frame;
	 
	public WeightListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getE());
		frame.revalidate();
		frame.repaint();
	}

}
