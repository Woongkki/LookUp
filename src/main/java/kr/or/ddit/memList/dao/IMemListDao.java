package kr.or.ddit.memList.dao;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.memList.vo.MemListVO;

public interface IMemListDao {
	public List<MemListVO> selectMemList() throws SQLException;
}
