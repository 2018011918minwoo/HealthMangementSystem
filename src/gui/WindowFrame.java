package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Health.AerobicExercise;
import Manager.HealthManager;

public class WindowFrame extends JFrame{
	
	HealthManager healthmanager;
	MenuSelection m;
	ExerciseAdder e;
	ExerciseViewer v;
	SelectExercise s;
	AerobicAdder a;
	OutsideAdder o;
	
	public WindowFrame(HealthManager healthmanager) {
		this.healthmanager = healthmanager;
		
		this.m = new MenuSelection(this);
		this.e = new ExerciseAdder(this, this.healthmanager);
		this.v = new ExerciseViewer(this, this.healthmanager);
		this.s = new SelectExercise(this);
		this.a = new AerobicAdder(this, this.healthmanager);
		this.o = new OutsideAdder(this, this.healthmanager);
		
		this.setSize(1000,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		this.setupPanel(m);
		this.setVisible(true);
	}

	public void setupPanel(JPanel p) {
		this.getContentPane().removeAll();
		this.getContentPane().add(p);
		this.revalidate();
		this.repaint();
	}
	public MenuSelection getM() {
		return m;
	}
	public void setM(MenuSelection m) {
		this.m = m;
	}
	public ExerciseAdder getE() {
		return e;
	}
	public void setE(ExerciseAdder e) {
		this.e = e;
	}
	public ExerciseViewer getV() {
		return v;
	}
	public void setV(ExerciseViewer v) {
		this.v = v;
	}
	public SelectExercise getS() {
		return s;
	}

	public void setS(SelectExercise s) {
		this.s = s;
	}
	public AerobicAdder getA() {
		return a;
	}

	public void setA(AerobicAdder a) {
		this.a = a;
	}

	public OutsideAdder getO() {
		return o;
	}

	public void setO(OutsideAdder o) {
		this.o = o;
	}

}
