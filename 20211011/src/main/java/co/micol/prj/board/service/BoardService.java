package co.micol.prj.board.service;

import java.util.List;

public interface BoardService {
	List<BoardVO> boardSelectList(); // ��ü��� ��������
	BoardVO boardSelet(BoardVO board); // �� 1�� ��ȸ
	int boardInsert(BoardVO board); // �Խñ� ���
	int boardUpdate(BoardVO board); // �Խñ� ����
	int boardDelete(BoardVO board); // �Խñ� ����
}
