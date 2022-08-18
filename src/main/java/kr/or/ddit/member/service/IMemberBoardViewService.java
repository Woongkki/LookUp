package kr.or.ddit.member.service;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import kr.or.ddit.member.vo.RcBoardViewVO;
import kr.or.ddit.member.vo.RcBoardViewVO2;
import kr.or.ddit.member.vo.RecentSearchVO;
import kr.or.ddit.member.vo.RecentSearchVO2;

public interface IMemberBoardViewService {
	public List<RecentSearchVO> freeboardDate(String memid);
	public List<RecentSearchVO> objectboardDate(String memid);
	public List<RecentSearchVO> obboardDate(String memid);
	public String search(String d);
	public RcBoardViewVO fboard(Map<String, String> para);
	public RcBoardViewVO objboard(Map<String, String> para); 
	public RcBoardViewVO obboard(Map<String, String> para);
	public List<RecentSearchVO2> freecommentdDate(String id);
	public List<RecentSearchVO2> objectcommentDate(String id);
	public RcBoardViewVO2 fcboard(Map<String, String> para);
	public RcBoardViewVO2 objcboard(Map<String, String> para); 
}
