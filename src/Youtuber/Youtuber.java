package Youtuber;

import java.util.Scanner;

public abstract class  Youtuber implements YoutuberInput {
	protected YoutuberKind kind=YoutuberKind.Music;
	protected String name;
	protected int id;
	protected int subscribernum;
	protected String link;

	public Youtuber() {
	}
	
	public Youtuber(YoutuberKind kind) {
		this.kind=kind;
	}
	
	public Youtuber(String name, int id, int subscribernum, String link) {
		this.name=name;
		this.id=id;
		this.subscribernum=subscribernum; 
		this.link=link;
	}
	
	public Youtuber(YoutuberKind kind, String name, int id, int subscribernum, String link) {
		this.kind=kind;
		this.name=name;
		this.id=id;
		this.subscribernum=subscribernum; 
		this.link=link;
	}

	public YoutuberKind getKind() {
		return kind;
	}

	public void setKind(YoutuberKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSubscribernum() {
		return subscribernum;
	}

	public void setSubscribernum(int subscribernum) {
		this.subscribernum = subscribernum;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
	
	public abstract void printInfo();
	
	public void setYoutuberID(Scanner input) {
		System.out.print("Youtuber ID:");
		int id=input.nextInt();
		this.setId(id);
	}

	public void setYoutuberName(Scanner input) {
		System.out.print("Youtuber name:");
		String name=input.next();	
		this.setName(name);
	}

	public void setYoutuberSub(Scanner input) {
		System.out.print("Amazing! Youtuber Subscriber number:");
		int subscribernum=input.nextInt();	
		this.setSubscribernum(subscribernum);
	}

	public void setYoutuberLink(Scanner input) {
		System.out.print("Youtuber Link:");
		String link=input.next();
		this.setLink(link);
	}
	
	public String getKindString(){
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
		return skind;
	}
}
