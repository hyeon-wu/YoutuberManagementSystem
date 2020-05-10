package Youtuber;

import java.util.Scanner;

public class MusicYoutuber extends CommonYoutuber{
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
		setYoutuberID(input);
		setYoutuberName(input);
		setYoutuberSubwithYN(input);
		setYoutuberGenrewithYN(input);
		setYoutuberLink(input) ;
	}

	public void setYoutuberGenrewithYN(Scanner input){
		char answer='x';
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
	}

	public void printInfo() {
		String skind=getKindString();
		System.out.println("kind : "+skind+" name: "+name+" id: "+id+" subscriber num: "+subscribernum+" Genre : "+genre+" link: "+link);
	}
}
