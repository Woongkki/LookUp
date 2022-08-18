package kr.or.ddit.member.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.ibatis.config.SqlMapClientFactory;
import kr.or.ddit.member.vo.ObserveVO;

public class ObserveDaoImpl implements IObserveDao{
	private static IObserveDao dao;
	private SqlMapClient smc;
	private ObserveDaoImpl() {
		smc=SqlMapClientFactory.getSqlMapClient();
	}
	public static IObserveDao getInstance() {
		if(dao==null)dao=new ObserveDaoImpl();
		return dao;
	}
	
	@Override
	public List<ObserveVO> oblist(String id) throws SQLException {
		            
		return smc.queryForList("observe.oblist",id);
	}
}
