package kr.or.ddit.memList.vo;

public class MemListVO {
	
	private String mem_id;		// 회원아이디
	private String mem_addr1;	// 회원주소
	private String mem_addr2;	// 회원주소
	private int mem_tel;		// 회원 전화번호
	private String mem_name;	// 회원이름
	private String mem_addr3;
	private String mem_nickname;
	
	public String getMem_addr1() {
		return mem_addr1;
	}
	public void setMem_addr1(String mem_addr1) {
		this.mem_addr1 = mem_addr1;
	}
	public String getMem_nickname() {
		return mem_nickname;
	}
	public void setMem_nickname(String mem_nickname) {
		this.mem_nickname = mem_nickname;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getMem_addr2() {
		return mem_addr2;
	}
	public void setMem_addr2(String mem_addr2) {
		this.mem_addr2 = mem_addr2;
	}
	
	public String getMem_addr3() {
		return mem_addr3;
	}
	public void setMem_addr3(String mem_addr3) {
		this.mem_addr3 = mem_addr3;
	}
	public int getMem_tel() {
		return mem_tel;
	}
	public void setMem_tel(int mem_tel) {
		this.mem_tel = mem_tel;
	}
	public String getMem_name() {
		return mem_name;
	}
	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}

	
}
