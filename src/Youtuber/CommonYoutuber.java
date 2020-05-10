package Youtuber;

import java.util.Scanner;

public abstract class CommonYoutuber extends Youtuber {

	public CommonYoutuber(YoutuberKind kind) {
		super(kind);
	}
	@Override
	public abstract void getUserInput(Scanner input);

	public void setYoutuberSubwithYN(Scanner input) {
		char answer='x';
		while(answer!='y' && answer!='Y'&&answer!='n' && answer!='N') {
			System.out.print("More than 100,000 subscribers to YouTuber? (Y/N)");
			answer=input.next().charAt(0);
			if(answer=='y' || answer== 'Y') {
				setYoutuberSub(input);
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
	}
}
