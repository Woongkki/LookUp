package kr.or.ddit.notice.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.or.ddit.notice.dao.INoticeDao;
import kr.or.ddit.notice.dao.NoticeDaoImpl;
import kr.or.ddit.notice.vo.NoticeVO;

public class NoticeServiceImpl implements INoticeService{
	private INoticeDao dao;
	private static INoticeService service;
	private NoticeServiceImpl() {
		dao = NoticeDaoImpl.getInstance();
	}
	
	public static INoticeService getInstance() {
		if(service==null) service = new NoticeServiceImpl();
		return service;
	}

	@Override
	public List<NoticeVO> selectNoticeList(Map<String, Object> map) {
		List<NoticeVO> list = null;
		System.out.println("서비스 통과");
		try {
			list = dao.selectNoticeList(map);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public NoticeVO noticeDetail(int no) {
		NoticeVO vo = null;
		try {
			vo = dao.noticeDetail(no);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;
	}

	@Override
	public int deleteNotice(int no) {
		int cnt = 0;
		try {
			cnt = dao.deleteNotice(no);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int updateNotice(NoticeVO vo) {
		int cnt = 0;
		try {
			cnt = dao.updateNotice(vo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int insertNotice(NoticeVO vo) {
		int cnt = 0;
		try {
			cnt = dao.insertNotice(vo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int totalCount(Map<String, Object> map) {
		int cnt = 0;
		try {
			cnt = dao.totalCount(map);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

}
