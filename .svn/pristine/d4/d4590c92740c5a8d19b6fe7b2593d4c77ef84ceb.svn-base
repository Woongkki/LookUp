package kr.or.ddit.notice.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.ibatis.config.SqlMapClientFactory;
import kr.or.ddit.notice.vo.NoticeVO;

public class NoticeDaoImpl implements INoticeDao{
	private SqlMapClient client;
	private static INoticeDao dao;
	private NoticeDaoImpl() {
		client = SqlMapClientFactory.getSqlMapClient();
	}
	
	public static INoticeDao getInstance() {
		if(dao==null) dao = new NoticeDaoImpl();
		return dao;
	}

	@Override
	public List<NoticeVO> selectNoticeList(Map<String, Object> map) throws SQLException {
		System.out.println("다오 통과");
		return client.queryForList("notice.selectNoticeList", map);
	}

	@Override
	public NoticeVO noticeDetail(int no) throws SQLException {
		return (NoticeVO) client.queryForObject("notice.noticeDetail", no);
	}

	@Override
	public int deleteNotice(int no) throws SQLException {
		return client.delete("notice.deleteNotice", no);
	}

	@Override
	public int updateNotice(NoticeVO vo) throws SQLException {
		return client.update("notice.updateNotice", vo);
	}

	@Override
	public int insertNotice(NoticeVO vo) throws SQLException {
		int cnt = 0;
		Object obj = client.insert("notice.insertNotice", vo);
		if(obj==null) cnt = 1;
		return cnt;
	}

	@Override
	public int totalCount(Map<String, Object> map) throws SQLException {
		return (int) client.queryForObject("notice.totalCount", map);
	}

}
