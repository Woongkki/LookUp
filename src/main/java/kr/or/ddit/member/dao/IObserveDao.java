package kr.or.ddit.member.dao;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.member.vo.ObserveVO;

public interface IObserveDao {

	List<ObserveVO> oblist(String id)throws SQLException;

}
