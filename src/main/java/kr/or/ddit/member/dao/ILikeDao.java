package kr.or.ddit.member.dao;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.member.vo.LikeScheduleVO;

public interface ILikeDao {

	List<LikeScheduleVO> likeList(String id)throws SQLException;

}
