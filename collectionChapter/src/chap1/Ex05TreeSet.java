package chap1;

import java.util.TreeSet;

public class Ex05TreeSet {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<>();
		
		names.add("박길동");
		names.add("고길동");
		names.add("황길동");
		names.add("송길동");
		names.add("최길동");
		names.add("이길동");
		names.add("홍길동");
	
		System.out.println("첫번째 이름 : "+names.first());
		System.out.println("마지막 이름 : "+names.last());
		System.out.println("신길동보다 작은 이름 : "+names.lower("신길동"));
		System.out.println("신길동보다 큰 이름 : "+names.higher("신길동"));
		System.out.println("최길동보다 작거나 같은 이름 : "+names.floor("최길동"));
		System.out.println("배길동보다 작거나 같은 이름 : "+names.floor("배길동"));
		System.out.println("최길동보다 크거나 같은 이름 : "+names.ceiling("최길동"));
		System.out.println("배길동보다 크거나 같은 이름 : "+names.ceiling("배길동"));
		
	}

}
