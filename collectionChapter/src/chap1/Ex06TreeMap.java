package chap1;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Ex06TreeMap {

	public static void main(String[] args) {
		TreeMap<String,Integer> students = new TreeMap<>();

		students.put("박길동", 78);
		students.put("고길동", 56);
		students.put("황길동", 95);
		students.put("송길동", 69);
		students.put("최길동", 81);
		students.put("이길동", 73);
		students.put("홍길동", 88);
		
		System.out.println("첫번째 사람의 이름 : "+students.firstEntry().getKey());
		System.out.println("첫번째 사람의 점수 : "+students.firstEntry().getValue());
		System.out.println("마지막 사람의 이름 : "+students.lastEntry().getKey());
		System.out.println("마지막 사람의 점수 : "+students.lastEntry().getValue());
		
		// 전체 정렬된 데이터 조회
		Set<Map.Entry<String,Integer>> studentsEntrySet = students.entrySet();
		//  맵안의 엔트리를 셋으로 변환시켜주는 작업
		
		Iterator<Map.Entry<String,Integer>> studentsEntrySetItr = studentsEntrySet.iterator();
		// 셋안의 내용물을 반복자를 통해서 나열하는 작업
		
		while(studentsEntrySetItr.hasNext()) {
			Map.Entry<String, Integer> studentEntry= studentsEntrySetItr.next();
		
			String name = studentEntry.getKey();
			Integer jumsu = studentEntry.getValue();
		
			System.out.println(name+"씨 점수 : "+jumsu);
		}
		
		//studentsEntrySetItr.next();
		
	}

}
