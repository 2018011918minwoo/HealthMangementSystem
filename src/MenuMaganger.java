import java.util.Scanner;

public class MenuMaganger {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HealthManager healthmanager = new HealthManager(input);
		int num = 0;
		
		while (num !=5) {
			System.out.println("1. Add Exercise And Routine");
			System.out.println("2. Delete Exercise");
			System.out.println("3. Edit Routine");
			System.out.println("4. View Exercises");
			System.out.println("5. Exit");
			System.out.println("Select one number 1-5:");
			num = input.nextInt();
			
			
			if (num ==1) {
				healthmanager.addexercise();
			}
			else if (num ==2) {
				healthmanager.deleteexercise();
			}
			else if (num ==3) {
				healthmanager.editexercise();
			}
			else if (num ==4) {
				healthmanager.viewexercises();
			}
			else {
				continue;
			}
		}
	}

}
