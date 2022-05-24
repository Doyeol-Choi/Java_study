package collegeEx;

public class Controller {
	public Controller() {
		init();
	}
	
	public void init() {
		Service service = new Service();
		
		boolean run = true;
		
		do {
			int mainMenu = View.mainMenu();
			
			switch (mainMenu) {
			case 0:
				dummy();
				System.out.println("더미데이터 입력완료!\n");
				break;
			case 1:		// 회원가입
				int sctJob = View.sctJob();		// 직업선택
				switch (sctJob) {
				case 1:		// 선생님
					Member teacher = View.Teacher();
					service.saveData(teacher);
					break;
				case 2:		// 학생
					Member student = View.Student();
					service.saveData(student);
					break;
				case 3:		// 되돌아가기
					View.back();
					break;
				default:
					View.error();
				}
				break;
			case 2:		// 로그인
				Member chkID = View.chkID();
				int chkPW = View.chkPW(chkID);
				switch (chkPW) {
				case 1:		// 아이디, 비번 맞을 때
					View.act(chkID);
					break;
				case 2:		// 비번 틀릴 때
					View.PWError();
					break;
				case 3:		// 아이디 틀릴 때
					View.IDError();
					break;
				default:
				}
				break;
			case 3:		// 종료
				run = View.exit();
				break;
			default:
				View.error();
			}
		} while (run);
	}

	
	private void dummy() {
		Member teacher = new Teacher("고길동", "teacher123", "1234", "물리");
		Member student = new Student("홍길동", "student123", "1234", "화학");
		Main.list.add(teacher);
		Main.list.add(student);
	}
}
