package Youtuber;

import java.util.Scanner;

public class GameYoutuber extends Youtuber {

	public GameYoutuber(YoutuberKind kind) {
		super(kind);
	}

	protected String gamekind ;

	public String getGamekind() {
		return gamekind;
	}

	public void setGamekind(String gamekind) {
		this.gamekind = gamekind;
	}

	public void getUserInput(Scanner input) {

		System.out.print("Youtuber ID:");
		int id=input.nextInt();
		this.setId(id);

		System.out.print("Youtuber name:");
		String name=input.next();
		this.setName(name);

		char answer='x';
		while(answer!='y' && answer!='Y'&&answer!='n' && answer!='N') {
			System.out.print("More than 100,000 subscribers to YouTuber? (Y/N)");
			answer=input.next().charAt(0);
			if(answer=='y' || answer== 'Y') {
				System.out.print("Amazing! Youtuber Subscriber number :");
				int subscribernum=input.nextInt();
				this.setSubscribernum(subscribernum);
				break;
			}
			else if(answer=='n' || answer== 'N') {
				System.out.print("Youtuber Subscriber number :");
				int subscribernum=input.nextInt();
				this.setSubscribernum(subscribernum);
				break;
			}
			else {
			}
		}
		answer='x';
		while(answer!='y' && answer!='Y'&&answer!='n' && answer!='N') {
			System.out.print("Is the game genre fps? (Y/N)");
			answer=input.next().charAt(0);
			if(answer=='y' || answer== 'Y') {
				this.setGamekind("fps");
				break;
			}
			else if(answer=='n' || answer== 'N') {
				System.out.print("What kind of game is it? : ");
				String gamekind =input.next();
				this.setGamekind(gamekind);
				break;
			}
			else {
			}
		}

		System.out.print("Youtuber Link:");
		String link=input.next();
		this.setLink(link);
	}

	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case Vlog:
			skind="Vlog";
			break;
		case Music:
			skind="Music";
			break;
		case Game:
			skind="Game";
			break;
		case Travel:
			skind="Travel";
			break;
		default:
		}
		System.out.println("kind : "+skind+ " name: "+name+" id: "+id+" subscribernum: "+subscribernum+" gamekind: "+gamekind+" link: "+link);
	}
}
