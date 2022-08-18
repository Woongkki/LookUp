package kr.or.ddit.objectBoard.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import kr.or.ddit.objectBoard.dao.IObjectDao;
import kr.or.ddit.objectBoard.dao.ObjectDaoImpl;
import kr.or.ddit.objectBoard.vo.ObjectVO;

public class ObjectServiceImpl implements IObjectService {
	
	private IObjectDao dao;
	private static IObjectService service;
	
	// 생성자
	private ObjectServiceImpl() {
		dao = ObjectDaoImpl.getInstance();
	}
	
	public static IObjectService getInstance() {
		if(service == null) service = new ObjectServiceImpl();
		return service;
	}

	@Override
	public List<ObjectVO> selectOb() {
		System.out.println("서비스통과");
		List<ObjectVO> listOb = null;
		
		try {
			listOb = dao.selectOb();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listOb;
	}

	@Override
	public int totalOb() {
		int count = 0;
		
		try {
			count = dao.totalOb();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public String insertOb(ObjectVO vo){
		String res = "a";
		try {
			res = dao.insertOb(vo);
			
			if(res == null) {
				res = "성공";
			}else {
				res = "실패";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}

}
