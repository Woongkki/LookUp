package kr.or.ddit.board.vo;

public class FreeComentInVO {
private int comment_no   ;
private int free_no      ;
private String mem_id       ;
private String content      ;
private String create_date  ;
public int getComment_no() {
	return comment_no;
}
public void setComment_no(int comment_no) {
	this.comment_no = comment_no;
}
public int getFree_no() {
	return free_no;
}
public void setFree_no(int free_no) {
	this.free_no = free_no;
}
public String getMem_id() {
	return mem_id;
}
public void setMem_id(String mem_id) {
	this.mem_id = mem_id;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public String getCreate_date() {
	return create_date;
}
public void setCreate_date(String create_date) {
	this.create_date = create_date;
}

}
