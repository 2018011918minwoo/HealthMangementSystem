package Health;

import java.util.Scanner;

public class Outsideworkout extends Health implements ExerciseInput{
	public Outsideworkout(ExerciseKind kind) {
		this.kind =kind;
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
