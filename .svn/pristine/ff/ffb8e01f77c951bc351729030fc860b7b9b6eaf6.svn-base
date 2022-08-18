package kr.or.ddit.observers.service;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.observers.dao.IObserversDao;
import kr.or.ddit.observers.dao.ObserversDaoImpl;
import kr.or.ddit.observers.vo.ObserversVO;
import kr.or.ddit.util.SqlMapClientFactory;

public class ObserversServiceImpl implements IObserversService {
	
	private IObserversDao dao;
	private static IObserversService service;
	private ObserversServiceImpl() {
		dao = ObserversDaoImpl.getInstance();
	}
	public static IObserversService getInstance() {
		if(service == null) service = new ObserversServiceImpl();
		return service;
	}
	
	
	@Override
	public void insertOb(ObserversVO vo) {
		try {
			dao.insertOb(vo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<ObserversVO> selectOb() {
		List<ObserversVO> vo = null;
		try {
			vo = dao.selectOb();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}

}
