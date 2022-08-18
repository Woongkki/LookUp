package kr.or.ddit.member.vo;



public class RecentSearchVO implements Comparable<RecentSearchVO>{
private int ob_no      ;
private String mem_id     ;
private int free_no    ;
private String create_date;
private int object_no;
public int getOb_no() {
	return ob_no;
}
public void setOb_no(int ob_no) {
	this.ob_no = ob_no;
}
public int getObject_no() {
	return object_no;
}
public void setObject_no(int object_no) {
	this.object_no = object_no;
}

@Override
public String toString() {
	return "RecentSearchVO [ob_no=" + ob_no + ", mem_id=" + mem_id + ", free_no=" + free_no + ", create_date="
			+ create_date + ", object_no=" + object_no + "]";
}
public String getMem_id() {
	return mem_id;
}
public void setMem_id(String mem_id) {
	this.mem_id = mem_id;
}
public int getFree_no() {
	return free_no;
}
public void setFree_no(int free_no) {
	this.free_no = free_no;
}
public String getCreate_date() {
	return create_date;
}
public void setCreate_date(String create_date) {
	this.create_date = create_date;
}
@Override
public int compareTo(RecentSearchVO o) {
	
	return create_date.compareTo(o.getCreate_date())*-1;
}
}
