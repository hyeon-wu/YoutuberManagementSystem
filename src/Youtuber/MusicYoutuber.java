package Youtuber;

import java.util.Scanner;

public class MusicYoutuber extends Youtuber {
	public void getUserInput(Scanner input) {

		System.out.print("Youtuber ID:");
		int id=input.nextInt();
		this.setId(id);

		System.out.print("Youtuber name:");
		String name=input.next();
		this.setName(name);

		char answer='x';
		while(answer!='y' && answer!='Y'&&answer!='n' && answer!='N') {
			System.out.print("Do you have subscriber? (Y/N)");
			answer=input.next().charAt(0);
			if(answer=='y' || answer== 'Y') {
				System.out.print("Youtuber Subscriber number :");
				int subscribernum=input.nextInt();
				this.setSubscribernum(subscribernum);
				break;
			}
			else if(answer=='n' || answer== 'N') {
				this.setSubscribernum(0);
				break;
			}
			else {
			}
		}

		System.out.print("Youtuber Link:");
		String link=input.next();
		this.setLink(link);
	}

}
