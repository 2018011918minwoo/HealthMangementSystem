package Manager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Health.AerobicExercise;
import Health.ExerciseInput;
import Health.ExerciseKind;
import Health.Health;
import Health.Outsideworkout;
import Health.WeightExercise;

public class HealthManager implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6879430279551313616L;
	
	ArrayList<ExerciseInput> healths = new ArrayList<ExerciseInput>();
	transient Scanner input;
	
	HealthManager(){
		
	}
	
	HealthManager(Scanner input){
		this.input = input;
	}
	
	public void addexercise(String part, String exercise, String set, String weight) {
		ExerciseInput exerciseinput = new WeightExercise(ExerciseKind.weightexercise);
		exerciseinput.getUserInput(input);
		healths.add(exerciseinput);
	}
	public void addexercise(ExerciseInput exerciseinput) {
		healths.add(exerciseinput);
	}
	
	public void addexercise() {
		int kind=0;
		ExerciseInput exerciseinput;

		while (kind != 1 && kind !=2 && kind !=3) {
			try {
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
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 3");
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}

	public void deleteexercise() {
		System.out.print("Exercise(Where): ");
		String exercise = input.next();
		int index = findIndex(exercise);
		removefromExercise(index, exercise);
	}
	public int findIndex(String exercise) {
		int index = -1;
		for(int i=0; i<healths.size();i++) {
			if(healths.get(i).getExercise().equals(exercise)){
				index = i;  
				break;
			}
		}
		return index;
	}

	public void removefromExercise(int index, String exercise ) {
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
					showEditMenu();
					num = input.nextInt();

					switch(num) {
					case 1:
						exerciseinput.setExercisePart(input);
						break;
					case 2:
						exerciseinput.setExercise(input);
						break;
					case 3:
						exerciseinput.setSet(input);
						break;
					case 4:
						exerciseinput.setWeight(input);
						break;
					default:
						continue;
					}//switch
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
	
	public int size() {
		return healths.size();
	}
	public ExerciseInput get(int index) {
		return (Health) healths.get(index);
	}

	public void showEditMenu() {
		System.out.println("1. Edit Part(Kind)");
		System.out.println("2. Edit Exercise(Where)");
		System.out.println("3. Edit Set*Reps(Distance/Date)");
		System.out.println("4. Edit weight(Speed/Time)");
		System.out.println("5. Exit");
		System.out.println("Select one number 1-5:");
	}
}

