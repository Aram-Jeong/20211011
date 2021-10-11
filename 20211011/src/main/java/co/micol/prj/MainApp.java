package co.micol.prj;


import co.micol.prj.comm.BoardMenu;

public class MainApp {
	public static void main(String[] args) {
		// 게시판 프로젝트
		// 1. vo객체 생성 2. 인터페이스 생성 3. 인터페이스 구현체 생성
		
		BoardMenu boardMenu = new BoardMenu();
		boardMenu.run();
	}

}
