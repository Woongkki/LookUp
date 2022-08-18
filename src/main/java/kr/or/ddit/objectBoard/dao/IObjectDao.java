package kr.or.ddit.objectBoard.dao;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.objectBoard.vo.ObjectVO;

public interface IObjectDao {
	public List<ObjectVO> selectOb() throws SQLException;
	
	public int totalOb() throws SQLException;
	
	public String insertOb(ObjectVO vo) throws SQLException;
}
