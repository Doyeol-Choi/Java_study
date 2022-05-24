package chap1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex04Map {

	public static void main(String[] args) {
		HashMap<Integer,Student> stuList = new HashMap<>();
		//       키 타입      밸류타입     
		
		stuList.put(5, new Student(5,"콩순이",5));
		stuList.put(3, new Student(1,"묘선이",25));
		stuList.put(5, new Student(2,"꺼꾸리",27));
		
		System.out.println("개수 : "+stuList.size());
		
		String name = stuList.get(5).getStuName();
		System.out.println("5번 학생이름 : "+name);
		System.out.println("-----------------------------");
		///////////////////////////////////////////////////////////
		// Map 내부 전체 데이터를 읽어오는 방법
		// Map을 Set으로 바꾼 다음 반복자를 이용하는 방법
		//	   1. Key를 Set으로 바꾸는 방법
		Set<Integer> stuListKeySet = stuList.keySet();
		
		Iterator<Integer> stuListKeySetItr = stuListKeySet.iterator();
		
		while(stuListKeySetItr.hasNext()) {
			Integer stuListKey = stuListKeySetItr.next();
			Student stuListValue = stuList.get(stuListKey);
			
			System.out.println(stuListKey+"번 학생 이름 : "+stuListValue.getStuName());
		}
			
		System.out.println("---------------------------------------------");
		//     2. Entry를 Set으로 바꾸는 방법
		Set<Map.Entry<Integer, Student>> stuListEntrySet = stuList.entrySet();
		
		Iterator<Map.Entry<Integer, Student>> stuListEntrySetItr = stuListEntrySet.iterator();
		
		while(stuListEntrySetItr.hasNext()) {
			Map.Entry<Integer, Student> stuListEntry = stuListEntrySetItr.next();
			
			Integer stuListKey = stuListEntry.getKey();
			Student stuListValue = stuListEntry.getValue();
			
			System.out.println(stuListKey+"번 학생 이름: "+stuListValue.getStuName());
		}
		
		int num = 4;
		if(stuList.containsKey(num)) {
			System.out.println("너의 이름은? "+stuList.get(num).getStuName());
		}else {
			System.out.println("그런 사람 없습니다.");
		}
		   
		
		
		
		
		
	}

}
