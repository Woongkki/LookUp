package kr.or.ddit.qna.service;

import java.util.List;
import java.util.Map;

import kr.or.ddit.qna.vo.QnaVO;

public interface IQnaService {
	
	//public List<QnaVO> selectQnaList(Map<String, Object> map);
	public List<QnaVO> selectQnaList();
	
	public QnaVO qnaDetail(int no);
	
	public int deleteQna(int no); 
	
	public int updateQna(QnaVO vo);
	
	public int insertQna(QnaVO vo);
	
	
	public int totalCount();
}
