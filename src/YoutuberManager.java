import java.util.ArrayList;
import java.util.Scanner;

import Youtuber.GameYoutuber;
import Youtuber.MusicYoutuber;
import Youtuber.TravelYoutuber;
import Youtuber.VlogYoutuber;
import Youtuber.Youtuber;
import Youtuber.YoutuberKind;

public class YoutuberManager {
	ArrayList<Youtuber> youtubers=new ArrayList<Youtuber>();
	Scanner input;
	YoutuberManager(Scanner input){
		this.input=input;
	}

	public void addYoutuber() {
		int kind=0;
		Youtuber youtuber;
		while(kind!=1&&kind!=2&&kind!=3&&kind!=4) {
			System.out.println("1 for Vlog");
			System.out.println("2 for Music");
			System.out.println("3 for Game");
			System.out.println("4 for Travel");
			System.out.println("Select num for Youtuber Kind between 1 and 2 : ");
			kind=input.nextInt();
			if(kind==1) {
				youtuber=new VlogYoutuber(YoutuberKind.Vlog);
				youtuber.getUserInput(input);
				youtubers.add(youtuber);
				break;
			}
			else if(kind==2) {
				youtuber=new MusicYoutuber(YoutuberKind.Music);
				youtuber.getUserInput(input);
				youtubers.add(youtuber);
				break;
			}
			
			else if(kind==3) {
				youtuber=new GameYoutuber(YoutuberKind.Game);
				youtuber.getUserInput(input);
				youtubers.add(youtuber);
				break;
			}
			
			else if(kind==4) {
				youtuber=new TravelYoutuber(YoutuberKind.Travel);
				youtuber.getUserInput(input);
				youtubers.add(youtuber);
				break;
			}
			else {
				System.out.print("Select num for Youtuber Kind between 1 and 4 : ");
			}
		}
	}

	public void deleteYoutuber() {
		System.out.print("Youtuber ID:");
		int youtuberId=input.nextInt();
		int index=-1;
		for(int i = 0; i<youtubers.size(); i++) {
			if(youtubers.get(i).getId()==youtuberId) {
				index=i;
				break;
			}
		}
		if(index>=0) {
			youtubers.remove(index);
			System.out.println("the youtuber "+youtuberId+" is deleted");
		}
		else {
			System.out.println("the youtuber has not been registerd");
			return;
		}
	}

	public void editYoutuber() {
		System.out.print("Youtuber ID:");
		int youtuberId=input.nextInt();
		for(int i = 0; i<youtubers.size(); i++) {
			Youtuber youtuber=youtubers.get(i);
			if(youtuber.getId()==youtuberId) {
				int num=-1;
				while(num!=5) {
					System.out.println("*** Youtuber Info Edit Menu ***");
					System.out.println(" 1. Edit Id");
					System.out.println(" 2. Edit Name");
					System.out.println(" 3. Edit subscriber num");
					System.out.println(" 4. Edit Link");
					System.out.println(" 5. Exit");
					System.out.println("Select one number between 1 - 6:");
					num=input.nextInt();
					if(num==1) {
						System.out.print("Youtuber ID:");
						int id=input.nextInt();
						youtuber.setId(id);
					}
					else if(num==2) {
						System.out.print("Youtuber name:");
						String name=input.next();	
						youtuber.setName(name);
					}
					else if(num==3) {
						System.out.print("Youtuber Subscriber number:");
						int subscribernum=input.nextInt();	
						youtuber.setSubscribernum(subscribernum);
					}
					else if(num==4) {
						System.out.print("Youtuber Link:");
						String link=input.next();
						youtuber.setLink(link);
					}
					else {
						continue;
					}
				}
				break;
			}
		}
	}

	public void viewYoutubers() {
		System.out.println("# of registered youtubers:"+youtubers.size());
		for(int i = 0; i<youtubers.size(); i++) {
			youtubers.get(i).printInfo();
		}
	}
}

