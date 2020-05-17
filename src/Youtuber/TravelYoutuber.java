package Youtuber;

import java.util.Scanner;

public class TravelYoutuber extends CommonYoutuber{

	public TravelYoutuber(YoutuberKind kind) {
		super(kind);
	}

	protected String traveltype ;

	public String getTraveltype() {
		return traveltype;
	}
	public void setTraveltype(String traveltype) {
		this.traveltype = traveltype;
	}

	public void getUserInput(Scanner input) {
		setYoutuberID(input);
		setYoutuberName(input);
		setYoutuberSubwithYN(input);
		setYoutuberTravelTypewithYN(input);
		setYoutuberLink(input);
	}

	public void setYoutuberTravelTypewithYN(Scanner input) {
		char answer='x';
		while(answer!='y' && answer!='Y'&&answer!='n' && answer!='N') {
			System.out.print("Is it an activity travel YouTuber? (Y/N)");
			answer=input.next().charAt(0);
			if(answer=='y' || answer== 'Y') {
				this.setTraveltype("activity");
				break;
			}
			else if(answer=='n' || answer== 'N') {
				System.out.print("What kind of travel is it? : ");
				String traveltype =input.next();
				this.setTraveltype(traveltype);
				break;
			}
			else {
			}
		}
	}

	public void printInfo() {
		String skind=getKindString();
		System.out.println("kind : "+skind+ " name: "+name+" id: "+id+" subscribernum: "+subscribernum+" traveltype: "+traveltype+" link: "+link);
	}
}

