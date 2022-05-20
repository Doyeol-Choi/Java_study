package AccountEx;

import java.util.Scanner;

public class View {

	static Scanner sc = new Scanner(System.in);
	
	public static int mainMenu() {
		System.out.println("==============================");
		System.out.println("1. 계좌 생성");
		System.out.println("2. 업무 보기");
		System.out.println("3. 종료");
		System.out.println("==============================");
		System.out.print(">");
		int ans = Integer.parseInt(sc.nextLine());
		return ans;
	}

	public static Client createAccount() {
		System.out.println("========계좌생성========");
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.nextLine();
		System.out.print("계좌번호를 입력해주세요 : ");
		String accountNum = sc.nextLine();
		System.out.print("초기 예금액을 입력해주세요 : ");
		int moneyF = Integer.parseInt(sc.nextLine());
		Client client = new Client(name, accountNum, moneyF);
		System.out.println("계좌가 생성되었습니다.\n");
		return client;
	}

	public static void back() {
		System.out.println("메인 메뉴로 돌아갑니다.\n");
	}

	public static void accountError() {
		System.out.println("해당 계좌가 존재하지 않습니다. 메인메뉴로 돌아갑니다.\n");
	}
	
	public static void subMenuError() {
		System.out.println("잘못된 번호를 입력하여 메인메뉴로 돌아갑니다.\n");
	}
	public static boolean exit() {
		System.out.print("정말 종료하시겠습니까? (y/n) : ");
		String exit = sc.nextLine();
		if (exit.equalsIgnoreCase("y")) {
			System.out.println("프로그램을 종료합니다.");
			return false;
		} else if (exit.equalsIgnoreCase("n")) {
			return true;
		} else {
			System.out.println("잘못된 입력으로 메인메뉴로 돌아갑니다.\n");
			return true;
		}
	}

	public static void error() {
		System.out.println("잘못된 번호를 입력하셨습니다. 메인메뉴로 돌아갑니다.\n");
	}


	public static String accountNum() {
		System.out.print("계좌번호를 입력해주세요 : ");
		String an = sc.nextLine();
		return an;
	}

	public static int subMenu(Client account) {
		if (account != null) {
			System.out.println("==============================");
			System.out.println("1. 계좌 조회");
			System.out.println("2. 입금");
			System.out.println("3. 출금");
			System.out.println("4. 돌아가기");
			System.out.println("==============================");
			System.out.print(">");
			int ans = Integer.parseInt(sc.nextLine());
			return ans;
		} else {
			return 5;			
		}
	}

	public static void check(Client account) {
		System.out.println("\n예금주 : " + account.getClient());
		System.out.println("계좌번호 : " + account.getAccount());
		System.out.println("잔액 : " + account.getBalance() + "원\n");
	}

	public static void deposit(Client account) {
		System.out.print("\n입금하실 금액을 입력해주세요 : ");
		int money = Integer.parseInt(sc.nextLine());
		account.setBalance((account.getBalance() + money));
		System.out.println(money + "원이 입금되었습니다.");
		System.out.println("현재 잔액은 " + account.getBalance() + "원입니다.\n");
	}

	public static void withdraw(Client account) {
		System.out.println("\n출금하실 금액을 입력해주세요 : ");
		int money = Integer.parseInt(sc.nextLine());
		if (account.getBalance() >= money) {
			account.setBalance((account.getBalance() - money));
			System.out.println(money + "원이 출금되었습니다.");
			System.out.println("현재 잔액은 " + account.getBalance() + "원입니다.\n");
		} else {
			System.out.println("잔액이 부족합니다.");
			System.out.println("현재 잔액은 " + account.getBalance() + "원입니다.\n");
		}
	}
	
	

	
	
	
	
	

}
