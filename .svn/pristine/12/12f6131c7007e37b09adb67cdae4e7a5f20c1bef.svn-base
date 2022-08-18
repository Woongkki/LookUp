package kr.or.ddit.qna.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import kr.or.ddit.qna.vo.QnaVO;

public interface IQnaDao {
	
	//public List<QnaVO> selectQnaList(Map<String, Object> map) throws SQLException;
	public List<QnaVO> selectQnaList() throws SQLException;
	
	public QnaVO qnaDetail(int no) throws SQLException;
	
	public int deleteQna(int no) throws SQLException; 
	
	public int updateQna(QnaVO vo) throws SQLException;
	
	public int insertQna(QnaVO vo) throws SQLException;
	
	
	public int totalCount() throws SQLException;

}
