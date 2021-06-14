package gui;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import Listener.AerobicListener;
import Listener.WeightListener;
import Listener.WorkoutListener;

public class SelectExercise extends JPanel {
	WindowFrame frame;
	
	public SelectExercise(WindowFrame frame) {

		this.frame = frame;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());

		JButton b1 = new JButton("Weight Exercise");
		b1.addActionListener(new WeightListener(frame));
		JButton b2 = new JButton("Aerobic Exercise");
		b2.addActionListener(new AerobicListener(frame));
		JButton b3 = new JButton("Workout Exercise");
		b3.addActionListener(new WorkoutListener(frame));
		
		
		this.add(b1);
		this.add(b2);
		this.add(b3);
		
		this.add(panel);
		this.setVisible(true);
	}
	
}
