package Health;

import java.util.Scanner;

public abstract class Health {

	protected ExerciseKind kind= ExerciseKind.weightexercise; 
	protected String part;
	protected String exercise;
	protected String set;
	protected String weight;
	
	public Health() {
		
	}
	public Health(ExerciseKind kind) {
		this.kind =kind;
	}
	public Health(String part ) {
		this.part = part;
	}
	public Health(String part, String exercise, String set, String weight ) {
		this.part = part;
		this.exercise = exercise;
		this.set = set;
		this.weight = weight;
	}
	public ExerciseKind getKind() {
		return kind;
	}
	public void setKind(ExerciseKind kind) {
		this.kind = kind;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public String getExercise() {
		return exercise;
	}
	public void setExercise(String exercise) {
		this.exercise = exercise;
	}
	public String getSet() {
		return set;
	}
	public void setSet(String set) {
		this.set = set;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public abstract void getUserInput(Scanner input);

}
