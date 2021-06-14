package gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import Listener.AdderCancelListener;
import Listener.ExerciseAdderListener;
import Manager.HealthManager;

public class OutsideAdder extends JPanel{
	WindowFrame frame;
	SelectExercise select;
	HealthManager healthmanager;
	
	public OutsideAdder(WindowFrame frame, HealthManager healthmanager) {
		this.frame = frame;
		this.healthmanager = healthmanager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel lpart = new JLabel("Workout kind: ", JLabel.TRAILING);
		JTextField fpart = new JTextField(10);
		lpart.setLabelFor(fpart);
		panel.add(lpart);
		panel.add(fpart);
		
		JLabel lexercise = new JLabel("Where: ", JLabel.TRAILING);
		JTextField fexercise = new JTextField(10);
		lexercise.setLabelFor(fexercise);
		panel.add(lexercise);
		panel.add(fexercise);
		
		JLabel lset = new JLabel("Date: ", JLabel.TRAILING);
		JTextField fset = new JTextField(10);
		lset.setLabelFor(fset);
		panel.add(lset);
		panel.add(fset);
		
		JLabel lweight = new JLabel("Time(x~y): ", JLabel.TRAILING);
		JTextField fweight = new JTextField(10);
		lset.setLabelFor(fweight);
		panel.add(lweight);
		panel.add(fweight);
		
		JButton savebotton = new JButton("save");
		savebotton.addActionListener(new ExerciseAdderListener(fpart, fexercise, fset, fweight, healthmanager));
		
		JButton cancelbotton = new JButton("cancel");
		cancelbotton.addActionListener(new AdderCancelListener(frame));
		
		panel.add(savebotton);
		panel.add(cancelbotton);
		
		SpringUtility.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);

		this.add(panel);
		this.setVisible(true);
	}

}
