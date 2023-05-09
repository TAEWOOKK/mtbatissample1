package com.ezen.biz.board;

import java.util.List;

import com.ezen.biz.dao.BoardDAO;
import com.ezen.biz.dto.BoardVO;

public class BoardServiceClient {

	public static void main(String[] args) {
		//Board 갹체 생성
			BoardDAO boardDao = new BoardDAO();
		//게시글 생설ㅇ 닟 저장
		BoardVO vo = new BoardVO();
		vo.setTitle("dqkdlqkdlxmtodtjddPwp");
		vo.setWriter("유관순");
		vo.setContent("게시글 생성 예제");
		boardDao.insertBoard(vo);
			
			
		//게[ㅅ,ㅏㅣ글 ㅜ목록 조회
		vo.setSearchCondition("TITLE");
		vo.setSearchKeyword("");
		List<BoardVO> boardList = boardDao.getBoardList(vo);
		
		System.out.println(">>>> 게시글 목록");
		for(BoardVO board : boardList) {
			System.out.println("----"+board);
		}
	}

}
