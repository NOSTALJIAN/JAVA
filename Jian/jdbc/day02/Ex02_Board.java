package jdbc.day02;

import java.util.Date;

import lombok.Data;

@Data
public class Ex02_Board {
	private int bno;
	private String btitle;
	private String bcontent;
	private String bwriter;
	private Date bdate;
}