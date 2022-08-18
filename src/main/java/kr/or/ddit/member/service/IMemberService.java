package kr.or.ddit.member.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.member.vo.ZipVO;

public interface IMemberService {
	public int memberIdCheck(String id);
	
	public List<ZipVO>zipList(String s);
	
	public int insertMember(MemberVO vo);
	
	public int memlogin(Map<String,String>info);
	 
	public int logidCheck(String id);
	
	public MemberVO memberIdSearch(String id);
	
	public String memStatus(String memid);
	
	public List<ZipVO> zipAllSearch();

	public int updateMember(MemberVO memVo);
	
	public int nomalinsertMember(String memId);
	
	 public void loginlogCreate(Map<String,String>map);

	public int memStatusBUpdate(String id);

	public MemberVO login(Map<String, String> para);

	public int memstop(String id);

	
}
