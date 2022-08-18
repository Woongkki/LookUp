package kr.or.ddit.board.vo;

public class FreeCommentVO {
private int comment_no  ;
private int free_no     ;
private String mem_id      ;
private String content     ;
private String create_date ;
private String update_date ;
private String mem_photo   ;
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
public String getUpadte_date() {
	return update_date;
}
public void setUpadte_date(String upadte_date) {
	this.update_date = upadte_date;
}
public String getMem_photo() {
	return mem_photo;
}
public void setMem_photo(String mem_photo) {
	this.mem_photo = mem_photo;
}
}
