package Health;

import java.util.Scanner;

import exception.SetException;

public interface ExerciseInput {

	public String getPart();
	
	public String getExercise();
	
	public String getSet();
	
	public String getWeight();
	
	public void setPart(String part);
	
	public void setExercise(String exercise);
	
	public void setSet(String set) throws SetException;
	
	public void setWeight(String weight);
	
	public void getUserInput(Scanner input);
	
	public void HealthInfo();
	
	public void setExercisePart(Scanner input);
	
	public void setExercise(Scanner input);
	
	public void setSet (Scanner input);
	
	public void setWeight(Scanner input);
	
}
