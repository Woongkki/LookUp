package kr.or.ddit.qna.service;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.qna.dao.IQuesDao;
import kr.or.ddit.qna.dao.QuesDaoImpl;
import kr.or.ddit.qna.vo.QuestionVO;

public class QuesServiceImpl implements IQuesService{
	private IQuesDao dao;
	private static IQuesService service;
	private QuesServiceImpl() {
		dao = QuesDaoImpl.getInstance();
	}
	
	public static IQuesService getInstance() {
		if(service==null) service = new QuesServiceImpl();
		return service;
	}

	@Override
	public List<QuestionVO> selectQuesList(String id) {
		List<QuestionVO> list = null;
		try {
			list = dao.selectQuesList(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<QuestionVO> quesDatail(String no) {
		List<QuestionVO> list = null;
		try {
			list = dao.quesDatail(no);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int quesDelete(int no) {
		int cnt = 0;
		try {
			cnt = dao.quesDelete(no);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int answerInsert(QuestionVO vo) {
		int cnt = 0;
		try {
			cnt = dao.answerInsert(vo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int quesInsert(QuestionVO vo) {
		System.out.println("서비스 통과");
		System.out.println(vo);
		int cnt = 0;
		try {
			cnt = dao.quesInsert(vo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int seqInsert(QuestionVO vo) {
		int cnt = 0;
		try {
			cnt = dao.seqInsert(vo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public List<QuestionVO> selectQuesList2() {
		List<QuestionVO> list = null;
		try {
			list = dao.selectQuesList2();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
