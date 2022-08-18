package kr.or.ddit.observers.service;

import java.util.List;

import kr.or.ddit.observers.vo.Ob_BoardVO;

public interface IOb_BoardService {

	// 관측 게시판 글 생성하기
	public int obBoardInsert(Ob_BoardVO vo);
	
	// 관측 게시판 글 목록 출력하기
	public List<Ob_BoardVO> obBoardSelectAll();
	
	// 관측 게시판 글 상세 조회
	public Ob_BoardVO obBoardRead(int boardNum);
	
	// 관측 게시판 총 글 개수
	public int obBoardCount();
	
	// 관측회 모집 현재 인원 조회
	public int obBoardNowNum(String observernum);
	
	// 관측회 참가 신청
	public String obMeetingInsert(Ob_BoardVO vo);
	
	// 관측회 중복 신청 체크
	public String obMeetingCheck(Ob_BoardVO vo);
}
