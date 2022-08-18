package kr.or.ddit.member.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapException;

import kr.or.ddit.ibatis.config.SqlMapClientFactory;
import kr.or.ddit.member.vo.MessegeVO;
import kr.or.ddit.member.vo.QuestionVO;


public class MemberMessegeDaoImpl implements IMemberMessegeDao{
	private static IMemberMessegeDao dao;
	private SqlMapClient smc;
	private MemberMessegeDaoImpl() {
		smc=SqlMapClientFactory.getSqlMapClient();
	}
	public static IMemberMessegeDao getInstance() {
		if(dao==null)dao=new MemberMessegeDaoImpl();
		return dao;
	}
	
	@Override
	public List<Integer> msrNoSearch(String id) throws SQLException {
		// TODO Auto-generated method stub
		return smc.queryForList("messege.msrNoSearch",id);
	}
	@Override
	public List<String> qsrNoListSearch(String id) throws SQLException {
		// TODO Auto-generated method stub
		return smc.queryForList("messege.qsrNoListSearch",id);
	}
	@Override
	public List<QuestionVO> qsListSearch(String qsnum) throws SQLException {
		// TODO Auto-generated method stub
		return smc.queryForList("messege.qsListSearch",qsnum);
	}
	@Override
	public List<MessegeVO> msListSearch(int msnum) throws SQLException {
		// TODO Auto-generated method stub
		return smc.queryForList("messege.msListSearch",msnum);
	}
	
	
	
}
