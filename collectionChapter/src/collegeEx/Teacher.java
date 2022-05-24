package collegeEx;

public class Teacher extends Member {
	
	private String subject;
	
	
	public Teacher(String name, String iD, String pW, String subject) {
		super(name, iD, pW);
		this.subject = subject;
	}

	@Override
	public void work() {
		System.out.println("강의를 합니다.");
	}
	
	@Override
	public void test() {
		System.out.println("채점을 합니다.");
	}

}
