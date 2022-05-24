package collegeEx;

public class Student extends Member {
	
	private String subject;
	
	

	public Student(String name, String iD, String pW, String subject) {
		super(name, iD, pW);
		this.setSubject(subject);
	}

	@Override
	public void work() {
		System.out.println(getSubject() + "공부를 합니다.");
	}

	@Override
	public void test() {
		System.out.println(getSubject() + "시험을 봅니다.");
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}
