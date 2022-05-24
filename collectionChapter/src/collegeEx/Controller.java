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
			case 1:		// 회원가입
				int sctJob = View.sctJob();		// 직업선택
				switch (sctJob) {
				case 1:		// 선생님
					Teacher teacher = View.Teacher();
					service.saveData(teacher);
					break;
				case 2:		// 학생
					Student student = View.Student();
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
				Object chkID = View.chkID();
				String chkPW = View.chkPW(chkID);
				View.act(chkID, chkPW);
				break;
			case 3:		// 종료
				run = View.exit();
				break;
			default:
				View.error();
			}
		} while (run);
	}
}
