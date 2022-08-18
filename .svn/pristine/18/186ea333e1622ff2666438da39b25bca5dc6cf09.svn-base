package kr.or.ddit.member.service;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import kr.or.ddit.member.dao.IMemberBoardViewDao;
import kr.or.ddit.member.dao.IMemberDao;
import kr.or.ddit.member.dao.MemberBoardViewDaoImpl;
import kr.or.ddit.member.dao.MemberDaoImpl;
import kr.or.ddit.member.vo.RcBoardViewVO;
import kr.or.ddit.member.vo.RcBoardViewVO2;
import kr.or.ddit.member.vo.RecentSearchVO;
import kr.or.ddit.member.vo.RecentSearchVO2;

public class MemberBoardViewServiceImpl implements IMemberBoardViewService{
	
	
	private static IMemberBoardViewService service;
	private IMemberBoardViewDao dao;
	private MemberBoardViewServiceImpl() {
		dao=MemberBoardViewDaoImpl.getInstance();
	}
	public static IMemberBoardViewService getInstance() {
		if(service==null)service=new MemberBoardViewServiceImpl();
		return service;
	}

	@Override
	public List<RecentSearchVO> freeboardDate(String memid) {
		List<RecentSearchVO>list=null;
		try {
			list=dao.freeboardDate(memid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public List<RecentSearchVO> objectboardDate(String memid) {
		List<RecentSearchVO>list=null;
		try {
			list=dao.objectboardDate(memid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public List<RecentSearchVO> obboardDate(String memid) {
		List<RecentSearchVO> list=null;
		try {
			list=dao.obboardDate(memid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public String search(String s) {
	  String result="";
	  try {
		result=dao.search(s);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return result;
	}
	@Override
	public RcBoardViewVO fboard(Map<String, String> para) {
		RcBoardViewVO vo=null;
		try {
			vo=dao.fboard(para);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vo;
	}
	@Override
	public RcBoardViewVO objboard(Map<String, String> para) {
		RcBoardViewVO vo=null;
		try {
			vo=dao.objboard(para);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return vo;
	}
	@Override
	public RcBoardViewVO obboard(Map<String, String> para) {
		RcBoardViewVO vo=null;
		try {
			vo=dao.obboard(para);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vo;
	}
	@Override
	public List<RecentSearchVO2> freecommentdDate(String id) {
		List<RecentSearchVO2>list=null;
		try {
			list=dao.freecommentdDate(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public List<RecentSearchVO2> objectcommentDate(String id) {
		List<RecentSearchVO2>list=null;
		try {
			list=dao.objectcommentDate(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public RcBoardViewVO2 fcboard(Map<String, String> para) {
		RcBoardViewVO2 vo=null;
		try {
			vo=dao.fcboard(para);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vo;
	}
	@Override
	public RcBoardViewVO2 objcboard(Map<String, String> para) {
		RcBoardViewVO2 vo=null;
		      try {
				vo=dao.objcboard(para);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return vo;
	}

}
