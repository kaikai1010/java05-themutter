function registerSubmitCheck() {

	var msg = "";
	if(document.forms[0].elements[0].value == "") {
		msg += "Enter your User ID,  ";
	}
	if(document.forms[0].elements[1].value == "") {
		msg += "Enter your Email,  ";
	}
	if(document.forms[0].elements[2].value == "") {
		msg += "Enter your Password,  ";
	}

	if(msg != "") {
		msg += "please.";
		window.alert(msg);
		return false;
	} else {
		return true;
	}

}

function loginSubmitCheck() {

	var msg = "";
	if(document.forms[0].elements[0].value == "") {
		msg += "Enter your User ID,  ";
	}
	if(document.forms[0].elements[1].value == "") {
		msg += "Enter your Password,  ";
	}

	if(msg != "") {
		msg += "please.";
		window.alert(msg);
		return false;
	} else {
		return true;
	}

}

function userInfoChangeSubmitCheck() {

	var msg = "";
	if(document.forms[0].elements[0].value == "") {
		msg += "Enter your Email,  ";
	}
	if(document.forms[0].elements[1].value == "") {
		msg += "Enter your Password,  ";
	}

	if(msg != "") {
		msg += "please.";
		window.alert(msg);
		return false;
	} else {
		return true;
	}
}

function logoutConfirm() {

	if(window.confirm('Are you really sure?')) {
		location.href = "/themutter/LogoutServ";
		return true;
	}
	else {
		return false;
	}
}

function userInfoQuitConfirm() {

	if(window.confirm('Are you really sure?')) {
		location.href = "/themutter/UserInfoQuitServ";
		return true;
	}
	else {
		return false;
	}
}