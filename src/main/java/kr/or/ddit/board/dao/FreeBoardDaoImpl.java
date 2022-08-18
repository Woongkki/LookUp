package kr.or.ddit.board.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.board.vo.FreeComment2VO;
import kr.or.ddit.board.vo.FreeCommentVO;
import kr.or.ddit.board.vo.FreeboardDetailVO;
import kr.or.ddit.board.vo.FreeboardListVO;
import kr.or.ddit.board.vo.ObssVO;
import kr.or.ddit.ibatis.config.SqlMapClientFactory;

public class FreeBoardDaoImpl implements IFreeBoardDao{
 private static IFreeBoardDao dao;
 private SqlMapClient smc;
 private FreeBoardDaoImpl() {
	 smc=SqlMapClientFactory.getSqlMapClient();
 }
 public static IFreeBoardDao getInstance() {
	 if(dao==null)dao=new FreeBoardDaoImpl();
	 return dao;
 }
@Override
public int totalCount(Map<String, String> map) throws SQLException {

	return (int)smc.queryForObject("free.totalCount",map);
}
@Override
public List<FreeboardListVO> selectList(Map<String, Object> map) throws SQLException {
	
	return smc.queryForList("free.selectList",map);
}
@Override
public FreeboardDetailVO fdetail(String id) throws SQLException {
	
	return (FreeboardDetailVO)smc.queryForObject("free.fdetail",id);
}
@Override
public int fbcount(String id) throws SQLException {
	// TODO Auto-generated method stub
	return (int)smc.queryForObject("free.fbcount",id);
}
@Override
public List<FreeCommentVO> fcvlist(String id) throws SQLException {
	// TODO Auto-generated method stub
	return smc.queryForList("free.fcvlist",id);
}

@Override
public int freecr(Map<String, String> para) throws SQLException {
	int cnt=0;
	if(smc.insert("free.freecr",para)==null) {
		cnt=1;
	}
	return cnt;
}


@Override
public void fc2in(Map<String, String> para) throws SQLException {
	smc.insert("free.fc2in",para);
	
}
@Override
public int fec2cnt(String comment_no) throws SQLException {
	// TODO Auto-generated method stub
	return (int)smc.queryForObject("free.fec2cnt",comment_no);
}
@Override
public List<FreeComment2VO> fc2list(int comment_no) throws SQLException {
	// TODO Auto-generated method stub
	return smc.queryForList("free.fc2list",comment_no);
}

@Override
public int freecomentin(Map<String, String> para) throws SQLException {
	int cnt=0;
	if(smc.insert("free.freecomentin",para)==null) {
		cnt=1;
	}
	return cnt;
}
@Override
public List<ObssVO> oblist(String id) throws SQLException {
	
	return smc.queryForList("free.oblist",id);
}

}
