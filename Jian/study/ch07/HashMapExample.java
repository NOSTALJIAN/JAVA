package study.ch07;

import java.util.*;
import java.util.Map.Entry;

public class HashMapExample {
	public static void main(String[] args) {
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();
		
		//객체 저장
		map.put("서지안", 94);
		map.put("김은미", 67);		//	key가 같기 때문에 제일 마지막에 저장한 값만 저장
		map.put("서장원", 68);
		map.put("김은미", 95);		//	
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println();
		
		//키로 값 얻기
		String key = "서지안";
		int value = map.get(key);		//	key를 매개값으로 주면 값을 리턴
		System.out.println(key + " : " + map.get("김은미"));
		System.out.println();
		
		//키 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
		Set<String> keySet = map.keySet();					//	key를 반복하기 위해 반복자를 얻음
		Iterator<String> keyIterator = keySet.iterator();	//
		while (keyIterator.hasNext()) {
			String k = keyIterator.next();
			Integer v = map.get(key);
			System.out.println(k + " : " + v);
		}
		System.out.println();
		
		//엔트리 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			String k = entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k + " : " + v);
		}
		
		System.out.println();
		
		//키로 엔트리 삭제
		map.remove("김은미");
		System.out.println("총 엔트리 수  : " + map.size());
		System.out.println();
	}
}