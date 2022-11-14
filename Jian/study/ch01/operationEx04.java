package study_221109.ch01;

public class operationEx04 {

	public static void main(String[] args) {
		int gameScore = 170;
		int lastScore1 = ++gameScore;
		System.out.println(lastScore1);		//	171
		
		int lastScore2 = --gameScore;
		System.out.println(lastScore2);		//	170
	}
}