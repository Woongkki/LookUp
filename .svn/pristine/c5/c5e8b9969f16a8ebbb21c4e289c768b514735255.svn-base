package kr.or.ddit.observers.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.observers.service.IObserversService;
import kr.or.ddit.observers.vo.ObserversVO;
import kr.or.ddit.util.SqlMapClientFactory;

public class ObserversDaoImpl implements IObserversDao {

	private SqlMapClient sc;
	private static IObserversDao dao;
	private ObserversDaoImpl() {
		sc = SqlMapClientFactory.getSqlMapClient();
	}
	public static IObserversDao getInstance() {
		if(dao == null) dao = new ObserversDaoImpl();
		return dao;
	}
	
	
	@Override
	public void insertOb(ObserversVO vo) throws SQLException {
		sc.insert("observers.insertOb", vo);
	}

	@Override
	public List<ObserversVO> selectOb() throws SQLException {
		return sc.queryForList("observers.selectOb");
	}

}
