package study.ch07.revise;

public class ExitExample {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			//i값 출력
			System.out.println(i);
			if(i == 5) {
				//JVM 프로세스 종료
				System.out.println("프로세스 강제 종료");
				System.exit(0);			//	정상 종료일 경우 0, 비정상 종료일 경우 1 or -1
			}
		}
	}
}