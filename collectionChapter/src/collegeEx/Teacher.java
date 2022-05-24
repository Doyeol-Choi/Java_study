package collegeEx;

public class Teacher extends Member {
	
	private String subject;
	
	
	public Teacher(String name, String iD, String pW, String subject) {
		super(name, iD, pW);
		this.setSubject(subject);
	}

	@Override
	public void work() {
		System.out.println(getSubject() + "강의를 합니다.");
	}
	
	@Override
	public void test() {
		System.out.println(getSubject() + "시험 채점을 합니다.");
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}
