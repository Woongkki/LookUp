package kr.or.ddit.member.vo;

public class RcBoardViewVO {
private String mem_id     ;
private String title     ;
private String content    ;
private String create_date;
private String update_date;
private String photo_path ;


public String getMem_id() {
	return mem_id;
}
public void setMem_id(String mem_id) {
	this.mem_id = mem_id;
}
public String getTittle() {
	return title;
}
public void setTittle(String tittle) {
	this.title = title;
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
public String getUpdate_date() {
	return update_date;
}
public void setUpdate_date(String update_date) {
	this.update_date = update_date;
}
public String getPhoto_path() {
	return photo_path;
}
public void setPhoto_path(String photo_path) {
	this.photo_path = photo_path;
}
}
