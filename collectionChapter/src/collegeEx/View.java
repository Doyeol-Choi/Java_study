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
		System.out.println("프로그램을 종료하시겠습니까? (y/n)");
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

}
