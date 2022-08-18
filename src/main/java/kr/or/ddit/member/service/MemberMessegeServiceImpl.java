package kr.or.ddit.member.service;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.member.dao.IMemberBoardViewDao;
import kr.or.ddit.member.dao.IMemberMessegeDao;
import kr.or.ddit.member.dao.MemberBoardViewDaoImpl;
import kr.or.ddit.member.dao.MemberMessegeDaoImpl;
import kr.or.ddit.member.vo.MessegeVO;
import kr.or.ddit.member.vo.QuestionVO;


public class MemberMessegeServiceImpl implements IMemberMessegeService{

	private static IMemberMessegeService service;
	private IMemberMessegeDao dao;
	private MemberMessegeServiceImpl() {
		dao=MemberMessegeDaoImpl.getInstance();
	}
	public static IMemberMessegeService getInstance() {
		if(service==null)service=new MemberMessegeServiceImpl();
		return service;
	}
	
	@Override
	public List<Integer> msrNoSearch(String id) {
		List<Integer>list=null;
		try {
			list=dao.msrNoSearch(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public List<String> qsrNoListSearch(String id) {
		List<String>list=null;
		try {
			list=dao.qsrNoListSearch(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public List<QuestionVO> qsListSearch(String qsnum) {
		 List<QuestionVO> list=null;
		 try {
			list=dao.qsListSearch(qsnum);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public List<MessegeVO> msListSearch(int msnum) {
		List<MessegeVO>list=null;
		try {
			list=dao.msListSearch(msnum);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	
	
}
