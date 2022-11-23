package study.ch09;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * LinkedList
 * ArrayList와 사용방법은 동일하지만 내부 구조는 완전히 다름
 * ArrayList 는 내부 배열에 객체를 저장
 * LinkedList는 인접 객체를 체인처럼 연결해서 관리
 * 
 * 특정 위치에서 객체를 삽입하거나 삭제하면 바로 앞뒤 링크만 변경하면 됨
 * 빈번한 객체 삭제와 삽입이 일어나는 곳에서는 ArrayList보다 좋은 성능
 */
public class LinkedListExample {
	public static void main(String[] args) {
/*
		//LinkedList 컬렉션 생성 방법
		List<E> list = new LinkedList<E>();		//	E에 지정된 타입의 객체만 저장
		List<E> list = new LinkedList<>();		//	E에 지정된 타입의 객체만 저장
		List<> list = new LinkedList();			//	모든 타입의 객체를 저장
*/
		//ArrayList 컬렉션 객체 생성
		List<String> list1 = new ArrayList<String>();
		
		//LinkedList 컬렉션 객체 생성
		List<String> list2 = new LinkedList<String>();
		
		//시작 시간과 끝 시간을 저장할 수 있는 변수 선언
		long startTime;
		long endTime;
		
		//ArrayList 컬렉션에 저장하는 시간 측정
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "ArrayList 걸린 시간 : ", (endTime-startTime));
		
		//LinkedList 컬렉션에 저장하는 시간 측정
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "LinkedList 걸린 시간 : ", (endTime - startTime));
	}
}