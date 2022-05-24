package chap1;

import java.util.TreeMap;
import java.util.TreeSet;

public class Ex07Tree {

	public static void main(String[] args) {
		//TreeSet<Student> stuSet = new TreeSet<>();
		
		TreeSet<Student> stuSet = new TreeSet<>(new Teacher());
	
		stuSet.add(new Student(7,"유비",25));
		stuSet.add(new Student(9,"조조",32));
		stuSet.add(new Student(4,"마초",29));
		stuSet.add(new Student(6,"관우",34));
		stuSet.add(new Student(8,"공명",26));
		
		TreeMap<Student,String> stuMap = new TreeMap<>(new Teacher());
		// Teacher가 가진 정렬기준에 의해서 키에 해당하는 Student가 정렬되어 입력된다.
		
	}

}
