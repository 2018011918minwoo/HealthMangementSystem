package Manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class MenuMaganger {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		HealthManager healthmanager = getObject("healthmanager.ser");
		if(healthmanager == null) {
			healthmanager = new HealthManager(input);
		}
		
		WindowFrame frame = new WindowFrame(healthmanager);
		SelectMenu(input, healthmanager);
		putObject(healthmanager, "healthmanager.ser");
		
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
					logger.log("add an exercise");
					break;
				case 2:
					healthmanager.deleteexercise();
					logger.log("delete an exercise");
					break;
				case 3:
					healthmanager.editexercise();
					logger.log("edit an exercise");
					break;
				case 4:
					healthmanager.viewexercises();
					logger.log("view a list of exercises");
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
	public static HealthManager getObject(String filename) {
		HealthManager healthmanager = null;
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			healthmanager = (HealthManager) in.readObject();
			
			in.close();
			file.close();			
		} catch (FileNotFoundException e) {
			return healthmanager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return healthmanager;
	}
	public static HealthManager putObject(HealthManager healthmanager, String filename) {

		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(healthmanager);
			
			out.close();
			file.close();			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return healthmanager;
	}
}
