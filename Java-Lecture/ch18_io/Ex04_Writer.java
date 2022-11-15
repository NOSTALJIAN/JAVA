package ch18_io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex04_Writer {
	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("/private/tmp/test.txt");
		
		//	1 문자씩 출력
		char a = 'A', b = 'B';
		writer.write(a);
		writer.write(b);
		
		//	char 배열 출력
		char[] arr = {'C', 'D', 'E'};
		writer.write(arr);
		
		//	문자열 출력
		writer.write("FGH");
		writer.write("한글도 잘 써짐");
		
		writer.flush();					//	출력 버퍼에 잔류하는 모든 바이트를 출력
		writer.close();					//	출력 스트림을 닫고 사용 메모리 해제
	}
}