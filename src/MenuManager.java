import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

import log.EventLogger;

public class MenuManager{
	static EventLogger logger=new EventLogger("log.txt");

	public static void main(String[]args) {

		Scanner input=new Scanner(System.in);
		YoutuberManager youtuberManager=getObject("youtubermanager.ser");			
		if(youtuberManager==null) {
			youtuberManager=new YoutuberManager(input);
		}
		else {
			youtuberManager.setScanner(input);
		}
		selectMenu(input, youtuberManager);
		putObject(youtuberManager, "youtubermanager.ser");
	}
	public static void selectMenu(Scanner input, YoutuberManager youtuberManager) {
		int num=-1;
		while(num!=5) {
			try {
				showMenu();
				num=input.nextInt();

				switch(num) {
				case 1:
					youtuberManager.addYoutuber();
					logger.log("add a Youtuber");
					break;
				case 2:
					youtuberManager.deleteYoutuber();
					logger.log("delete a Youtuber");
					break;
				case 3:
					youtuberManager.editYoutuber();
					logger.log("edit a Youtuber");
					break;
				case 4:
					youtuberManager.viewYoutubers();
					logger.log("view a list of Youtuber");
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num=-1;
			}
		}
	}

	public static void showMenu() {
		System.out.println("*** Youtuber Management System Menu ***");
		System.out.println(" 1. Add Youtuber");
		System.out.println(" 2. Delete Youtuber");
		System.out.println(" 3. Edit Youtuber");
		System.out.println(" 4. View Youtubers");
		System.out.println(" 5. Exit");
		System.out.println("Select one number between 1 - 5:");
	}
	public static YoutuberManager getObject(String filename) {
		YoutuberManager youtuberManager=null;

		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in=new ObjectInputStream(file);
			youtuberManager=(YoutuberManager)in.readObject();
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return youtuberManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return youtuberManager;
	}

	public static void putObject(YoutuberManager youtuberManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out=new ObjectOutputStream(file);
			out.writeObject(youtuberManager);
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}