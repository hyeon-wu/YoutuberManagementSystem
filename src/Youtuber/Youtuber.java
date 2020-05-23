package Youtuber;

import java.io.Serializable;
import java.util.Scanner;

import exceptions.LinkFormatException;

public abstract class  Youtuber implements YoutuberInput, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -386430640353888159L;
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

	public void setLink(String link) throws LinkFormatException{
		if(!link.contains("www.youtube.com")&&!link.equals("")) {
			throw new LinkFormatException();
		}
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
		String link="";
		while(!link.contains("www.youtube.com")){
			System.out.print("Youtuber Link:");
			link=input.next();
			try {
				this.setLink(link);
			} catch (LinkFormatException e) {
				System.out.println("Incorrect Link Format. put the link that contains www.youtube.com");
			}
		}
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
