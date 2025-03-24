function check_ok(){
	if(reg_frm.mem_uid.value ==""){
		alert("아이디를 써주세요");
		reg_frm.mem_uid.focus();
		return;
	}
	if(reg_frm.mem_uid.value.length < 4){
		alert("아이디는 4글자이상이어야 합니다.");
		reg_frm.mem_uid.focus();
		return;
	}
	if(reg_frm.mem_pwd.value.length == 0){
		alert("패스워드는 반드시 입력해야 합니다.");
		reg_frm.mem_pwd.focus();
		return;
	}
	if(reg_frm.mem_pwd.value != reg_frm.chk_pw.value){
		alert("패스워드가 일치하지 않습니다.");
		reg_frm.chk_pw.focus();
		return;
	}
	if(reg_frm.mem_name.value.length == 0){
		alert("이름을  써주세요.");
		reg_frm.mem_name.focus();
		return;
	}
	if(reg_frm.mem_email.value.length == 0){
		alert("Email을  써주세요.")
		reg_frm.mem_email.focus();
		return;
	}
//	button의 속성을 submit으로 변환
	document.reg_frm.submit();
}

function update_check_ok(){
	if(upd_frm.mem_pwd.value.length == 0){
		alert("패스워드는 반드시 입력해야 합니다.");
		upd_frm.mem_pwd.focus();
		return;
	}
	if(upd_frm.mem_pwd.value != upd_frm.chk_pw.value){
		alert("패스워드가 일치하지 않습니다.");
		upd_frm.chk_pw.focus();
		return;
	}
	if(upd_frm.mem_email.value.length == 0){
		alert("Email을  써주세요.")
		upd_frm.mem_email.focus();
		return;
	}
	upd_frm.submit();
}
