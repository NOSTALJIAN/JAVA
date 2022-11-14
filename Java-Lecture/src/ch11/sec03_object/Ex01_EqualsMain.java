package ch11.sec03_object;

public class Ex01_EqualsMain {

	public static void main(String[] args) {
		Member member1 = new Member("seo", "서지안");
		Member member2 = new Member("seo", "서윤영");
		Member member3 = new Member("seo", "서지안");
		
		//	Member에서 equals method를 재정의하기 이전
		System.out.println(member1.equals(member3));	//	아래 결과와 동일
		System.out.println(member1 == member3);			//	참조하는 주소가 같으냐를 비교
	}
}