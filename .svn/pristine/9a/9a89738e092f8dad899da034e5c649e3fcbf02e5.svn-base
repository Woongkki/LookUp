package kr.or.ddit.observers.service;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.observers.dao.IOb_BoardDao;
import kr.or.ddit.observers.dao.Ob_BoardDaoImpl;
import kr.or.ddit.observers.vo.Ob_BoardVO;

public class Ob_BoardServiceImpl implements IOb_BoardService{
	
	private static IOb_BoardService service;
	private IOb_BoardDao dao;
	private Ob_BoardServiceImpl() {
		dao = Ob_BoardDaoImpl.getInstance();
	}
	public static IOb_BoardService getInstance() {
		if(service == null) service = new Ob_BoardServiceImpl();
		return service;
	}
	
	
	@Override
	public int obBoardInsert(Ob_BoardVO vo) {
		int flag = 0;
		try {
			flag = dao.obBoardInsert(vo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public List<Ob_BoardVO> obBoardSelectAll() {
		List<Ob_BoardVO> list = null;
		try {
			list = dao.obBoardSelectAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public Ob_BoardVO obBoardRead(int boardNum) {
		Ob_BoardVO vo = null;
		try {
			vo = dao.obBoardRead(boardNum);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;
	}
	
	@Override
	public int obBoardNowNum(String observernum) {
		int num = 0;
		try {
			num = dao.obBoardNowNum(observernum);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return num;
	}
	
	@Override
	public String obMeetingInsert(Ob_BoardVO vo) {
		String memId = null;
		try {
			memId = dao.obMeetingInsert(vo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return memId;
	}
	
	@Override
	public String obMeetingCheck(Ob_BoardVO vo) {
		String memId = null;
		try {
			memId = dao.obMeetingCheck(vo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return memId;
	}
	
	@Override
	public int obBoardCount() {
		int num = 0;
		try {
			num = dao.obBoardCount();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return num;
	}
	


}
