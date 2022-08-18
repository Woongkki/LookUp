package kr.or.ddit.memList.service;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.memList.dao.IMemListDao;
import kr.or.ddit.memList.dao.MemListDaoImpl;
import kr.or.ddit.memList.vo.MemListVO;

public class MemListServiceImpl implements IMemListService {
	
	private IMemListDao dao;
	private static IMemListService service;
	
	public MemListServiceImpl() {
		dao = MemListDaoImpl.getInstance();
	}
	
	public static IMemListService getInstance() {
		if(service == null) service = new MemListServiceImpl();
		return service;
	}

	@Override
	public List<MemListVO> selectMemList() {
		List<MemListVO> list = null;
		
		try {
			list = dao.selectMemList();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
