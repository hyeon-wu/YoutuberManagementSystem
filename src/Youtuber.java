
public class Youtuber {

	String name;
	int id;
	String kind;
	String link;
	static int numYoutubersRegistered = 0;

	public Youtuber() {
		numYoutubersRegistered++;
	}

	public Youtuber(String name, int id, String kind, String link) {
		this.name=name;
		this.id=id;
		this.kind=kind; 
		this.link=link;
		numYoutubersRegistered++;
	}

	public void printInfo() {
		System.out.println("name:"+name+"id:"+id+"kind:"+kind+"link:"+link);
	}
}
