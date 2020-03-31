
public class Youtuber {

	String name;
	int id;
	String kind;
	String link;
	
	public Youtuber() {
	}
	
	public Youtuber(String name, int id) {
		this.name=name;
		this.id=id;
	}
	public Youtuber(String name, int id, String kind, String link) {
		this.name=name;
		this.id=id;
		this.kind=kind;
		this.link=link;
	}
	
	public void printInfo() {
		System.out.println("name:"+name+"id:"+id+"kind:"+kind+"link:"+link);
	}
}
