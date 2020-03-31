import java.util.Scanner;

public class YoutuberManager {
	Youtuber youtuber;
	Scanner input;
	YoutuberManager(Scanner input){
		this.input=input;
	}

	public void addYoutuber() {
		youtuber=new Youtuber();
		System.out.print("Youtuber ID:");
		youtuber.id=input.nextInt();
		System.out.print("Youtuber name:");
		youtuber.name=input.next();
		System.out.print("Kind of Youtuber:");
		youtuber.kind=input.next();
		System.out.print("Youtuber Link:");
		youtuber.link=input.next();
	}
	public void deleteYoutuber() {
		System.out.print("Youtuber ID:");
		int youtuberId=input.nextInt();
		if(youtuber==null) {
			System.out.println("the youtuber has not been registerd");
			return;
		}
		if(youtuber.id==youtuberId) {
			youtuber=null;
			System.out.println("the youtuber is deleted");
		}
	}
	public void editYoutuber() {
		System.out.print("Youtuber ID:");
		int youtuberId=input.nextInt();
		if(youtuber.id==youtuberId) {
			int num=-1;
			while(num!=5) {
				System.out.println("*** Youtuber Info Edit Menu ***");
				System.out.println(" 1. Edit Id");
				System.out.println(" 2. Edit Name");
				System.out.println(" 3. Edit Kind");
				System.out.println(" 4. Edit Link");
				System.out.println(" 5. Exit");
				System.out.println("Select one number between 1 - 6:");
				num=input.nextInt();
				if(num==1) {
					System.out.print("Youtuber ID:");
					youtuber.id=input.nextInt();
				}
				else if(num==2) {
					System.out.print("Youtuber name:");
					youtuber.name=input.next();			
				}
				else if(num==3) {
					System.out.print("Kind of Youtuber:");
					youtuber.kind=input.next();			
				}
				else if(num==4) {
					System.out.print("Youtuber Link:");
					youtuber.link=input.next();
				}
				else {
					continue;
				}
			}
		}
	}

	public void viewYoutuber() {
		System.out.print("Youtuber ID:");
		int youtuberId=input.nextInt();
		if(youtuber.id==youtuberId) {
			youtuber.printInfo();
		}
	}
}
