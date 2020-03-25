import java.util.Scanner;

public class MenuManager{
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		int num=5;
		while(num!=6) {
			System.out.println("*** Youtuber Management System Menu ***");
			System.out.println(" 1. Add Youtuber");
			System.out.println(" 2. Delete Youtuber");
			System.out.println(" 3. Edit Youtuber");
			System.out.println(" 4. View Youtuber");
			System.out.println(" 5. Show a menu");
			System.out.println(" 6. Exit");
			System.out.println("Select one number between 1 - 6:");
			num=input.nextInt();
			if(num==1) {
				addYoutuber();
			}
			else if(num==2) {
				deleteYoutuber();
			}
			else if(num==3) {
				editYoutuber();
			}
			else if(num==4) {
				viewYoutuber();
			}
			else {
				continue;
			}
		}
	}
	public static void addYoutuber() {
		Scanner input=new Scanner(System.in);
		System.out.print("Youtuber ID:");
		int youtuberID=input.nextInt();
		System.out.print("Youtuber name:");
		String youtubername=input.next();
		System.out.print("Kind of Youtuber:");
		String youtuberEmail=input.next();
		System.out.print("Youtuber Link:");
		String youtuberphone=input.next();
	}

	public static void deleteYoutuber() {
		Scanner input=new Scanner(System.in);
		System.out.print("Youtuber name:");
		String youtubername=input.next();
		System.out.print("Delete "+youtubername+"?\n"+"Y or N 입력: ");
		String answer=input.next();
		switch(answer) {
		case("Y"):
			System.out.println(youtubername+"유튜버가 삭제되었습니다!");
		case("N"):
			break;
		}
	}
	public static void editYoutuber() {
		Scanner input=new Scanner(System.in);
		System.out.print("Youtuber name:");
		String youtubername=input.next();
		System.out.print("편집하고자 하는 유튜버가 "+youtubername+"이 맞습니까?\nY or N 입력: ");
		String answer=input.next();
		switch(answer){
		case("Y"):
			System.out.println(youtubername+" 유튜버를 편집합니다.\n* 편집할 항목을 선택해주십시오.");
		System.out.print("1. Youtuber name\n2. Kind of Youtuber\n3. Youtuber Link\n*번호를 입력해주십시오: ");
		int answer1=input.nextInt();
		if(answer1==1) {
			System.out.print("1. Youtuber name항목을 편집합니다\n* Youtuber name: ");
			String editname=input.next();
			System.out.println(editname+"(으)로 변경되었습니다.");
		}
		else if(answer1==2) {
			System.out.print("2. Kind of Youtuber항목을 편집합니다\n* Kind of Youtuber: ");
			String editkind=input.next();
			System.out.println(editkind+"(으)로 변경되었습니다.");
		}
		else if(answer1==3){
			System.out.print("3. Youtuber Link 항목을 편집합니다\n* Youtuber Link: ");
			String editlink=input.next();
			System.out.println(editlink+"(으)로 변경되었습니다.");
		}
		else {
			System.out.println("번호를 잘못 입력하셨습니다.");
		}
		case("N"):
			break;
		}
	}
	public static void viewYoutuber() {
		Scanner input=new Scanner(System.in);
		System.out.print("Youtuber name:");
		String youtubername=input.next();
		System.out.print("보고자 하는 유튜버가 "+youtubername+"이 맞습니까?\nY or N 입력: ");
		String answer=input.next();
		switch(answer){
		case("Y"):
			System.out.println(youtubername+" 유튜버의 링크입니다.");
		System.out.println("https://www.youtube.com/channel/UC99OELa9yvqgkq9ffBvm9iQ");
		case("N"):
			break;
		}
	}
}






