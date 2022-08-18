package kr.or.ddit.notice.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import kr.or.ddit.notice.vo.NoticeVO;

public interface INoticeDao {
	
	public List<NoticeVO> selectNoticeList(Map<String, Object> map) throws SQLException;
	
	public NoticeVO noticeDetail(int no) throws SQLException;
	
	public int deleteNotice(int no) throws SQLException; 
	
	public int updateNotice(NoticeVO vo) throws SQLException;
	
	public int insertNotice(NoticeVO vo) throws SQLException;
	
	
	public int totalCount(Map<String, Object> map) throws SQLException;
	//public int totalCount() throws SQLException;

}
