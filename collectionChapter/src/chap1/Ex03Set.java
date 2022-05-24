package chap1;

import java.util.HashSet;

public class Ex03Set {

	public static void main(String[] args) {
		HashSet<Student> studentSet = new HashSet<>();
		
		studentSet.add(new Student(123,"고길동",55));
		studentSet.add(new Student(321,"홍길동",25));
		studentSet.add(new Student(246,"홍인형",30));
		studentSet.add(new Student(333,"홍길동",27));
		studentSet.add(new Student(321,"홍의적",25));
		
		System.out.println("인원수 : "+studentSet.size());

	}

}
