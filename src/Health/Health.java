package Health;

import java.util.Scanner;

public class Health {

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
	String ekind = "none";
	public void HealthInfo() {
		switch(this.kind) {
		case weightexercise:
			ekind = "Weightexercise, ";
			break;
		case aerobicexercise:
			ekind = "Aerobicexercise, ";
			break;
		case outsideworkout:
			ekind = "OutsideWorkout, ";
			break;
		default:
		}
		System.out.println("Kind: "+ekind+"Part: "+ this.part + ", Excericse: " + this.exercise + ", Set*Reps: "+ this.set +", Weight: "+ this.weight);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Exercise Part: ");
		String part = input.next();
		this.setPart(part);
		if(part.equals("back")) {
			System.out.print("Exericse: ");
			String exercise = input.next();
			this.setExercise(exercise);
			System.out.print("Set*Reps: ");
			String set = input.next();
			this.setSet(set);
			System.out.print("Weight: ");
			String weight = input.next();
			this.setWeight(weight);
		}
		else if(part.equals("chest")) {
			System.out.print("Exericse: ");
			String exercise = input.next();
			this.setExercise(exercise);
			System.out.print("Set*Reps: ");
			String set = input.next();
			this.setSet(set);
			System.out.print("Weight: ");
			String weight = input.next();
			this.setWeight(weight);
		}
		else if(part.equals("legs")) {
			System.out.print("Exericse: ");
			String exercise = input.next();
			this.setExercise(exercise);
			System.out.print("Set*Reps: ");
			String set = input.next();
			this.setSet(set);
			System.out.print("Weight: ");
			String weight = input.next();
			this.setWeight(weight);
		}
		else if(part.equals("arms)")) {
			System.out.print("Exericse: ");
			String exercise = input.next();
			this.setExercise(exercise);
			System.out.print("Set*Reps: ");
			String set = input.next();
			this.setSet(set);
			System.out.print("Weight: ");
			String weight = input.next();
			this.setWeight(weight);
		}
		else if(part.equals("shoulders")) {
			System.out.print("Exericse: ");
			String exercise = input.next();
			this.setExercise(exercise);
			System.out.print("Set*Reps: ");
			String set = input.next();
			this.setSet(set);
			System.out.print("Weight: ");
			String weight = input.next();
			this.setWeight(weight);
		}
	}
}
