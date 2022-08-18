/**
 * 
 */
 
// 관측회 저장 메서드
var insertObj = function(){
	alert("js확인")
	$.ajax({
		url : '/middleProject/observersServlet.do',
		type : 'post',
		data : dataOb,
		success : function(res){
			alert("관측회 데이터 저장 성공!")
			// 리스트로 돌아가기
		},
		error : function(xhr){
			alert("insert 상태 : " + xhr.status)
		},
		dataType : 'json'
	})
}

// 관측회 목록 출력 메서드
var observerList = function(){
	$.ajax({
		url : '/middleProject/observersServlet.do',
		type : 'post',
		data : {"check" : 2},
		success : function(res){
			str = "<table border='1'><tr>";
			str += "<th>관측회 번호</th>";
			str += "<th>시작 날짜</th>";
			str += "<th>종료 날짜</th>";
			str += "<th>지역</th>";
			$.each(res, function(i, v){
				str += "<tr class='observersList'><td>" + v.ob_num + "</td>";
				str += "<td>" + v.ob_start + "</td>";
				str += "<td>" + v.ob_end + "</td>";
				str += "<td>" + v.ob_position + "</td></tr>";
			})
			str += "</table>";
			$('.modal-body').html(str);
		},
		error : function(xhr){
			alert("관측회 목록 출력 오류 : " + xhr.status);
		},
		dataType : 'json'
	})
}

// 관측회 목록 출력 메서드 최종
var observerListLast = function(){
	$.ajax({
		url : '/middleProject/observersServlet.do',
		type : 'post',
		data : {"check" : 2},
		success : function(res){
			str = "<div class='container'>";
			str += "<table class='table'>";
			str += "<thead class='thead-dark'><tr>";
			str += "<th>관측회 번호</th>";
			str += "<th>시작 날짜</th>";
			str += "<th>종료 날짜</th>";
			str += "<th>지역</th></tr></thead><tbody>";
			$.each(res, function(i, v){
				str += "<tr class='observersList'><td>" + v.ob_num + "</td>";
				str += "<td>" + v.ob_start + "</td>";
				str += "<td>" + v.ob_end + "</td>";
				str += "<td>" + v.ob_position + "</td></tr>";
			})
			str += "<tbody></table></div>";
			$('.modal-body').html(str);
		},
		error : function(xhr){
			alert("관측회 목록 출력 오류 : " + xhr.status);
		},
		dataType : 'json'
	})
}








// 관측회 게시글 저장 메서드
var obBoardInsert = function(){
	$.ajax({
			url : '/middleProject/observersServlet.do',
			type : 'post',
			data : ObjInsert,
			success : function(res){
				alert("관측회 게시판 글 등록에 성공했습니다.!")
			},
			error : function(xhr){
				alert("관측회 게시글 저장 오류 : " + xhr.status);
			},
			dataType : 'json'
		})
}

// 관측회 신청을 눌렀을 때 처리
var obApplication = function(){
	$.ajax({
			url : '/middleProject/observersServlet.do',
			type : 'post',
			data : ObInfo,
			success : function(res){
				str = "신청이 완료되었습니다! <br>";
				str += "신청 번호는 " + res + "입니다.";
				$('#appResult').html(str);
			},
			error: function(xhr){
				alert("관측회 신청 오류 : " + xhr.status);
			},
			dataType: 'json'
		})
}

// 관측회 신청 중복 확인
var obMeetingCheck = function(){
	$.ajax({
		url : '/middleProject/observersServlet.do',
			type : 'post',
			async : false, // 동기화 시키는 명령어, ajax가 모두 실행될 동안 다른 함수가 수행되는 것을 중지
			data : ObInfo,
			success : function(res){
				str = '';
				if(res == null){
					str += '성공';
					$('#appResult').text(str);
				}else{
					str += res + '에 이미 신청하셨습니다.'
					$('#appResult').text(str);
				}
			},
			error: function(xhr){
				alert("관측회 중복 신청 오류 : " + xhr.status);
			},
			dataType: 'json'
	})
}

// 관측회 게시글 상세 조회 메서드 -> get 방식으로 변경
//var obBoardRead = function(boardNum){
//	$.ajax({
//		url : '/MemberWeb/observersServlet.do',
//		type : 'post',
//		data : {"boardNum" : boardNum,
//				"check" : 13},
//		success : function(res){
//			alert("넘기기 성공 : " + res);
//			$("body").html(res);
//		},
//		error : function(xhr){
//			alert("게시글 상세 조회 오류 :" + xhr.status);
//		},
//		dataType : 'html'
//	})
//}

