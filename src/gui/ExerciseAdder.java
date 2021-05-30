package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class ExerciseAdder extends JFrame{

	public ExerciseAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel lpart = new JLabel("Part: ", JLabel.TRAILING);
		JTextField fpart = new JTextField(10);
		lpart.setLabelFor(fpart);
		panel.add(lpart);
		panel.add(fpart);
		
		JLabel lexercise = new JLabel("Exercise: ", JLabel.TRAILING);
		JTextField fexercise = new JTextField(10);
		lexercise.setLabelFor(fexercise);
		panel.add(lexercise);
		panel.add(fexercise);
		
		JLabel lset = new JLabel("Set*Reps: ", JLabel.TRAILING);
		JTextField fset = new JTextField(10);
		lset.setLabelFor(fset);
		panel.add(lset);
		panel.add(fset);
		
		JLabel lweight = new JLabel("Weight: ", JLabel.TRAILING);
		JTextField fweight = new JTextField(10);
		lset.setLabelFor(fweight);
		panel.add(lweight);
		panel.add(fweight);
		
		SpringUtility.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setVisible(true);
	}
}
