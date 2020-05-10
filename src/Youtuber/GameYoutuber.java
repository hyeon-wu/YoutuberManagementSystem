package Youtuber;

import java.util.Scanner;

public class GameYoutuber extends CommonYoutuber{

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
		setYoutuberID(input);
		setYoutuberName(input);
		setYoutuberSubwithYN(input);
		setYoutuberGamekindwithYN(input);
		setYoutuberLink(input);
	}
	
	public void setYoutuberGamekindwithYN(Scanner input) {
		char answer='x';
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
	}

	public void printInfo() {
		String skind=getKindString();
		System.out.println("kind : "+skind+ " name: "+name+" id: "+id+" subscribernum: "+subscribernum+" gamekind: "+gamekind+" link: "+link);
	}
}
