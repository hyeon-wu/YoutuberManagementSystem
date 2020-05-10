package Youtuber;

import java.util.Scanner;

public class VlogYoutuber extends CommonYoutuber{

	public VlogYoutuber(YoutuberKind kind) {
		super(kind);
	}

	protected String vlogkind ;

	public String getVlogkind() {
		return vlogkind;
	}

	public void setVlogkind(String vlogkind) {
		this.vlogkind = vlogkind;
	}

	public void getUserInput(Scanner input) {
		setYoutuberID(input);
		setYoutuberName(input);
		setYoutuberSubwithYN(input);
		setYoutuberVlogKindwithYN(input);
		setYoutuberLink(input);
	}

	public void setYoutuberVlogKindwithYN(Scanner input) {
		char answer='x';
		while(answer!='y' && answer!='Y'&&answer!='n' && answer!='N') {
			System.out.print("Is it a pet V log? (Y/N)");
			answer=input.next().charAt(0);
			if(answer=='y' || answer== 'Y') {
				this.setVlogkind("pet");
				break;
			}
			else if(answer=='n' || answer== 'N') {
				System.out.print("What kind of V-log is it? : ");
				String vlogkind =input.next();
				this.setVlogkind(vlogkind);
				break;
			}
			else {
			}
		}
	}

	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind : "+skind+ " name: "+name+" id: "+id+" subscribernum: "+subscribernum+" vlogkind: "+vlogkind+" link: "+link);
	}
}
