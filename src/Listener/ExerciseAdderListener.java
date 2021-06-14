package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import Health.ExerciseInput;
import Health.ExerciseKind;
import Health.WeightExercise;
import Manager.HealthManager;
import exception.SetException;

public class ExerciseAdderListener implements ActionListener {
	JTextField fpart;
	JTextField fexercise;
	JTextField fset;
	JTextField fweight;
	HealthManager healthmanager;

	public ExerciseAdderListener(JTextField fpart, JTextField fexercise, JTextField fset, JTextField fweight, HealthManager healthmanager) {
		this.fpart = fpart;
		this.fexercise = fexercise;
		this.fset = fset;
		this.fweight = fweight;
		this.healthmanager = healthmanager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ExerciseInput exercise = new WeightExercise(ExerciseKind.weightexercise);
		try {
			exercise.setPart(fpart.getText());
			exercise.setExercise(fexercise.getText());
			exercise.setSet(fset.getText());
			exercise.setWeight(fweight.getText());
			healthmanager.addexercise(exercise);
			putObject(healthmanager, "healthmanager.ser");
			exercise.HealthInfo();
		} catch (SetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public static void putObject(HealthManager healthmanager, String filename) {

		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(healthmanager);

			out.close();
			file.close();			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
