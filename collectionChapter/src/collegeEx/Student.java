package collegeEx;

public class Student extends Member {
	
	private String subject;
	
	

	public Student(String name, String iD, String pW, String subject) {
		super(name, iD, pW);
		this.subject = subject;
	}

	@Override
	public void work() {
		System.out.println("공부를 합니다.");
	}

	@Override
	public void test() {
		System.out.println("시험을 봅니다.");
	}

}
