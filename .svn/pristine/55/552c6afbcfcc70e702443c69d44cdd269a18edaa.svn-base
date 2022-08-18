package kr.or.ddit.observers.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import kr.or.ddit.observers.service.IOb_BoardService;
import kr.or.ddit.observers.service.IObserversService;
import kr.or.ddit.observers.service.Ob_BoardServiceImpl;
import kr.or.ddit.observers.service.ObserversServiceImpl;
import kr.or.ddit.observers.vo.Ob_BoardVO;

@WebServlet("/observersServletGet.do")
public class ObserversServletGet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		int check = Integer.parseInt(request.getParameter("check"));
		System.out.println(check);
		IObserversService service = ObserversServiceImpl.getInstance();
		IOb_BoardService serviceBoard = Ob_BoardServiceImpl.getInstance();
		
		switch(check) {
		case 1: break;
		
		case 10: MainToOb_Board(request, response, serviceBoard); break; // 기타 화면에서 관측회 목록으로 이동
		case 11: Ob_BoardListToRead(request, response, serviceBoard); break; // 관측회 게시판 조회
	
		default :break;
		}
		
	}

	// 기타 화면에서 관측회 목록으로 이동
	private void MainToOb_Board(HttpServletRequest request, HttpServletResponse response, IOb_BoardService serviceBoard) throws ServletException, IOException {
		
		// 관측회 게시판 테이블 정보
		List<Ob_BoardVO> list = new ArrayList<Ob_BoardVO>(); 
		list = serviceBoard.obBoardSelectAll();
		request.setAttribute("boardList", list);
		
		// 관측회 게시판 총 글 개수
		int num = serviceBoard.obBoardCount();
		request.setAttribute("totalNum", num);
		
		// 관측회 게시판 글 마다 현재 신청인원 구하기
		
		
		request.getRequestDispatcher("/sum/board(관측회게시판_List).jsp").forward(request, response);
		
	}

	// 관측회 게시판 조회
	private void Ob_BoardListToRead(HttpServletRequest request, HttpServletResponse response,
			IOb_BoardService serviceBoard) throws ServletException, IOException {

		int boardNum = Integer.parseInt(request.getParameter("boardNum"));
		
		Ob_BoardVO vo = new Ob_BoardVO();
		
		vo = serviceBoard.obBoardRead(boardNum);
		
		request.setAttribute("boardInfo", vo);
		
		request.getRequestDispatcher("/sum/board(관측회글조회).jsp").forward(request, response);
		
	}


}
