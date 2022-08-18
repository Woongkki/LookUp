package kr.or.ddit.qna.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.ibatis.config.SqlMapClientFactory;
import kr.or.ddit.qna.vo.QnaVO;

public class QnaDaoImpl implements IQnaDao{
	private SqlMapClient client;
	private static IQnaDao dao;
	private QnaDaoImpl() {
		client = SqlMapClientFactory.getSqlMapClient();
	}
	
	public static IQnaDao getInstance() {
		if(dao==null) dao = new QnaDaoImpl();
		return dao;
	}

	@Override
	public List<QnaVO> selectQnaList() throws SQLException {
		return client.queryForList("qna.selectQnaList");
	}

	@Override
	public QnaVO qnaDetail(int no) throws SQLException {
		return (QnaVO) client.queryForObject("qna.qnaDetail", no);
	}

	@Override
	public int deleteQna(int no) throws SQLException {
		return client.delete("qna.deleteQna", no);
	}

	@Override
	public int updateQna(QnaVO vo) throws SQLException {
		return client.update("qna.updateQna", vo);
	}

	@Override
	public int insertQna(QnaVO vo) throws SQLException {
		int cnt = 0;
		Object obj = client.insert("qna.insertQna", vo);
		if(obj==null) cnt = 1;
		return cnt;
	}

	@Override
	public int totalCount() throws SQLException {
		return (int) client.queryForObject("qna.totalCount");
	}

}
