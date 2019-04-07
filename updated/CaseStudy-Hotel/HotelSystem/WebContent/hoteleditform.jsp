<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hotel Edit form</title>

<!-- <link rel="stylesheet" href="styles/productaddformstyle.css"> -->
<script type="text/javascript" src="scripts/hoteladdvalidation.js"></script>

</head>
<h2>${addhotelerror}</h2>

<div class="hotelcontainer">
<form name="addForm" action="edithotel"  method="post" onsubmit="return validateHotelForm()"> 

<label for="hid">Hotel Id:</label>
<input type="number" name="productId" id="hid" value="${param.hotelId}" readonly>


<label for="hnm">Hotel Name:</label>
<input type="text" name="name" id="hnm" value="${param.hotelName}">

<label for="hwb">Website:</label>
<input type="text" name="website" id="hwb" value="${param.website }">


<label for="pno">Phone no:</label>
<input type="number" name="phoneno" id="pno" value="${param.phoneNo}">

<label for="email">Email id:</label>
<input type="text" name="emailid" id="email" value="${param.emailId}">

<label for="addr">Address:</label>
<input type="text" name="address" id="addr" value="${param.address}">

<label for="cntr">Countrycode:</label>
<input type="number" name="countrycode" id="cntr" value="${param.countrycode }">


<label for="con">Country:</label>
<input type="text" name="country" id="con" value="${param.country}">

<label for="stat">State:</label>
<input type="text" name="state" id="stat" value="${param.state}">

<label for="cit">City:</label>
<input type="text" name="city" id="cit" value="${param.city }">

<label for="zp">Zip:</label>
<input type="number" name="zip" id="zp" value="${param.zip }">


<label for="hpht">Hotel Photo:</label>
<input type="image" name="hotelphoto" id="hpht" value="${param.hotelPhoto}">

<input type="submit" value="Edit" style="background-color: orange;">
<input type="reset">

<body>








</body>
</html>


