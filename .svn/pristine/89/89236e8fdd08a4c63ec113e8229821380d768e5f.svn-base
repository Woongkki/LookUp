package kr.or.ddit.schedule.service;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.schedule.vo.ScheVO;


public interface IScheduleService {
	
	public String insertSchedule(ScheVO vo);
	
	public List<ScheVO> allSchedule();
	
	public int deleteSchedule(ScheVO vo);
	
	public int updateSchedule(ScheVO vo);

	public List<ScheVO> allMemSchedule(ScheVO vo);
	
	public String insertMemSchedule(ScheVO vo); // 마이페이지 달력에서 수동으로 일정추가
	
	public String addMemSchedule(ScheVO vo); // 전체 일정에서 일정 추가버튼으로 일정추가
	
	public int deleteMemSchedule(ScheVO vo);
	
	public int updateMemSchedule(ScheVO vo);
}
