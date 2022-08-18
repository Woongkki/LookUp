package kr.or.ddit.qna.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import kr.or.ddit.qna.dao.IQnaDao;
import kr.or.ddit.qna.dao.QnaDaoImpl;
import kr.or.ddit.qna.vo.QnaVO;

public class QnaServiceImpl implements IQnaService{
	private IQnaDao dao;
	private static IQnaService service;
	private QnaServiceImpl() {
		dao = QnaDaoImpl.getInstance();
	}
	
	public static IQnaService getInstance() {
		if(service==null) service = new QnaServiceImpl();
		return service;
	}

	@Override
	public List<QnaVO> selectQnaList() {
		List<QnaVO> list = null;
		try {
			list = dao.selectQnaList();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public QnaVO qnaDetail(int no) {
		QnaVO vo = null;
		try {
			vo = dao.qnaDetail(no);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;
	}

	@Override
	public int deleteQna(int no) {
		int cnt = 0;
		try {
			cnt = dao.deleteQna(no);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int updateQna(QnaVO vo) {
		int cnt = 0;
		try {
			cnt = dao.updateQna(vo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int insertQna(QnaVO vo) {
		int cnt = 0;
		try {
			cnt = dao.insertQna(vo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int totalCount() {
		int cnt = 0;
		try {
			cnt = dao.totalCount();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

}
