package kr.or.ddit.member.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import kr.or.ddit.member.dao.BlockMemberDaoImpl;
import kr.or.ddit.member.dao.IBlockMemberDao;
import kr.or.ddit.member.dao.IMemberBoardViewDao;
import kr.or.ddit.member.dao.MemberBoardViewDaoImpl;

public class BlockMemberServiceImpl implements IBlockMemberService{
	private static IBlockMemberService service;
	private IBlockMemberDao dao;
	private BlockMemberServiceImpl() {
		dao=BlockMemberDaoImpl.getInstance();
	}
	public static IBlockMemberService getInstance() {
		if(service==null)service=new BlockMemberServiceImpl();
		return service;
	}
	@Override
	public List<String> blacklist(String id) {
		List<String>list=null;
		try {
			list=dao.blacklist(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public int blockCancele(Map<String, String> para) {
		int cnt=0;
		try {
			cnt=dao.blockCancele(para);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;
	}

	
	
	
}
