package Health;

import java.util.Scanner;

public class Outsideworkout extends Health implements ExerciseInput{
	public Outsideworkout(ExerciseKind kind) {
		this.kind =kind;
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Workout Kind: ");
		String part = input.next();
		this.setPart(part);
		System.out.print("Where: ");
		String exercise = input.next();
		this.setExercise(exercise);
		System.out.print("Date:");
		String set = input.next();
		this.setSet(set);
		System.out.print("Time(x~y):");
		String weight = input.next();
		this.setWeight(weight);
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
		System.out.println("Kind: "+ekind+", Sports: "+ this.part + ", Where: " + this.exercise + ", Date: "+ this.set +", Time: "+ this.weight);
	}
}
