package com.ezen.biz.board;

import java.util.List;

import com.ezen.biz.dao.BoardDAO;
import com.ezen.biz.dto.BoardVO;

public class BoardServiceClient {

	public static void main(String[] args) {
		//Board ��ü ����
			BoardDAO boardDao = new BoardDAO();
		//�Խñ� ������ �� ����
		BoardVO vo = new BoardVO();
		vo.setTitle("dqkdlqkdlxmtodtjddPwp");
		vo.setWriter("������");
		vo.setContent("�Խñ� ���� ����");
		boardDao.insertBoard(vo);
			
			
		//��[��,���ӱ� �̸�� ��ȸ
		vo.setSearchCondition("TITLE");
		vo.setSearchKeyword("");
		List<BoardVO> boardList = boardDao.getBoardList(vo);
		
		System.out.println(">>>> �Խñ� ���");
		for(BoardVO board : boardList) {
			System.out.println("----"+board);
		}
	}

}
