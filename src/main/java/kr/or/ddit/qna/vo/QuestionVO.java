package kr.or.ddit.qna.vo;

public class QuestionVO {
	private int question_no;
	private String question_room_no;
	private String mem_id;
	private int detail_no;
	private String question_q;
	private String question_a;
	private String question_date;
	
	private String detail_name;
	private String manager_id;
	
	public String getManager_id() {
		return manager_id;
	}
	public void setManager_id(String manager_id) {
		this.manager_id = manager_id;
	}
	public String getDetail_name() {
		return detail_name;
	}
	public void setDetail_name(String detail_name) {
		this.detail_name = detail_name;
	}
	public int getQuestion_no() {
		return question_no;
	}
	public void setQuestion_no(int question_no) {
		this.question_no = question_no;
	}
	public String getQuestion_room_no() {
		return question_room_no;
	}
	public void setQuestion_room_no(String question_room_no) {
		this.question_room_no = question_room_no;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public int getDetail_no() {
		return detail_no;
	}
	public void setDetail_no(int detail_no) {
		this.detail_no = detail_no;
	}
	public String getQuestion_q() {
		return question_q;
	}
	public void setQuestion_q(String question_q) {
		this.question_q = question_q;
	}
	public String getQuestion_a() {
		return question_a;
	}
	public void setQuestion_a(String question_a) {
		this.question_a = question_a;
	}
	public String getQuestion_date() {
		return question_date;
	}
	public void setQuestion_date(String question_date) {
		this.question_date = question_date;
	}
	
}
