package manager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Youtuber.GameYoutuber;
import Youtuber.MusicYoutuber;
import Youtuber.TravelYoutuber;
import Youtuber.VlogYoutuber;
import Youtuber.Youtuber;
import Youtuber.YoutuberInput;
import Youtuber.YoutuberKind;

public class YoutuberManager implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 370946218060404709L;

	ArrayList<YoutuberInput> youtubers=new ArrayList<YoutuberInput>();
	transient Scanner input;
	YoutuberManager(Scanner input){
		this.input=input;
	}
	public void setScanner(Scanner input) {
		this.input=input;
	}
	public void addYoutuber() {
		int kind=0;
		YoutuberInput youtuberInput;
		while(kind<1||kind>4) {
			try {
				System.out.println("go into add youtubers in while");
				System.out.println("1 for Vlog");
				System.out.println("2 for Music");
				System.out.println("3 for Game");
				System.out.println("4 for Travel");
				System.out.println("Select num for Youtuber Kind between 1 and 4 : ");
				kind=input.nextInt();
				if(kind==1) {
					youtuberInput=new VlogYoutuber(YoutuberKind.Vlog);
					youtuberInput.getUserInput(input);
					youtubers.add(youtuberInput);
					break;
				}
				else if(kind==2) {
					youtuberInput=new MusicYoutuber(YoutuberKind.Music);
					youtuberInput.getUserInput(input);
					youtubers.add(youtuberInput);
					break;
				}

				else if(kind==3) {
					youtuberInput=new GameYoutuber(YoutuberKind.Game);
					youtuberInput.getUserInput(input);
					youtubers.add(youtuberInput);
					break;
				}

				else if(kind==4) {
					youtuberInput=new TravelYoutuber(YoutuberKind.Travel);
					youtuberInput.getUserInput(input);
					youtubers.add(youtuberInput);
					break;
				}
				else {
					System.out.print("Select num for Youtuber Kind between 1 and 4 : ");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 4!");
				if(input.hasNext()) {
					input.next();
				}
				kind=-1;
			}
		}
	}

	public void deleteYoutuber() {
		System.out.print("Youtuber ID:");
		int youtuberId=input.nextInt();
		int index=findIndex(youtuberId);
		removefromYoutubers(index, youtuberId);
	}

	public int findIndex(int youtuberId) {
		int index=-1;
		for(int i = 0; i<youtubers.size(); i++) {
			if(youtubers.get(i).getId()==youtuberId) {
				index=i;
				break;
			}
		}
		return index;
	}

	public int removefromYoutubers(int index, int youtuberId) {
		if(index>=0) {
			youtubers.remove(index);
			System.out.println("the youtuber "+youtuberId+" is deleted");
			return 1;
		}
		else {
			System.out.println("the youtuber has not been registerd");
			return -1;
		}
	}

	public void editYoutuber() {
		System.out.print("Youtuber ID:");
		int youtuberId=input.nextInt();
		for(int i = 0; i<youtubers.size(); i++) {
			YoutuberInput youtuber=youtubers.get(i);
			if(youtuber.getId()==youtuberId) {
				int num=-1;
				while(num!=5) {
					showEditMenu();
					num=input.nextInt();

					switch(num) {
					case 1:
						youtuber.setYoutuberID(input);
						break;
					case 2:
						youtuber.setYoutuberName(input);
						break;
					case 3:
						youtuber.setYoutuberSub(input);
						break;
					case 4:
						youtuber.setYoutuberLink(input);
						break;
					default:	
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
	
	public int size() {
		return youtubers.size();
	}
	
	public YoutuberInput get(int index) {
		return (Youtuber) youtubers.get(index);
	}
	public void showEditMenu() {
		System.out.println("*** Youtuber Info Edit Menu ***");
		System.out.println(" 1. Edit Id");
		System.out.println(" 2. Edit Name");
		System.out.println(" 3. Edit subscriber num");
		System.out.println(" 4. Edit Link");
		System.out.println(" 5. Exit");
		System.out.println("Select one number between 1 - 6:");
	}
}