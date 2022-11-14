package study.ch07.revise;

import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		
		Student s1 = new Student(1, "서지안");
		hashSet.add(s1);
		System.out.println("저장된 객체 수 : " + hashSet.size());
		
		Student s2 = new Student(1, "서지안");
		hashSet.add(s2);
		System.out.println("저장된 객체 수 : " + hashSet.size());		//	동등한 객체는 중복 저장 X
		
		Student s3 = new Student(2, "서지안");
		hashSet.add(s3);
		System.out.println("저장된 객체 수 : " + hashSet.size());
	}
}