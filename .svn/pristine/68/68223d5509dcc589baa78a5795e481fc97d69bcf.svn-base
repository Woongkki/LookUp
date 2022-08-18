package kr.or.ddit.member.service;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.member.dao.ILikeDao;
import kr.or.ddit.member.dao.IMemberBoardViewDao;
import kr.or.ddit.member.dao.LikeDaoImpl;
import kr.or.ddit.member.dao.MemberBoardViewDaoImpl;
import kr.or.ddit.member.vo.LikeScheduleVO;

public class LikeServiceImpl implements ILikeService{
	private static ILikeService service;
	private ILikeDao dao;
	private LikeServiceImpl() {
		dao=LikeDaoImpl.getInstance();
	}
	public static ILikeService getInstance() {
		if(service==null)service=new LikeServiceImpl();
		return service;
	}
	@Override
	public List<LikeScheduleVO> likeList(String id) {
		List<LikeScheduleVO>list=null;
		try {
			list=dao.likeList(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
