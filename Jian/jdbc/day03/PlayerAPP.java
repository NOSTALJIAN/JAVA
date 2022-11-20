package jdbc.day03;

import java.util.List;
import java.util.Scanner;

public class PlayerAPP {
	private static Scanner scan = new Scanner(System.in);
	private static PlayerDAO dao = new PlayerDAO();

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("--------------------------------------------------------------------");
			System.out.println("1. 선수목록 | 2. 선수등록 | 3. 정보수정 | 4. 선수탈퇴 | 5. 종료");
			System.out.println("--------------------------------------------------------------------");
			System.out.print("선택 > ");
			
			int selectNo = Integer.parseInt(scan.nextLine());
			switch(selectNo) {
			case 1 :
				listPlayers(); break;
			case 2 :
				registerPlayer(); break;
			case 3 :
				updatePlayer(); break;
			case 4 :
				deletePlayer(); break;
			case 5 :
				run = false; break;
			default :
				System.out.println("Warning : 1에서 5까지의 숫자만 입력하세요.");
			}
		}
		scan.close();
		System.out.println("프로그램 종료");
	}
	
	public static void listPlayers() {
		List<PlayerDTO> list = dao.getPlayers();
		for (PlayerDTO c: list)
			System.out.println(c);
	}
	
	public static void registerPlayer() {
		int backNo;
		while (true) {
			System.out.print("백넘버 > ");
			backNo = Integer.parseInt(scan.nextLine());
			PlayerDTO p = dao.getPlayer(backNo);
			if (p.getName() == null)
				break;
			System.out.println("중복된 백넘버입니다. 다시 입력하세요.");
		}
		System.out.print("이름 > ");
		String name = scan.nextLine();
		System.out.print("포지션 > ");
		String position = scan.nextLine();
		System.out.print("생년월일 > ");
		String birthDay = scan.nextLine();
		System.out.print("신장 > ");
		int height = Integer.parseInt(scan.nextLine());
		PlayerDTO np = new PlayerDTO(backNo, name, position, birthDay, height, 0);
		dao.insertPlayer(np);
		System.out.println("선수 등록을 마쳤습니다.");
	}
	
	public static void updatePlayer() {
		System.out.print("백넘버  > ");
		int backNo = Integer.parseInt(scan.nextLine());
		PlayerDTO p = dao.getPlayer(backNo);
		
		System.out.print("이름(" + p.getName() + ") > ");
		String name = scan.nextLine();
		name = (name.length() == 0) ? p.getName() : name;		//	Enter를 치면 기존 값을 변경하지 않음
		
		System.out.print("포지션(" + p.getPosition() + ") > ");
		String position = scan.nextLine();
		position = (position.length() == 0) ? p.getPosition().toString() : position;
		
		System.out.print("생년월일(" + p.getBirthDay() + ") > ");
		String birthDay = scan.nextLine();
		birthDay = (birthDay.length() == 0) ? p.getBirthDay().toString() : birthDay;
		
		System.out.print("신장(" + p.getHeight() + ") > ");
		String h = scan.nextLine();
		int height = (h.length() == 0) ? p.getHeight() : Integer.parseInt(h);
		
		p = new PlayerDTO(backNo, name, position, birthDay, height, 0);
		dao.updatePlayer(p);
		System.out.println("선수정보 수정을 마쳤습니다.");
	}
	
	public static void deletePlayer() {
		System.out.println("백넘버 > ");
		int backNo = Integer.parseInt(scan.nextLine());
		dao.deletePlayer(backNo);
		System.out.println("고객 탈퇴를 마쳤습니다.");
	}
}