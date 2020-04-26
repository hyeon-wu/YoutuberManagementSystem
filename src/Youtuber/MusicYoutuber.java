package Youtuber;

import java.util.Scanner;

public class MusicYoutuber extends Youtuber {
	
	String genre;
	
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public MusicYoutuber(YoutuberKind kind) {
		super(kind);
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
			System.out.print("More than 100,000 subscribers to YouTuber? (Y/N):");
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
			System.out.print("Is music a pop genre? : ");
			answer=input.next().charAt(0);
			if(answer=='y' || answer== 'Y') {
				this.setGenre("pop");
				break;
			}
			else if(answer=='n' || answer== 'N') {
				System.out.print("What's the music genre? : ");
				String genre=input.next();
				this.setGenre(genre);
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
		System.out.println("kind : "+skind+" name: "+name+" id: "+id+" subscriber num: "+subscribernum+" Genre : "+genre+" link: "+link);
	}

}
