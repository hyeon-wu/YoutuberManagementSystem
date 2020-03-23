import java.util.Scanner;

public class MenuManager{
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		int num=5;
		while(num!=6) {
			System.out.println("*** Youtuber Management System Menu ***");
			System.out.println(" 1. Add Youtuber");
			System.out.println(" 2. Delete Youtuber");
			System.out.println(" 3. Edit Youtuber");
			System.out.println(" 4. View Youtuber");
			System.out.println(" 5. Show a menu");
			System.out.println(" 6. Exit");
			System.out.println("Select one number between 1 - 6:");
			num=input.nextInt();
			if(num==1) {
				addYoutuber();
			}
			else if(num==2) {
				deleteYoutuber();
			}
			else if(num==3) {
				editYoutuber();
			}
			else if(num==4) {
				viewYoutuber();
			}
			else {
				continue;
			}
		}
	}
	public static void addYoutuber() {
		Scanner input=new Scanner(System.in);
		System.out.print("Youtuber ID:");
		int youtuberID=input.nextInt();
		System.out.print("Youtuber name:");
		String youtubername=input.next();
		System.out.print("Email address Youtuber name:");
		String youtuberEmail=input.next();
		System.out.print("Phone number:");
		String youtuberphone=input.next();
	}

	public static void deleteYoutuber() {
		Scanner input=new Scanner(System.in);
		System.out.print("Youtuber ID:");
		int youtuberID=input.nextInt();
	}

	public static void editYoutuber() {
		Scanner input=new Scanner(System.in);
		System.out.print("Youtuber ID:");
		int youtuberID=input.nextInt();
	}

	public static void viewYoutuber() {
		Scanner input=new Scanner(System.in);
		System.out.print("Youtuber ID:");
		int youtuberID=input.nextInt();
	}
}
