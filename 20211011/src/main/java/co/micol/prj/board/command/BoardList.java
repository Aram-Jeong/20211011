package co.micol.prj.board.command;

import java.util.ArrayList;
import java.util.List;

import co.micol.prj.board.service.BoardService;
import co.micol.prj.board.service.BoardVO;
import co.micol.prj.board.serviceImpl.BoardServiceImpl;

public class BoardList implements Command{ // 게시글 목록 보는 것
	private List<BoardVO> list = new ArrayList<BoardVO>();
	

	@Override
	public void execute() {
		list = dao.boardSelectList();
		System.out.println("순번|작성자|  작성일자  |        제목        |     조회수 ");
		for(BoardVO vo : list) {
			System.out.print(vo.getBId()+"   ");
			System.out.print(vo.getBWriter()+ " ");
			System.out.print(vo.getBWriteDate()+ "  ");
			System.out.print(vo.getBTitle()+ "         ");
			System.out.println(vo.getBHit()+ " ");
			
		}
	}

}
