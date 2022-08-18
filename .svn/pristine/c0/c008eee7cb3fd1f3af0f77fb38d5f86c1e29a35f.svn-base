package kr.or.ddit.map.service;

import java.sql.SQLException;

import kr.or.ddit.map.dao.IObservatoryDao;
import kr.or.ddit.map.dao.ObservatoryDaoImpl;
import kr.or.ddit.map.vo.ObservatoryVO;


public class ObservatoryServiceImpl implements IObservatoryService {

	private IObservatoryDao dao;
	private static IObservatoryService service;
	
	private ObservatoryServiceImpl() {
		dao = ObservatoryDaoImpl.getInstance(); 
	}
	
	public static IObservatoryService getInstance() {
		if(service == null) service = new ObservatoryServiceImpl();
		return service;
	}
	
	@Override
	public ObservatoryVO selectObservatory(String name) {
		ObservatoryVO vo = null;
		try {
			vo = dao.selectObservatory(name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vo;
	}
	
}
