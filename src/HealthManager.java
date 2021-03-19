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
				System.out.print("Exericse: ");
				String part1 = input.next();
				System.out.print("Set*Reps");
				String part2 = input.next();
				System.out.print("weight");
				String part3 = input.next();
				break;
			case 2:
			case 3:
			case 4:
			System.out.print("Exercise Part: ");
			String partb = input.next();
			}
		}
	}

}
