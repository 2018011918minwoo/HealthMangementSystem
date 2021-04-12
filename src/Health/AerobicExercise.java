package Health;

import java.util.Scanner;

public class AerobicExercise extends Health {
	public void getUserInput(Scanner input) {
		System.out.print("Aerobic Kind: ");
		String part = input.next();
		this.setPart(part);
		if(part.equals("areo")) {
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

	}
	public void HealthInfo() {
		System.out.println("Kind: "+ this.part + ", Excericse: " + this.exercise + ", Distance: "+ this.set +", Speedt: "+ this.weight);
	}
}
