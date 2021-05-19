package Health;

import java.util.Scanner;

import exception.SetException;

public class WeightExercise extends Health {

	public WeightExercise(ExerciseKind kind) {
		this.kind =kind;
	}
	
	
	public void getUserInput(Scanner input) {
		setExercisePart(input);
		
		if(part.equals("back")) {
			setExercise(input);
			setSet(input);
			setWeight(input);
		}
		else if(part.equals("chest")) {
			setExercise(input);
			setSet(input);
			setWeight(input);
		}
		else if(part.equals("legs")) {
			setExercise(input);
			setSet(input);
			setWeight(input);
		}
		else if(part.equals("arms)")) {
			setExercise(input);
			setSet(input);
			setWeight(input);
		}
		else if(part.equals("shoulders")) {
			setExercise(input);
			setSet(input);
			setWeight(input);
		}
	}
	
	public void HealthInfo() {
		String ekind = getKindString();
		System.out.println("Kind: "+ekind+"Part: "+ this.part + ", Excericse: " + this.exercise + ", Set*Reps: "+ this.set +", Weight: "+ this.weight);
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
