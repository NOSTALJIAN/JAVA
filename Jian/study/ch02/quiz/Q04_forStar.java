package study.ch02.quiz;

public class Q04_forStar {

	public static void main(String[] args) {
		//	for문을 이용해서 * 이 한 줄당 1개에서 5개까지 나오게 출력
		
		//	i는 5까지 설정
		//	k는 한 칸 아래로 내려가는 값, i보다 항상 작게 설정
		
		for (int i = 1; i <= 5; i++) {			//	i는 1부터 5 까지의 수, 세로로 5줄이라 5까지 설정
			for (int k = 1; k <= i; k++) {		//	k는 1부터 i 이하의 수, 가로로 1씩 늘어남, 최대 5까지
				System.out.print("*");
			}
			System.out.println();
		}
	}
}