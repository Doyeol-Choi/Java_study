package collegeEx;

import java.util.Scanner;

public class View {
	static Scanner sc = new Scanner(System.in);

	public static void error() {
		System.out.println("잘못된 입력입니다. 메인메뉴로 돌아갑니다.\n");
	}

	public static void back() {
		System.out.println("메인메뉴로 돌아갑니다.\n");
	}

	public static boolean exit() {
		System.out.print("프로그램을 종료하시겠습니까? (y/n) > ");
		String exit = sc.nextLine();
		if (exit.equalsIgnoreCase("y")) {
			System.out.println("프로그램을 종료합니다.");
			return false;
		} else if (exit.equalsIgnoreCase("n")) {
			System.out.println("메인메뉴로 돌아갑니다.\n");
			return true;
		} else {
			System.out.println("잘못된 입력으로 메인메뉴로 돌아갑니다.\n");
			return true;
		}
	}

	public static int mainMenu() {
		System.out.println("========================================");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 프로그램 종료");
		System.out.println("========================================");
		System.out.print("> ");
		int num = Integer.parseInt(sc.nextLine());
		return num;
	}

	public static int sctJob() {
		System.out.println("========회원가입========");
		System.out.println("1. 선생님");
		System.out.println("2. 학생");
		System.out.println("3. 돌아가기");
		System.out.println("======================");
		System.out.print("직업을 선택해주세요 > ");
		int ans = Integer.parseInt(sc.nextLine());
		return ans;
	}

	public static Member Teacher() {
		System.out.print("이름을 입력해주세요 :");
		String name = sc.nextLine();
		System.out.print("아이디를 입력해주세요 : ");
		String ID = sc.nextLine();
		System.out.print("비밀번호를 입력해주세요 : ");
		String PW = sc.nextLine();
		System.out.print("담당 과목을 입력해주세요 : ");
		String subject = sc.nextLine();
		for (int i=0; i<Main.list.size(); i++) {
			if (ID.equals(Main.list.get(i).getID())) {
				return null;
			}
		}
		Member teacher = new Teacher(name, ID, PW, subject);
		return teacher;
	}

	public static Member Student() {
		System.out.print("이름을 입력해주세요 :");
		String name = sc.nextLine();
		System.out.print("아이디를 입력해주세요 : ");
		String ID = sc.nextLine();
		System.out.print("비밀번호를 입력해주세요 : ");
		String PW = sc.nextLine();
		System.out.print("전공을 입력해주세요 : ");
		String subject = sc.nextLine();
		for (int i=0; i<Main.list.size(); i++) {
			if (ID.equals(Main.list.get(i).getID())) {
				return null;
			}
		}
		Member student = new Student(name, ID, PW, subject);
		return student;
	}

	public static Member chkID() {
		System.out.println("아이디를 입력해주세요 : ");
		String ID = sc.nextLine();
		for (int i=0; i<Main.list.size(); i++) {
			if (ID.equals(Main.list.get(i).getID())) {
				return Main.list.get(i);
			}
		}
		return null;
	}

	public static int chkPW(Member chkID) {
		System.out.println("비밀번호를 입력해주세요 : ");
		String PW = sc.nextLine();
		if (chkID != null) {
			if (PW.equals(chkID.getPW())) {
				return 1;
			} else {
				return 2;
			}
		} else {			
			return 3;
		}
	}

	public static void PWError() {
		System.out.println("비밀번호가 틀렸습니다. 메인메뉴로 돌아갑니다.\n");
	}

	public static void IDError() {
		System.out.println("아이디가 틀렸습니다. 메인메뉴로 돌아갑니다.\n");
	}

	public static void act(Member chkID) {
		System.out.println();
		chkID.work();
		System.out.println();
		chkID.test();
		System.out.println();
	}

	

}
