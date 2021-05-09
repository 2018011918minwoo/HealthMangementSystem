package Health;

import java.util.Scanner;

public interface ExerciseInput {

	public String getPart();
	
	public String getExercise();
	
	public void setPart(String part);
	
	public void setExercise(String exercise);
	
	public void setSet(String set);
	
	public void setWeight(String weight);
	
	public void getUserInput(Scanner input);
	
	public void HealthInfo();
}
