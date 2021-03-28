import java.util.Scanner;

public class HealthManager {
	public static void addexercise() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Exercise Part: ");
		String part = input.next();
		if(part.equals("back")) {
			System.out.print("Exericse: ");
			String back1 = input.next();
			System.out.print("Set*Reps");
			String back2 = input.next();
			System.out.print("weight");
			String back3 = input.next();
		}
		else if(part.equals("chest")) {
			System.out.print("Exericse: ");
			String chest1 = input.next();
			System.out.print("Set*Reps");
			String chest2 = input.next();
			System.out.print("weight");
			String chest3 = input.next();
		}
		else if(part.equals("legs")) {
			System.out.print("Exericse: ");
			String legs1 = input.next();
			System.out.print("Set*Reps");
			String legs2 = input.next();
			System.out.print("weight");
			String legs3 = input.next();
		}
		else if(part.equals("arms)")) {
			System.out.print("Exericse: ");
			String arms1 = input.next();
			System.out.print("Set*Reps");
			String arms2 = input.next();
			System.out.print("weight");
			String arms3 = input.next();
		}
		else if(part.equals("shoulders")) {
			System.out.print("Exericse: ");
			String shoulders1 = input.next();
			System.out.print("Set*Reps");
			String shoulders2 = input.next();
			System.out.print("weight");
			String shoulders3 = input.next();
		}

	}
	public static void deleteexercise() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Exercise Part: ");
		String part1 = input.next();
	}
	public static void editexercise() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Exercise Part: ");
		String part = input.next();
	}
	public static void viewexercise() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Exercise Part: ");
		String part = input.next();
	}
	
	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while (num !=6) {
			System.out.println("1. Add Exercise And Routine");
			System.out.println("2. Delete Exercise");
			System.out.println("3. Edit Routine");
			System.out.println("4. View Exercise");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.println("Select one number 1-6:");
			num = input.nextInt();
			
			
			if (num ==1) {
				addexercise();
			}
			else if (num ==2) {
				deleteexercise();
			}
			else if (num ==3) {
				editexercise();
			}
			else if (num ==4) {
				viewexercise();
			}
			else {
				continue;
			}
		}
	}

}
