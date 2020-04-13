import java.util.Scanner;

public class MenuManager{
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		YoutuberManager youtuberManager=new YoutuberManager(input);

		int num=-1;
		while(num!=5) {
			System.out.println("*** Youtuber Management System Menu ***");
			System.out.println(" 1. Add Youtuber");
			System.out.println(" 2. Delete Youtuber");
			System.out.println(" 3. Edit Youtuber");
			System.out.println(" 4. View Youtubers");
			System.out.println(" 5. Exit");
			System.out.println("Select one number between 1 - 6:");
			num=input.nextInt();
			if(num==1) {
				youtuberManager.addYoutuber();
			}
			else if(num==2) {
				youtuberManager.deleteYoutuber();
			}
			else if(num==3) {
				youtuberManager.editYoutuber();
			}
			else if(num==4) {
				youtuberManager.viewYoutubers();
			}
			else {
				continue;
			}
		}
	}
}







