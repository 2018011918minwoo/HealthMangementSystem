import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import Health.AerobicExercise;
import Health.ExerciseKind;
import Health.Health;
import Health.Outsideworkout;

public class HealthManager {
	ArrayList<Health> healths = new ArrayList<Health>();
	Scanner input;
	HealthManager(Scanner input){
		this.input = input;
	}
	public void addexercise() {
		int kind=0;
		Health health;
		while (kind != 1 && kind !=2 && kind !=3) {
			System.out.println("1 for Weight Exercise");
			System.out.println("2 for Aerobic Exercise");
			System.out.println("3 for Ouside Workout");
			System.out.println("Select Exercise Kind between 1, 2 and 3:");
			kind = input.nextInt();
			if(kind == 1) {
				health = new Health(ExerciseKind.weightexercise);
				health.getUserInput(input);
				healths.add(health);
				break;
			}
			else if(kind == 2) {
				health = new AerobicExercise(ExerciseKind.aerobicexercise);
				health.getUserInput(input);
				healths.add(health);
				break;
			}
			else if(kind == 3) {
				health = new Outsideworkout(ExerciseKind.outsideworkout);
				health.getUserInput(input);
				healths.add(health);
				break;
			}
			else {
				System.out.print("Select Exercise Kind between 1 and 2:");
			}
		}
	}

	public void deleteexercise() {
		System.out.print("Exercise: ");
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
			Health health = healths.get(i);
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
						health.setPart(part);
					}
					else if (num ==2) {
						System.out.print("Exercise(Where):");
						String exercise1 = input.next();
						health.setExercise(exercise);
					}
					else if (num ==3) {
						System.out.print("Set*Reps(Distance/Date):");
						String set = input.next();
						health.setSet(set);
					}
					else if (num ==4) {
						System.out.print("Weight(Speed/Time):");
						String weight = input.next();
						health.setWeight(weight);
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

