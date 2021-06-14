package Listener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import Manager.HealthManager;
import gui.ExerciseViewer;
import gui.WindowFrame;

public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ExerciseViewer exerciseviewer = frame.getV();
		HealthManager healthmanager = getObject("healthmanager.ser");
		exerciseviewer.setHealthmanager(healthmanager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getV());
		frame.revalidate();
		frame.repaint();
	}
	public static HealthManager getObject(String filename) {
		HealthManager healthmanager = null;
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			healthmanager = (HealthManager) in.readObject();
			
			in.close();
			file.close();			
		} catch (FileNotFoundException e) {
			return healthmanager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return healthmanager;
	}
}
