package kr.or.ddit.notice.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import kr.or.ddit.notice.service.INoticeService;

public class Paging {
	//페이징하기        
    int totaldata; //데이타 총갯수 n개
    int perpage=5; //페이지 당 5개글 표시
    int totalpage; //총페이지 (totaldata/perpage) 
    int current; //현 페이지         
    int startnum; //페이지 글시작 
    int endnum; // 페이지 끝
    
    int block=3; // [1][2][3]다음:1~9, 이전[4]:10~
    int totalblock; // [1][2][3][4] (totalpage/block)
    int currentblock; //현 페이지 블락
    int startblock; //블럭 시작
    int endblock; //블럭 끝
    int prevblock; //이전
    int nextblock; //다음
    
    String type;
    String word;
    
    public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public int getTotaldata() {
        return totaldata;
    }
    public void setTotaldata(int totaldata) {
        this.totaldata = totaldata;
    }
    public int getPerpage() {
        return perpage;
    }
    public void setPerpage(int perpage) {
        this.perpage = perpage;
    }
    public int getTotalpage() {
        return totalpage;
    }
    public void setTotalpage(int totalpage) {
        this.totalpage = totalpage;
    }
    public int getCurrent() {
        return current;
    }
    public void setCurrent(int current) {
        this.current = current;
    }
    public int getStartnum() {
        return startnum;
    }
    public void setStartnum(int startnum) {
        this.startnum = startnum;
    }
    public int getEndnum() {
        return endnum;
    }
    public void setEndnum(int endnum) {
        this.endnum = endnum;
    }
    public int getBlock() {
        return block;
    }
    public void setBlock(int block) {
        this.block = block;
    }
    public int getTotalblock() {
        return totalblock;
    }
    public void setTotalblock(int totalblock) {
        this.totalblock = totalblock;
    }
    public int getCurrentblock() {
        return currentblock;
    }
    public void setCurrentblock(int currentblock) {
        this.currentblock = currentblock;
    }
    public int getStartblock() {
        return startblock;
    }
    public void setStartblock(int startblock) {
        this.startblock = startblock;
    }
    public int getEndblock() {
        return endblock;
    }
    public void setEndblock(int endblock) {
        this.endblock = endblock;
    }
    public int getPrevblock() {
        return prevblock;
    }
    public void setPrevblock(int prevblock) {
        this.prevblock = prevblock;
    }
    public int getNextblock() {
        return nextblock;
    }
    public void setNextblock(int nextblock) {
        this.nextblock = nextblock;
    }
    
    public Paging(INoticeService service,HttpServletRequest request){
    	type = request.getParameter("stype");////
	    word = request.getParameter("sword");////
	    
    	Map<String, Object> paramap = new HashMap<String, Object>();
		paramap.put("stype", type);////
		paramap.put("sword", word);////
    	
    	int data = service.totalCount(paramap);
        
        totaldata = data; //데이타 총갯수
        totalpage = (int)Math.ceil((double)totaldata/perpage); //총페이지
        totalblock = (int)Math.ceil((double)totalpage/block); //총블럭수
        
        if(request.getParameter("block")!=null)
            currentblock = Integer.parseInt(request.getParameter("block"));
        else
            currentblock = 1;
        //[1:현재블럭]블럭:1페이지시작   [2:현재블럭]블럭:4페이지시작   [3:현재블럭]블럭:7페이지시작
        //[[1p][2p][3p]]다음:1~9, 이전[4]:10~ block=3 
        startblock = (currentblock-1)*block+1; //각 블럭에서 시작되는 페이지
        
        //[끝블럭]:3페이지,6페이지,9페이지
        endblock = startblock+2; //각 블럭에서 끝나는 페이지
        if(endblock>totalpage) endblock = totalpage;
        
        //list.jsp에서 page변수에 user가 클릭한 page값을 담아줌
        if(request.getParameter("page")!=null)
            current = Integer.parseInt(request.getParameter("page"));
        else
            current = startblock; //현재페이지(startblock: 각 블럭의 첫번째 페이지)
        
        prevblock = currentblock-1; //이전블락
        nextblock = currentblock+1; //다음블락
        
        startnum = (perpage*current)-4; //각 페이지의 시작글
        endnum = (perpage*current); //각 페이지의 끝글
        if(endnum>totaldata) endnum = totaldata;
        
    }
}
