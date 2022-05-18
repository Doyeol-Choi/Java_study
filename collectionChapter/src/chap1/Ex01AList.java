package chap1;

import java.util.LinkedList;

public class Ex01AList {
	public static void main(String[] args) {
		String[] ArrNames = new String[5];
		ArrNames[0] = "고길동";
		ArrNames[1] = "김길동";
		ArrNames[2] = "이길동";
		ArrNames[3] = "박길동";
		ArrNames[4] = "홍길동";
//		ArrNames[5] = "황길동";		// out of bounds 범위를 벗어난 에러
		
		// 배열하고 비슷한 애 => 개수를 안적는다.
		// <> = 제네릭 타입은 무조건 참조 타입만 가능
		// 기본타입은 참조타입으로 포장 => Wrapper 클래스
		
		// byte	 => Byte
		// short => Short
		// int	 => Integer
		// long	 => Long
		// float => Float
		// double => Double
		// char	  => Character
		// boolean => Boolean
		
//		ArrayList<String> names = new ArrayList<>();	// 뒤의 <>는 생략가능
		LinkedList<String> names = new LinkedList<>();	
		
		names.add("고길동"); //0
		names.add("김길동"); //1
		names.add("박길동"); //2
		names.add("이길동"); //3
		names.add("홍길동"); //4
		
		for (int i=0; i < names.size(); i++) {
			System.out.println((i) + "번째 사람 : " + names.get(i));
		}
		System.out.println("----------------------------------------");
		
		names.add(2,"조길동");	// 고, 김, 조, 박, 이, 홍 -> 중간에 추가한다.
		
		for (int i=0; i < names.size(); i++) {
			System.out.println((i) + "번째 사람 : " + names.get(i));
		}
		System.out.println("----------------------------------------");
		
		names.set(2, "문길동");	// 인덱스 2번 자리를 바꾼다
		
		for (int i=0; i < names.size(); i++) {
			System.out.println((i) + "번째 사람 : " + names.get(i));
		}
		System.out.println("----------------------------------------");
		
		names.remove(2);		// 인덱스 2번을 지우고 뒷 인덱스들을 앞으로 정렬한다
		
		for (int i=0; i < names.size(); i++) {
			System.out.println((i) + "번째 사람 : " + names.get(i));
		}
	}
}
