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
			System.out.println("the youtuber to be edited is"+youtuberId);
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
