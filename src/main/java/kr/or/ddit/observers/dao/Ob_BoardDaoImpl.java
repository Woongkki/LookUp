package kr.or.ddit.observers.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.observers.vo.Ob_BoardVO;
import kr.or.ddit.util.SqlMapClientFactory;

public class Ob_BoardDaoImpl implements IOb_BoardDao {

	private SqlMapClient sc;
	private static IOb_BoardDao dao;
	private Ob_BoardDaoImpl() {
		sc = SqlMapClientFactory.getSqlMapClient();
	}
	public static IOb_BoardDao getInstance() {
		if(dao == null) dao = new Ob_BoardDaoImpl();
		return dao;
	}
	
	@Override
	public int obBoardInsert(Ob_BoardVO vo) throws SQLException {
	   Object  obj = sc.insert("obBoard.obBoardInsert", vo);
	   
	   int flag = 0;
	   if(obj == null) flag = 1;
	   
	   return flag;
	}

	@Override
	public List<Ob_BoardVO> obBoardSelectAll() throws SQLException {
		return sc.queryForList("obBoard.obBoardSelectAll");
	}
	
	@Override
	public Ob_BoardVO obBoardRead(int BoardNum) throws SQLException {
		return (Ob_BoardVO) sc.queryForObject("obBoard.obBoardRead", BoardNum);
	}
	
	@Override
	public int obBoardNowNum(String observernum) throws SQLException {
		return (int) sc.queryForObject("obBoard.obBoardNowNum", observernum);
	}
	
	@Override
	public String obMeetingInsert(Ob_BoardVO vo) throws SQLException {
		return (String) sc.insert("obBoard.obMeetingInsert", vo);
	}
	@Override
	public String obMeetingCheck(Ob_BoardVO vo) throws SQLException {
		return (String) sc.queryForObject("obBoard.obMeetingCheck", vo);
	}
	
	@Override
	public int obBoardCount() throws SQLException {
		return (int) sc.queryForObject("obBoard.obBoardCount");
	}

}
