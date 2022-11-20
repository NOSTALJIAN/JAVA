package jdbc.day03;

import java.util.List;

public class PlayerInIt {
	public static void main(String[] args) {
		PlayerDAO dao = new PlayerDAO();
		dao.createTable();
		
		dao.insertPlayer(new PlayerDTO(18, "윤호솔", "투수", "1994-07-15", 183, 0));
		dao.insertPlayer(new PlayerDTO(19, "김재영", "투수", "1993-07-22", 187, 0));
		dao.insertPlayer(new PlayerDTO(49, "이충호", "투수", "1994-09-20", 182, 0));
		dao.insertPlayer(new PlayerDTO(26, "허관회", "포수", "1999-02-12", 176, 0));
		dao.insertPlayer(new PlayerDTO(13, "최재훈", "포수", "1989-08-27", 178, 0));
		dao.insertPlayer(new PlayerDTO(42, "박상언", "포수", "1997-03-03", 185, 0));
		dao.insertPlayer(new PlayerDTO(68, "변우혁", "내야수", "2000-03-18", 185, 0));
		dao.insertPlayer(new PlayerDTO(04, "이상혁", "내야수", "2001-09-14", 172, 0));
		dao.insertPlayer(new PlayerDTO(8, "노시환", "내야수", "2000-12-03", 185, 0));
		dao.insertPlayer(new PlayerDTO(12, "터크먼", "외야수", "1990-12-03", 188, 0));
		dao.insertPlayer(new PlayerDTO(65, "유상빈", "외야수", "2000-05-09", 181, 0));
		dao.insertPlayer(new PlayerDTO(33, "유로결", "외야수", "2000-05-30", 186, 0));
		
		
		
		List<PlayerDTO> list = dao.getPlayers();
		for (PlayerDTO p : list)
			System.out.println(p);
	}
}