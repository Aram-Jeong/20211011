package co.micol.prj.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.micol.prj.board.service.BoardService;
import co.micol.prj.board.service.BoardVO;

public class BoardMybatisService implements BoardService {
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private BoardMapper map = sqlSession.getMapper(BoardMapper.class);
	
	@Override
	public List<BoardVO> boardSelectList() {
		// TODO Auto-generated method stub
		return map.boardSelectList();
	}

	@Override
	public BoardVO boardSelet(BoardVO board) {
		// TODO Auto-generated method stub
		return map.boardSelet(board);
	}

	@Override
	public int boardInsert(BoardVO board) {
		// TODO Auto-generated method stub
		return map.boardInsert(board);
	}

	@Override
	public int boardUpdate(BoardVO board) {
		// TODO Auto-generated method stub
		return map.boardUpdate(board);
	}

	@Override
	public int boardDelete(BoardVO board) {
		// TODO Auto-generated method stub
		return map.boardDelete(board);
	}

}
