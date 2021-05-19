package Health;

import java.util.Scanner;

import exception.SetException;

public abstract class Health implements ExerciseInput {

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
	public void setSet(String set) throws SetException{
	
		if(this.kind==ExerciseKind.weightexercise &&!set.contains("*") || set.equals("")) {
			throw new SetException();
		}
		this.set = set;
	}
	
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public abstract void getUserInput(Scanner input);
	
	public void setExercisePart(Scanner input) {
		switch(this.kind) {
		case weightexercise:
			System.out.print("Exercise Part: ");
			break;
		case aerobicexercise:
			System.out.print("Aerobic Kind: ");
			break;
		case outsideworkout:
			System.out.print("Workout Kind: ");
			break;
		default:
		}
		String part1 = input.next();
		this.setPart(part1);
	}
	public void setExercise(Scanner input) {
		switch(this.kind) {
		case weightexercise:
			System.out.print("Exericse: ");
			break;
		case aerobicexercise:
			System.out.print("Exercise: ");
			break;
		case outsideworkout:
			System.out.print("Where: ");
			break;
		default:
		}
		String exercise1 = input.next();
		this.setExercise(exercise1);
	}
	public void setSet (Scanner input){
		switch(this.kind) {
		case weightexercise:
			System.out.print("Set*Reps: ");
			break;
		case aerobicexercise:
			System.out.print("Distance:");
			break;
		case outsideworkout:
			System.out.print("Date:");
			break;
		default:
		}
		String set = "";
		if(this.kind==ExerciseKind.weightexercise && !set.contains("*")) {
			while(!set.contains("*")) {
				set = input.next();
				try {
					this.setSet(set);
				}
				catch(SetException e) {
					System.out.println("Incorrect Set*Reps Format. Contain *");
					System.out.print("Set*Reps: ");
				}
			}
		}
		else if(this.kind !=ExerciseKind.weightexercise){
			set = input.next();
			this.set=set;
		}
	}
	public void setWeight( Scanner input) {
		switch(this.kind) {
		case weightexercise:
			System.out.print("Weight: ");
			break;
		case aerobicexercise:
			System.out.print("Speed:");
			break;
		case outsideworkout:
			System.out.print("Time(x~y):");
			break;
		default:
		}
		String weight = input.next();
		this.setWeight(weight);
	}

}
