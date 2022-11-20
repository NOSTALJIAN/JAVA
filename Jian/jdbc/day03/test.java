package jdbc.day03;

import java.util.List;

public class test {
	public static void main(String[] args) {
		PlayerDAO dao = new PlayerDAO();
		
		PlayerDTO p = dao.getPlayer(10);
		
		p.setHeight(186);
		dao.updatePlayer(p);
		
		List<PlayerDTO> list = dao.getPlayers();
		
		for(PlayerDTO pp: list)
			System.out.println(pp);
	}
}