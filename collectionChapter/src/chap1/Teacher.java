package chap1;

import java.util.Comparator;

public class Teacher implements Comparator<Student>{// 비교해주는 클래스

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getAge() > o2.getAge()) {  // o1이 더 크다면(o2가 더 작다면)
			return 123;
		}else if(o1.getAge() < o2.getAge()) { // o2이 더 크다면(o1가 더 작다면)
			return -123;
		}else {								// o1과 o2가 같다면
			return 0;
		}
		
	}

}
