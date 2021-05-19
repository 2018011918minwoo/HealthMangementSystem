package Health;

import java.util.Scanner;

public class Outsideworkout extends Health{
	public Outsideworkout(ExerciseKind kind) {
		this.kind =kind;
	}

	public void getUserInput(Scanner input) {
		setExercisePart(input);
		setExercise(input);
		setSet(input);
		setWeight(input);
	}
	
	public void HealthInfo() {
		String ekind = getKindString();
		System.out.println("Kind: "+ekind+", Sports: "+ this.part + ", Where: " + this.exercise + ", Date: "+ this.set +", Time: "+ this.weight);
	}
	public String getKindString() {
		String ekind = "none";
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
		return ekind;
	}
}
