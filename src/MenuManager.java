import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager{
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		YoutuberManager youtuberManager=new YoutuberManager(input);

		selectMenu(input, youtuberManager);
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
					break;
				case 2:
					youtuberManager.deleteYoutuber();
					break;
				case 3:
					youtuberManager.editYoutuber();
					break;
				case 4:
					youtuberManager.viewYoutubers();
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
}







