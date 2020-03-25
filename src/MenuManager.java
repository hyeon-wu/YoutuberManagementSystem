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
		System.out.print("Delete "+youtubername+"?\n"+"Y or N �Է�: ");
		String answer=input.next();
		switch(answer) {
		case("Y"):
			System.out.println(youtubername+"��Ʃ���� �����Ǿ����ϴ�!");
		case("N"):
			break;
		}
	}
	public static void editYoutuber() {
		Scanner input=new Scanner(System.in);
		System.out.print("Youtuber name:");
		String youtubername=input.next();
		System.out.print("�����ϰ��� �ϴ� ��Ʃ���� "+youtubername+"�� �½��ϱ�?\nY or N �Է�: ");
		String answer=input.next();
		switch(answer){
		case("Y"):
			System.out.println(youtubername+" ��Ʃ���� �����մϴ�.\n* ������ �׸��� �������ֽʽÿ�.");
		System.out.print("1. Youtuber name\n2. Kind of Youtuber\n3. Youtuber Link\n*��ȣ�� �Է����ֽʽÿ�: ");
		int answer1=input.nextInt();
		if(answer1==1) {
			System.out.print("1. Youtuber name�׸��� �����մϴ�\n* Youtuber name: ");
			String editname=input.next();
			System.out.println(editname+"(��)�� ����Ǿ����ϴ�.");
		}
		else if(answer1==2) {
			System.out.print("2. Kind of Youtuber�׸��� �����մϴ�\n* Kind of Youtuber: ");
			String editkind=input.next();
			System.out.println(editkind+"(��)�� ����Ǿ����ϴ�.");
		}
		else if(answer1==3){
			System.out.print("3. Youtuber Link �׸��� �����մϴ�\n* Youtuber Link: ");
			String editlink=input.next();
			System.out.println(editlink+"(��)�� ����Ǿ����ϴ�.");
		}
		else {
			System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
		}
		case("N"):
			break;
		}
	}
	public static void viewYoutuber() {
		Scanner input=new Scanner(System.in);
		System.out.print("Youtuber name:");
		String youtubername=input.next();
		System.out.print("������ �ϴ� ��Ʃ���� "+youtubername+"�� �½��ϱ�?\nY or N �Է�: ");
		String answer=input.next();
		switch(answer){
		case("Y"):
			System.out.println(youtubername+" ��Ʃ���� ��ũ�Դϴ�.");
		System.out.println("https://www.youtube.com/channel/UC99OELa9yvqgkq9ffBvm9iQ");
		case("N"):
			break;
		}
	}
}






