<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Hotel Form</title>
<!-- <link rel="stylesheet" href="styles/productaddformstyle.css"> -->


<script type="text/javascript" src="scripts/hoteladdvalidation.js"></script>
</head>
<body>

<%@ include file="header.html" %>

<h2>${addhotelerror}</h2>
<div class="hotelcontainer">


<form name="addForm" action="addhotel"  method="post" onsubmit="return validateHotelForm()">   




<label for="hnm">Hotel Name:</label>
<input type="text" name="name" id="hnm" placeholder="Enter hotel name">

<label for="hwb">Website:</label>
<input type="text" name="website" id="hwb" placeholder="Enter hotel website">


<label for="pno">Phone no:</label>
<input type="number" name="phoneno" id="pno" placeholder="Enter hotel phoneNo">

<label for="email">Email id:</label>
<input type="text" name="emailid" id="email" placeholder="Enter email id of hotel">

<label for="addr">Address:</label>
<input type="text" name="address" id="addr" placeholder="Enter address of hotel">

<label for="cntr">Countrycode:</label>
<input type="number" name="countrycode" id="cntr" placeholder="Enter countrycode of hotel">


<label for="con">Country:</label>
<input type="text" name="country" id="con" placeholder="Enter country of hotel">

<label for="stat">State:</label>
<input type="text" name="state" id="stat" placeholder="Enter state of hotel">

<label for="cit">City:</label>
<input type="text" name="city" id="cit" placeholder="Enter city of hotel">

<label for="zp">Zip:</label>
<input type="number" name="zip" id="zp" placeholder="Enter zip of hotel">


<label for="hpht">Hotel Photo:</label>
<input type="image" name="hotelphoto" id="hpht" placeholder="Add photo of hotel">


<input type="submit" value="submit">
<input type="reset">

</form>
</div>

</body>
</html>








