package co.micol.prj.board.command;


import java.util.Scanner;

import co.micol.prj.board.service.BoardVO;


public class BoardSelect implements Command {
	private Scanner scb = new Scanner(System.in);
	
	@Override
	public void execute() {
	
		BoardVO board = new BoardVO();
		System.out.println("=====================");
		System.out.println("��ȸ�� �� ��ȣ�� �Է��ϼ���.");
		board.setBId(scb.nextInt()); scb.nextLine(); 
		board = dao.boardSelet(board);

		System.out.println("��ȣ: " + board.getBId());
		System.out.println("�ۼ���: " + board.getBWriter());
		System.out.println("�ۼ���: " + board.getBWriteDate());
		System.out.println("����: " + board.getBTitle());
		System.out.println("����: " + board.getBContents());
		System.out.println("��ȸ��: " + board.getBHit());
		
		

	}

}
