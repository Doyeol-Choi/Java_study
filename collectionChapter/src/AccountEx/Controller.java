package AccountEx;

public class Controller {
	public Controller() {
		init();
	}
	
	public void init() {
		Service service = new Service();
		boolean run = true;
		do {
			int selectMenu = View.mainMenu();	// 메인메뉴 선택
			switch (selectMenu) {
			case 1:
				Client client = View.createAccount();	// 계좌 개설
				service.saveData(client);				// 계좌 저장
				break;
			case 2:
				String accountNum = View.accountNum();				// 계좌 확인
				Client account = service.chkAccount(accountNum);	// 데이터 조회
				int subMenu = View.subMenu(account);				// 메뉴선택
				switch (subMenu) {
				case 0:
					dummy();
					System.out.println("더미데이터 입력완료!");
					break;
				case 1:
					View.check(account);	//계좌 조회
					break;
				case 2:
					View.deposit(account);	//입금
					break;
				case 3:
					View.withdraw(account);	//출금
					break;
				case 4:
					View.back();	// 돌아가기
					break;
				case 5:
					View.accountError();
				default:
					View.subMenuError();
				}
				break;
			case 3:
				run = View.exit();
				break;
			default:
				View.error();
			}
		} while(run);
	}
	
	private void dummy() {
		Main.list[0] = new Client("고길동", "123456", 200000);
		Main.list[1] = new Client("둘리", "qwerty", 10000);
		Main.list[2] = new Client("홍길동", "asdfgh", 100000);
		Main.list[3] = new Client("마이콜", "zxcvbn", 50000);
	}
}
