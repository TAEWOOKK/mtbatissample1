package com.ezen.biz.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ezen.biz.dto.BoardVO;
import com.ezen.biz.util.SqlSessionFactoryBean;

public class BoardDAO {
	private SqlSession mybatis;
	
	public BoardDAO() {
		//FactoryVean을 이용하여 /S\qlSewssion 객체를 얻어온다.
		mybatis = SqlSessionFactoryBean.getSqlSessionInstance();
	}
	
	public void insertBoard(BoardVO vo) {
		mybatis.insert("BoardMapper.insertBoard",vo);
		mybatis.commit();
	}
	
	public void updateBoard(BoardVO vo) {
		mybatis.update("BoardMapper.updateBoard",vo);
		mybatis.commit();
	}
	
	public void deleteBoard(BoardVO vo) {
		mybatis.delete("BoardMapper.deleteBoard",vo);
		mybatis.commit();
	}
	
	public BoardVO getBoard(BoardVO vo) {
		return (BoardVO)mybatis.selectOne("BoardMapper.getBoard",vo);
	}
	
	public List<BoardVO> getBoardList(BoardVO vo){
		return mybatis.selectList("BoardMapper.getBoardList",vo);
	}
}
