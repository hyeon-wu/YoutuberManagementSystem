package Youtuber;

import java.util.Scanner;

public interface YoutuberInput {
	
	public int getId();
	
	public void setId(int id);

	public void setName(String name);
	
	public void setSubscribernum(int subscribernum);
	
	public void setLink(String link);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setYoutuberID(Scanner input);
	
	public void setYoutuberName(Scanner input);
	
	public void setYoutuberSub(Scanner input);
	
	public void setYoutuberLink(Scanner input);
	
	

}
