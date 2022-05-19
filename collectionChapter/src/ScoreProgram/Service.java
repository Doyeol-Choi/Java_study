package ScoreProgram;

public class Service {	// 실제 데이터 저장소(Main.list)와 연결을 담당하는 부분

	public void save(Student student) { 
		for(int i=0; i<Main.list.length; i++) {
			if(Main.list[i]==null) {
				Main.list[i] = student;
				return;		// 반환 값이 없는데 return이 나오면 메서드 종료
			}
		}
	}

	public static Student selectByName(String name) {
		Student student = null;
		
		for(int i=0; i<Main.list.length; i++) {
			if (Main.list[i] != null) {
				if (Main.list[i].getName().equals(name)) {
					student = Main.list[i];
					break;
				}
			}
		}
			
		return student;
	}

	public double[] selectBySubject(SubjectName subjectName) {
		if (subjectName == SubjectName.KOR) {
			return korScore();
		} else if (subjectName == SubjectName.ENG) {
			return engScore();
		} else if (subjectName == SubjectName.MATH) {
			return mathScore();
		} else {			
			return null;
		}
	}

	
	private double[] korScore() {
		double hap = 0.0;
		int count = 0;
		for (int i=0; i<Main.list.length; i++) {
			if(Main.list[i] != null) {
				hap += Main.list[i].getKorScore();
				count++;
			}
		}
		return new double[] {hap, (hap/count)};
	}	
	
	private double[] engScore() {
		double hap = 0.0;
		int count = 0;
		for (int i=0; i<Main.list.length; i++) {
			if(Main.list[i] != null) {
				hap += Main.list[i].getEngScore();
				count++;
			}
		}
		return new double[] {hap, (hap/count)};
	}
	
	private double[] mathScore() {
		double hap = 0.0;
		int count = 0;
		for (int i=0; i<Main.list.length; i++) {
			if(Main.list[i] != null) {
				hap += Main.list[i].getMathScore();
				count++;
			}
		}
		return new double[] {hap, (hap/count)};
	}
	

}
