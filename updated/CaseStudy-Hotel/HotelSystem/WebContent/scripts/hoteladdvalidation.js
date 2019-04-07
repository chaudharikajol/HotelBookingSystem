function validateHotelForm() {
	
	var pHotelName=document.getElementById("hnm").value;
	
	var pWebsite=document.getElementById("hwb").value;
	
	var pPhoneNo=document.getElementById("pno").value;
	
	var pEmailId=document.getElementById("email").value;
	
	var pAddress=document.getElementById("addr").value;
	
	var pCountrycode=document.getElementById("cntr").value;
	
	var pCountry=document.getElementById("con").value;
	
	var pState=document.getElementById("stat").value;
	
	var pCity=document.getElementById("cit").value;
	
	var pZip=document.getElementById("zp").value;
	
	var pHotelPhoto=document.getElementById("hpht").value;
	
	
	if(pHotelName==null|| pHotelName==""){
		window.alert("hotel name can not be empty");

		return false;
	}

	if(pWebsite==null|| pWebsite==""){
		window.alert("hotel website can not be empty");

		return false;
	}

	if(pPhoneNo==null|| pPhoneNo==""){
		window.alert("hotel phoneno can not be empty");

		return false;
	}
	
	if(pEmailId==null|| pEmailId==""){
		window.alert("hotel emailid can not be empty");

		return false;
	}
	
	if(pAddress==null|| pAddress==""){
		window.alert("hotel address can not be empty");

		return false;
	}
	
	if(pCountrycode==null|| pCountrycode==""){
		window.alert("hotel countrycode can not be empty");

		return false;
	}
	
	if(pCountry==null|| pCountry==""){
		window.alert("hotel country can not be empty");

		return false;
	}
	
	if(pState==null|| pState==""){
		window.alert("hotel state can not be empty");

		return false;
	}
	
	if(pCity==null|| pCity==""){
		window.alert("hotel city can not be empty");

		return false;
	}
	
	if(pZip==null|| pZip==""){
		window.alert("hotel zip can not be empty");

		return false;
	}
	return true;
}
	
