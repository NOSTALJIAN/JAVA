package ch18_io;

import java.io.*;
import java.text.SimpleDateFormat;

public class Ex11_file {
	public static void main(String[] args) throws Exception {
		File dir = new File("/private/tmp/images");
		File file1 = new File("/private/tmp/file1.txt");
		File file2 = new File("/private/tmp/file2.txt");
		File file3 = new File("/private/tmp/file3.txt");
		
		//	존재하지 않으면 디렉토리 또는 파일 생성
		if (!dir.exists()) dir.mkdirs();
		if (!file1.exists()) file1.createNewFile();
		if (!file2.exists()) file2.createNewFile();
		if (!file3.exists()) file3.createNewFile();
		
		//	Tmp 디렉토리 내용
		File tmp = new File("/private/tmp");
		File[] contents = tmp.listFiles();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for (File file : contents) {
			System.out.printf("%-22s", sdf.format(file.lastModified()));
			if (file.isDirectory())
				System.out.printf("%-10s%-20s", "<ls -l>", file.getName());
			else
				System.out.printf("%,-10d%-20s", file.length(), file.getName());
			System.out.println();
//			System.out.printf("%,10d  ", file.length());
//			System.out.println(file.getName());
		}
	}
}