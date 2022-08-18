package kr.or.ddit.map.dao;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.ibatis.config.SqlMapClientFactory;
import kr.or.ddit.map.vo.ObservatoryVO;


public class ObservatoryDaoImpl implements IObservatoryDao{
	
	private static IObservatoryDao dao;
	private SqlMapClient smc;
	
	private ObservatoryDaoImpl() {
		smc = SqlMapClientFactory.getSqlMapClient();
	}
	
	public static IObservatoryDao getInstance() {
		if(dao == null) dao = new ObservatoryDaoImpl();
		return dao;
	}
	
	
	@Override
	public ObservatoryVO selectObservatory(String name) throws SQLException {
		return (ObservatoryVO)smc.queryForObject("observatory.selectObservatory",name);
	}
}
