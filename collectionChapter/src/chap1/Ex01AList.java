package chap1;

import java.util.ArrayList;

public class Ex01AList {
	public static void main(String[] args) {
		String[] ArrNames = new String[5];
		ArrNames[0] = "고길동";
		ArrNames[1] = "김길동";
		ArrNames[2] = "이길동";
		ArrNames[3] = "박길동";
		ArrNames[4] = "홍길동";
//		ArrNames[5] = "황길동";		// out of bounds 범위를 벗어난 에러
		
		ArrayList<String> names = new ArrayList<>();
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
		
		names.add("고길동");
		names.add("홍길동");
		System.out.println("0번 이름: " + names.get(0));
		System.out.println("1번 이름: " + names.get(1));
	}
}
