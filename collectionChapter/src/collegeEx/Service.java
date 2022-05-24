package collegeEx;

public class Service {

	public void saveData(Member teacher) {
		Main.list.add(teacher);
		System.out.println("회원가입이 완료되었습니다.\n");
	}

}
