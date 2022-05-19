package ScoreProgram;

public class Controller {	// 기능 => 내부 로직
	
	private Service service = new Service();
	
	public Controller() {
		init();
	}
	
	private void init() {	//실제 main의 역할을 하게 될 메서드
		boolean chk = true;
		do {
			int selectNum = View.menu();	// 메뉴 화면을 보여주는 기능
			
			switch (selectNum) {
			case 0: 	// 더미데이터 자동 입력
				dummy();
				break;
			case 1:		// 성적 입력
				Student student = View.inputScore();
				service.save(student);	// 성적 저장 하기
				break;
			case 2:		// 개인 성적 출력
				String name = View.inputName();						// 조회하고자 하는 이름 입력받기
				Student studentData = Service.selectByName(name);	// 입력받은 이름으로 성적 조회하기
				View.viewScore(studentData);						//조회된 성적을 보여주기
				break;
			case 3:		// 과목 성적 출력
				SubjectName subjectName = View.inputSubject();					// 과목 이름을 입력받기
				double[] subjectScore = service.selectBySubject(subjectName);	// 과목 점수 계산하기
				View.viewSubjectScore(subjectScore);							// 계산된 과목 점수 보여주기
				break;
			case 4:		// 종료
				chk = View.exitProgram();
				break;
			default:	// 예외
				View.error();	// 에러 메세지 출력
			}
			
		} while(chk);
	}

	private void dummy() {
		Main.list[0] = new Student("고길동", 78, 64, 82);
		Main.list[1] = new Student("김길동", 85, 71, 64);
		Main.list[2] = new Student("이길동", 74, 69, 57);
		Main.list[3] = new Student("박길동", 74, 77, 95);
		Main.list[4] = new Student("홍길동", 68, 95, 84);
		System.out.println("더미데이터 입력 완료!");
	}
	
}
