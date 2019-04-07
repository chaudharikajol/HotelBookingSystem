<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hotels</title>
</head>
<body>

<%@ include file="header.html" %>


	<table>
		<tr>
			<th>hotelId</th>
			<th>hotelName</th>
			<th>Website</th>
			<th>Rating</th>
			<th>Review</th>
			<th>phoneNo</th>
			<th>emailId</th>
			<th>Address</th>
			<th>Countrycode</th>
			<th>City</th>
			<th>State</th>
			<th>Country</th>
			<th>Zip</th>
			<th>hotelPhoto</th>
			
			
		</tr>

		<c:forEach var="p" items="${sessionScope.hotelList}">

			<tr>
				<td>${p.hotelId}</td>
				<td>${p.hotelname}</td>
				<td>${p.website}</td>
				<td>${p.rating}</td>
				<td>${p.review}</td>
				<td>${p.phoneNo}</td>
				<td>${p.emailId}</td>
				<td>${p.countrycode}</td>
				<td>${p.city}</td>
				<td>${p.state}</td>
				<td>${p.country}</td>
				<td>${p.zip}</td>
				<td>${p.hotelPhoto}</td>
				
				
				

<td>   <a href="edit?hotelId=${p.hotelId}&hotelname=${p.hotelname}&website=${p.website}&rating=${p.rating}&review=${p.review}&phoneNo=${p.phoneNo}&emailId=${p.emailId}
&countrycode=${p.countrycode}&city=${p.city}&state=${p.state}&country=${p.country}&zip=${p.zip}&hotelPhoto=${p.hotelPhoto}">Edit</a></td>


<td>   <a href="delete?hotelId=${p.hotelId}&hotelname=${p.hotelname}&website=${p.website}&rating=${p.rating}&review=${p.review}&phoneNo=${p.phoneNo}&emailId=${p.emailId}
&countrycode=${p.countrycode}&city=${p.city}&state=${p.state}&country=${p.country}&zip=${p.zip}&hotelPhoto=${p.hotelPhoto}">Delete</a></td>



			</tr>

		</c:forEach>

	</table>






</body>
</html>










