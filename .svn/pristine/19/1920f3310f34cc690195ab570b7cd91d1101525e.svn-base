package kr.or.ddit.member.service;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.member.dao.IMemberDao;
import kr.or.ddit.member.dao.IObserveDao;
import kr.or.ddit.member.dao.MemberDaoImpl;
import kr.or.ddit.member.dao.ObserveDaoImpl;
import kr.or.ddit.member.vo.ObserveVO;

public class ObserveServiceImpl implements IObserveService{
	private static IObserveService service;
	private IObserveDao dao;
	private ObserveServiceImpl() {
		dao=ObserveDaoImpl.getInstance();
	}
	public static IObserveService getInstance() {
		if(service==null)service=new ObserveServiceImpl();
		return service;
	}
	@Override
	public List<ObserveVO> oblist(String id) {
		List<ObserveVO>list=null;
		try {
			list=dao.oblist(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
