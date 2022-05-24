package collegeEx;

public class Service {

	public void saveData(Member teacher) {
		if (teacher != null) {
			Main.list.add(teacher);
			System.out.println("회원가입이 완료되었습니다.\n");
		} else {
			System.out.println("이미 존재하는 아이디입니다.\n");
		}
	}

}
