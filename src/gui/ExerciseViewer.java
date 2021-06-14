package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import Health.ExerciseInput;
import Manager.HealthManager;

public class ExerciseViewer extends JPanel{
	
	HealthManager healthmanager;
	public HealthManager getHealthmanager() {
		return healthmanager;
	}

	public void setHealthmanager(HealthManager healthmanager) {
		this.healthmanager = healthmanager;
	}

	WindowFrame frame;

	public ExerciseViewer(WindowFrame frame, HealthManager healthmanager) {
		this.frame = frame;
		this.healthmanager = healthmanager;
		
		System.out.println("***"+healthmanager.size()+"***");
		
		DefaultTableModel m = new DefaultTableModel();
		
		m.addColumn("Part/Kind");
		m.addColumn("Exercise/Where");
		m.addColumn("Set*Reps/Distance/Date");
		m.addColumn("Weight/Speed/Time");

		for(int i=0; i<healthmanager.size();i++)		{
			Vector row = new Vector();
			ExerciseInput ei = healthmanager.get(i);
			row.add(ei.getPart());
			row.add(ei.getExercise());
			row.add(ei.getSet());
			row.add(ei.getWeight());
			m.addRow(row);
		}
		
		JTable t = new JTable(m);
		JScrollPane sp = new JScrollPane(t);
		
		this.add(sp);

	}

}
