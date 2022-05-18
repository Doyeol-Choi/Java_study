package chap1;

import java.util.HashSet;

public class Ex02Set {

	public static void main(String[] args) {
		HashSet<String> names = new HashSet<>();
		
		names.add("고길동");
		names.add("김길동");
		names.add("고길동");
		names.add("이길동");
		names.add("고길동");
		names.add("홍길동");
		
		System.out.println("전체 개수 : " + names.size());	// 중복이 제거되어 4가 출력
		
		
	}

}
