import java.util.Scanner;

public class HealthManager {

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
			
			
			switch (num) {
			case 1:
				System.out.print("Exercise Part: ");
				String part = input.next();
				switch (part) {
				case "back":
					System.out.print("Exericse: ");
					String back1 = input.next();
					System.out.print("Set*Reps");
					String back2 = input.next();
					System.out.print("weight");
					String back3 = input.next();
					break;
				case "chest":
					System.out.print("Exericse: ");
					String chest1 = input.next();
					System.out.print("Set*Reps");
					String chest2 = input.next();
					System.out.print("weight");
					String chest3 = input.next();
					break;
				case "legs":
					System.out.print("Exericse: ");
					String legs1 = input.next();
					System.out.print("Set*Reps");
					String legs2 = input.next();
					System.out.print("weight");
					String legs3 = input.next();
					break;
				case "arms":
					System.out.print("Exericse: ");
					String arms1 = input.next();
					System.out.print("Set*Reps");
					String arms2 = input.next();
					System.out.print("weight");
					String arms3 = input.next();
					break;
				case "shoulders":
					System.out.print("Exericse: ");
					String shoulder1 = input.next();
					System.out.print("Set*Reps");
					String shoulder2 = input.next();
					System.out.print("weight");
					String shoulder3 = input.next();
					break;
				}
				
				
			case 2:
				System.out.print("Exercise Part: ");
				String part1 = input.next();
			case 3:
				System.out.print("Exercise Part: ");
				String part2 = input.next();
			case 4:
			System.out.print("Exercise Part: ");
			String part3 = input.next();
			}
		}
	}

}
