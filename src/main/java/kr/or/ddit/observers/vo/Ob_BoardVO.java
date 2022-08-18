package kr.or.ddit.observers.vo;

public class Ob_BoardVO {
	private int ob_no; // 관측회 글 번호
	private String ob_num; // 관측회 번호
	private String mem_id; // 작성자
	private String title; // 제목
	private String content; // 내용
	private String update_date; // 업데이트 날짜
	private String ob_memnumber; // 관측회 최대 참석 인원
	private String obmeeting_no; // 관측회 테이블 번호

	
	public String getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}
	public String getObmeeting_no() {
		return obmeeting_no;
	}
	public void setObmeeting_no(String obmeeting_no) {
		this.obmeeting_no = obmeeting_no;
	}
	public String getOb_memnumber() {
		return ob_memnumber;
	}
	public void setOb_memnumber(String ob_memnumber) {
		this.ob_memnumber = ob_memnumber;
	}
	public int getOb_no() {
		return ob_no;
	}
	public void setOb_no(int ob_no) {
		this.ob_no = ob_no;
	}
	public String getOb_num() {
		return ob_num;
	}
	public void setOb_num(String ob_num) {
		this.ob_num = ob_num;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
