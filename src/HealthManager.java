import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import Health.AerobicExercise;
import Health.Health;

public class HealthManager {
	ArrayList<Health> healths = new ArrayList<Health>();
	Scanner input;
	HealthManager(Scanner input){
		this.input = input;
	}
	public void addexercise() {
		int kind=0;
		Health health;
		while (kind != 1 && kind !=2) {
			System.out.println("1 for Anaerobic Exercise");
			System.out.println("2 for Aerobic Exercise");
			System.out.println("Select Exercise Kind between 1 and 2:");
			kind = input.nextInt();
			if(kind == 1) {
				health = new Health();
				health.getUserInput(input);
				healths.add(health);
				break;
			}
			else if(kind == 2) {
				health = new AerobicExercise();
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
		System.out.println("Exercise Part: ");
		String part = input.next();
		System.out.println("Exercise: ");
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
					System.out.println("1. Edit Part");
					System.out.println("2. Edit Exercise");
					System.out.println("3. Edit Set*Reps");
					System.out.println("4. Edit weight");
					System.out.println("5. Exit");
					System.out.println("Select one number 1-5:");
					num = input.nextInt();

					if (num ==1) {
						System.out.print("Part:");
						String part1 = input.next();
						health.setPart(part);
					}
					else if (num ==2) {
						System.out.print("Exercise:");
						String exercise1 = input.next();
						health.setExercise(exercise);
					}
					else if (num ==3) {
						System.out.print("Set*Reps:");
						String set = input.next();
						health.setSet(set);
					}
					else if (num ==4) {
						System.out.print("Weight:");
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

