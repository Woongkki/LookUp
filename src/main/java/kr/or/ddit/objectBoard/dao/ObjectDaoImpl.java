package kr.or.ddit.objectBoard.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.objectBoard.vo.ObjectVO;
import kr.or.ddit.util.SqlMapClientFactory;

public class ObjectDaoImpl implements IObjectDao {

	private SqlMapClient client;
	private static IObjectDao dao;
	
	private ObjectDaoImpl() {
		client = SqlMapClientFactory.getSqlMapClient();
	}
	
	public static IObjectDao getInstance() {
		if(dao == null) dao = new ObjectDaoImpl();
		return dao;
	}
	
	@Override
	public List<ObjectVO> selectOb() throws SQLException {
		System.out.println("다오통과");
		
		return client.queryForList("object.selectOb");
	}

	@Override
	public int totalOb() throws SQLException {
		
		return (int)client.queryForObject("object.totalOb");
	}

	@Override
	public String insertOb(ObjectVO vo) throws SQLException {
			
		return (String) client.insert("object.insertOb", vo);
	}

}
