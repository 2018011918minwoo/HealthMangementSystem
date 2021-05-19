import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuMaganger {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HealthManager healthmanager = new HealthManager(input);

		SelectMenu(input, healthmanager);

	}
	public static void SelectMenu(Scanner input, HealthManager healthmanager) {
		int num = 0;
		while (num !=5) {
			try { 
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					healthmanager.addexercise();
					break;
				case 2:
					healthmanager.deleteexercise();
					break;
				case 3:
					healthmanager.editexercise();
					break;
				case 4:
					healthmanager.viewexercises();
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}

	public static void showMenu() {
		System.out.println("1. Add Exercise And Routine");
		System.out.println("2. Delete Exercise");
		System.out.println("3. Edit Routine");
		System.out.println("4. View Exercises");
		System.out.println("5. Exit");
		System.out.println("Select one number 1-5:");
	}
}
