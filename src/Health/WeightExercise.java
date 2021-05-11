package Health;

import java.util.Scanner;

public class WeightExercise extends Health implements ExerciseInput{

	public WeightExercise(ExerciseKind kind) {
		this.kind =kind;
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
}
