package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.WindowFrame;

public class WorkoutListener implements ActionListener {
	WindowFrame frame;
	 
	public WorkoutListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getO());
		frame.revalidate();
		frame.repaint();
	}

}
