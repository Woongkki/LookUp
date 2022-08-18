package kr.or.ddit.memList.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.memList.vo.MemListVO;
import kr.or.ddit.util.SqlMapClientFactory;

public class MemListDaoImpl implements IMemListDao {
	
	private SqlMapClient client;
	private static IMemListDao dao;
	
	public MemListDaoImpl() {
		client = SqlMapClientFactory.getSqlMapClient();
	}
	
	public static IMemListDao getInstance() {
		if(dao == null) dao = new MemListDaoImpl();
		return dao;
	}

	@Override
	public List<MemListVO> selectMemList() throws SQLException {
		
		return client.queryForList("memList.selectMemList");
	}

}
