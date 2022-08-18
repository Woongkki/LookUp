package kr.or.ddit.objectBoard.service;

import java.util.List;

import kr.or.ddit.objectBoard.vo.ObjectVO;

public interface IObjectService {
	public List<ObjectVO> selectOb();
	
	public int totalOb();
	
	public String insertOb(ObjectVO vo);
}
