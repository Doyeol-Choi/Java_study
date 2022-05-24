package chap1;


public class Student implements Comparable<Student>{
	private int stuNum;
	private String stuName;
	private int age;
	private char gender;
	
	public Student(int stuNum, String stuName, int age) {
		this.stuNum = stuNum;
		this.stuName = stuName;
		this.age = age;
	}

	public int getStuNum() {
		return stuNum;
	}

	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public int hashCode() { // 1차 검진: 해시코드가 다르면 다른 사람
		                    //         해시코드가 같으면 같은 사람일수도 있다!
		
		return stuNum;  // 학번이 다르면 다른 사람
	}

	@Override
	public boolean equals(Object obj) { // 2차 검진 : equals메서드가 true면 같은 사람, false면 다른 사람
		if(obj instanceof Student) { //전달 받은 Object객체가 Student인지 판다
			Student stu = (Student)obj;
			return (stu.getStuNum() == this.stuNum)?true:false;
		}else {
			return false;
		}
	}

	@Override
	public int compareTo(Student o) {  //학생 이름을 비교 기준
		return stuName.compareTo(o.getStuName());
	}

//	@Override
//	public int compareTo(Student o) {  //비교하는 기준
//		if(stuNum > o.getStuNum()) { //내가 더 크다면 양수
//			return 99999;
//		}else if(stuNum < o.getStuNum()) {//내가 더 작다면 음수
//			return -123;
//		}else {							// 같다면 0
//			return 0;
//		}
//		
//	}
//	
	
	
	
	
}
