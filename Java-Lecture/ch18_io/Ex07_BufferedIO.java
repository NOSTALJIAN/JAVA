package ch18_io;

import java.io.*;

public class Ex07_BufferedIO {
	public static void main(String[] args) throws IOException {
		
//		//	바이트 입출력 스트림
//		BufferedInputStream bis = new BufferedInputStream(바이트 입력 스트림);
//		BufferedOutputStream bos = new BufferedOutputStream(바이트 출력 스트림);
		
//		//	문자 입출력 스트림
//		BufferedReader br = new BufferedReader(문자 입력 스트림);
//		BufferedReader bw = new BufferedReader(문자 출력 스트림);
		
		//	Case 1) 입출력 스트림으로 복사
		FileInputStream fis = new FileInputStream("/private/tmp/PalaceOfVersailles-1.jpeg");
		FileOutputStream fos = new FileOutputStream("/private/tmp/PalaceOfVersailles-1.jpeg");
		
		//	Case 2) 입출력 스트림 + 버퍼 스트림으로 복사
		FileInputStream fis2 = new FileInputStream("/private/tmp/PalaceOfVersailles-2.jpeg");
		FileOutputStream fos2 = new FileOutputStream("/private/tmp/PalaceOfVersailles-2.jpeg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		//	버퍼를 사용하지 않고 복사
		long noBufferTime = copy(fis, fos);
		System.out.println("버퍼 미사용 : " + noBufferTime + " ns");
		
		//	버퍼를 사용하여 복사
		long bufferTime = copy(bis, bos);
		System.out.println("버퍼 사용 : " + bufferTime + " ns");
		
		System.out.println(noBufferTime / bufferTime);
		
		fis.close(); fos.close(); fis2.close(); fos2.close();
		bis.close(); bos.close();
	}
	
	public static long copy(InputStream is, OutputStream os) throws IOException {
		long startTime = System.nanoTime();
		//	1 바이트 단위로 읽고 쓰기
		while (true) {
			int data = is.read();
			if (data == -1)
				break;
			os.write(data);
		}
		os.flush();
		long endTime = System.nanoTime();
		return endTime - startTime;
	}
}