package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class ExerciseViewer extends JFrame{

	public ExerciseViewer() {
		DefaultTableModel m = new DefaultTableModel();
		
		m.addColumn("Part");
		m.addColumn("Exercise");
		m.addColumn("Set*Reps");
		m.addColumn("Weight");

		
		JTable t = new JTable(m);
		JScrollPane sp = new JScrollPane(t);
		
		this.add(sp);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
