package Health;

import java.util.Scanner;

public class AerobicExercise extends Health {
	public AerobicExercise(ExerciseKind kind) {
		this.kind =kind;
	}
	public void getUserInput(Scanner input) {
		System.out.print("Aerobic Kind: ");
		String part = input.next();
		this.setPart(part);
		System.out.print("Exercise: ");
		String exercise = input.next();
		this.setExercise(exercise);
		System.out.print("Distance:");
		String set = input.next();
		this.setSet(set);
		System.out.print("Speed:");
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
		default:
		}
		System.out.println("Kind: "+ekind+ ", Excericse: " + this.exercise + ", Distance: "+ this.set +", Speed: "+ this.weight);
	}
}
