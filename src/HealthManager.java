import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import Health.AerobicExercise;
import Health.ExerciseInput;
import Health.ExerciseKind;
import Health.Health;
import Health.Outsideworkout;
import Health.WeightExercise;

public class HealthManager {
	ArrayList<ExerciseInput> healths = new ArrayList<ExerciseInput>();
	Scanner input;
	HealthManager(Scanner input){
		this.input = input;
	}
	public void addexercise() {
		int kind=0;
		ExerciseInput exerciseinput;

		while (kind != 1 && kind !=2 && kind !=3) {
			System.out.println("1 for Weight Exercise");
			System.out.println("2 for Aerobic Exercise");
			System.out.println("3 for Ouside Workout");
			System.out.println("Select Exercise Kind between 1, 2 and 3:");
			kind = input.nextInt();
			if(kind == 1) {
				exerciseinput = new WeightExercise(ExerciseKind.weightexercise);
				exerciseinput.getUserInput(input);
				healths.add(exerciseinput);
				break;
			}
			else if(kind == 2) {
				exerciseinput = new AerobicExercise(ExerciseKind.aerobicexercise);
				exerciseinput.getUserInput(input);
				healths.add(exerciseinput);
				break;
			}
			else if(kind == 3) {
				exerciseinput = new Outsideworkout(ExerciseKind.outsideworkout);
				exerciseinput.getUserInput(input);
				healths.add(exerciseinput);
				break;
			}
			else {
				System.out.print("Select Exercise Kind between 1 and 2:");
			}
		}
	}

	public void deleteexercise() {
		System.out.print("Exercise(Where): ");
		String exercise = input.next();
		int index = -1;
		for(int i=0; i<healths.size();i++) {
			if(healths.get(i).getExercise().equals(exercise)){
				index = i;  
				break;
			}
		}
		if(index>=0){
			healths.remove(index);
			System.out.println("Exercise"+exercise+" is deleted");
		}
		else {
			System.out.println("Exercise has not been registered");
			return;
		}
	}

	public void editexercise() {
		System.out.println("Exercise Part(Kind/Workout kind) : ");
		String part = input.next();
		System.out.println("Exercise(Where): ");
		String exercise = input.next();

		int index = -1;
		for(int j=0;j<healths.size();j++) {
			if(healths.get(j).getPart().equals(part) && healths.get(j).getExercise().equals(exercise)) {
				index=j;
			}
		}

		for(int i=0; i<healths.size();i++) {
			ExerciseInput exerciseinput = healths.get(i);
			if(index==i) {
				int num = -1;
				while (num !=5) {
					System.out.println("1. Edit Part(Kind)");
					System.out.println("2. Edit Exercise(Where)");
					System.out.println("3. Edit Set*Reps(Distance/Date)");
					System.out.println("4. Edit weight(Speed/Time)");
					System.out.println("5. Exit");
					System.out.println("Select one number 1-5:");
					num = input.nextInt();

					if (num ==1) {
						System.out.print("Part(Kind):");
						String part1 = input.next();
						exerciseinput.setPart(part);
					}
					else if (num ==2) {
						System.out.print("Exercise(Where):");
						String exercise1 = input.next();
						exerciseinput.setExercise(exercise);
					}
					else if (num ==3) {
						System.out.print("Set*Reps(Distance/Date):");
						String set = input.next();
						exerciseinput.setSet(set);
					}
					else if (num ==4) {
						System.out.print("Weight(Speed/Time):");
						String weight = input.next();
						exerciseinput.setWeight(weight);
					}
					else {
						continue;
					}//if
				}//while
				break;
			}//if
		}//for
	}
	public void viewexercises() {
		for(int i=0; i<healths.size();i++) {
			healths.get(i).HealthInfo();
		}
	}
}

