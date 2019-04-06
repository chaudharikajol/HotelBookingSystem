package com.fujitsu.hotels;

import java.util.List;
/*
 * Author:Kajol Chaudhari
 * Creation Date:03/04/2019 (DD/MM/YYYY)
 * Modification Date:04/04/2019 (DD/MM/YYYY)
 * Version:1.0
 * Description:It represents DAO  Component Interface 
 * 			   of Persistent Layer 
 * Copyright:Fujitsu Consulting India Pvt.Ltd.All rights reserved.
 */

// DAO Interface-DAO Design Pattern


public interface HotelDAO {
	
	//CRUD
	List<Hotel> getAllHotels(); 
	
	/*List<Hotel> getHotelsByName(String hotelName);
	List<Hotel> getHotelsByCountry(String country);
	List<Hotel> getHotelsByState(String state);
	List<Hotel> getHotelsByCity(String city);*/

	Hotel getHotelById(int hotelId);
	
	void insert(Hotel hotel);
	void update(Hotel hotel);
	void delete(Hotel hotel);

}
