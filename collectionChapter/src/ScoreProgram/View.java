package ScoreProgram;

import java.util.Scanner;

public class View {	// 프로그램을 사용하는 사용자가 보는 부분 (html)
	static Scanner sc = new Scanner(System.in);
	
	public static int menu() {		// 같은 패키지 내의 View.menu();를 통해 사용가능
		System.out.println("---------------------------------");
		System.out.println("그린 성적 관리 프로그램에 오신것을 환영합니다.");
		System.out.println("메뉴를 선택해 주세요.");
		System.out.println("1. 성적 입력");
		System.out.println("2. 개인별 성적 조회");
		System.out.println("3. 과목별 성적 조회");
		System.out.println("4. 프로그램 종료");
		System.out.println("---------------------------------");
		System.out.print(">");
//		int selectNum = sc.nextInt();	// nextInt()는 권장하지 않음 => nextInt 다음 nextLine이 나오면 생략됨 / 엔터의 입력이 2개이기 때문에
//						sc.nextLine();	// 까지 같이 써주면 오류가 없다.
		int selectNum = Integer.parseInt(sc.nextLine());
		return selectNum;
	}
	
	public static boolean exitProgram() {
		System.out.println("정말 종료하시겠습니까? (y/n) ");
		String answer = sc.nextLine();
		if (answer.equalsIgnoreCase("Y")) {
			return false;
		} else if (answer.equalsIgnoreCase("N")) {
			return true;
		} else {
			System.out.println("잘못 입력하였습니다.");
			return true;
		}
//		System.exit(0);	// 프로그램 강제 종료
		
	}

	public static void error() { 
		System.out.println("잘못 입력했습니다.");
		System.out.println("다시 확인하세요.");
		System.out.println("=================================");
	}

	public static Student inputScore() {	// 성적을 입력받는 부분
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.nextLine();
		System.out.print("국어점수를 입력해주세요 : ");
		int kor = Integer.parseInt(sc.nextLine());
		System.out.print("영어점수를 입력해주세요 : ");
		int eng = Integer.parseInt(sc.nextLine());
		System.out.print("수학점수를 입력해주세요 : ");
		int math = Integer.parseInt(sc.nextLine());
		Student student = new Student(name, kor, eng, math);
		return student;
	}

	public static String inputName() {	// 조회할 학생 이름 입력받는 부분
		// 이름
		System.out.print("조회하고자 하는 학생 이름을 입력하세요 : ");
		String name = sc.nextLine();
		return name;
	}

	public static void viewScore(Student student) { 
		if (student != null) {
			System.out.println("==========================================");
			System.out.println("학생 이름 : " + student.getName());
			System.out.println("국어 점수 : " + student.getKorScore());
			System.out.println("영어 점수 : " + student.getEngScore());
			System.out.println("수학 점수 : " + student.getMathScore());
			System.out.println("합계 점수 : " + student.getTotalScore());
			System.out.printf("평균 점수 : %.1f\n", student.getAvgScore());
			System.out.println("==========================================");
		} else {
			System.out.println("==========================================");
			System.out.println("그런 사람 없습니다.");
			System.out.println("==========================================");
		}
	}

	public static SubjectName inputSubject() {	// 조회할 과목 이름
		System.out.print("조회할 과목을 입력해주세요 : ");
		String subjectName = sc.nextLine();
		if(subjectName.equals("국어")) {
			return SubjectName.KOR;
		} else if (subjectName.equals("영어")) {
			return SubjectName.ENG;
		} else if (subjectName.equals("수학")) {
			return SubjectName.MATH;
		} else {
			return null;			
		}
	}

	public static void viewSubjectScore(double[] subjectScore) {
		
		if (subjectScore == null) {
			System.out.println("과목 정보가 잘못되었습니다.");
			System.out.println("다시 확인해 주세요.");
		} else {
			System.out.println("해당 과목의 총점 : " + subjectScore[0]);
			System.out.printf("해당 과목의 평균 : %.1f\n", subjectScore[1]);
		}
	}


	
	
}
