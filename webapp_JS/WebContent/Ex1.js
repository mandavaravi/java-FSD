function fun1(){
	var id        = document.registration.ID.value;
	var pass      = document.registration.Password.value;
	var name      = document.registration.Name.value;
	var email     = document.registration.Email.value;
	var zip       = document.registration.Zip.value;
	
	var genders = document.getElementsByName("Gender");
	var selectedGender;
	for(var i = 0; i < genders.length; i++) {
	   if(genders[i].checked)
	       selectedGender = genders[i].value;
	 }
	
	var address   = document.registration.Address.value;
	var language  = document.registration.Language.value;
	var country   = document.registration.Country.value;
	var about     = document.registration.About.value;
	
	
	if(fun2(id,4,12)){
		if(fun2(pass,4,12)){
			if(allLetters(id)){
				Vcountry(country);
			}
		}
	}
	
	alert( id+ " \n" + pass+ "\n " +name +" \n" +email +"\n " +zip +"\n " +selectedGender +"\n " +address +"\n " +language +" \n" +country +"\n " +about);
	
}

function fun2(uid,mx,my){
	var uid_len = uid.length;
	if(uid_len > my || uid_len < mx || uid_len==0 ){
		alert("uid invalid");
		uid.focus();
		return false;
	}
	return true;
	
}


function allLetters(uid){
	var letters = /^[A-Za-z]+$/;
	if(uid.match(letters)){
		return true;
	}
	else{
		alert("uid must be only alphabets");
		uid.focus();
		return false;
	}
}


function Vcountry(c){
	if(c == "none"){
		alert("Select a country");
		c.focus();
		return false;
	}
	else{
		return true;
	}
}

function Vlanguage(c){
	if(c == "none"){
		alert("Select a language");
		c.focus();
		return false;
	}
	else{
		return true;
	}
}