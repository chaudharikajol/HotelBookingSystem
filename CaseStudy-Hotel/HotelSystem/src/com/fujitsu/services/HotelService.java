package com.fujitsu.services;

import java.util.List;

import com.fujitsu.exceptions.ServiceException;
import com.fujitsu.hotels.Hotel;

/*
 * Author:Kajol Chaudhari
 * Creation Date:05/04/2019 (DD/MM/YYYY)
 * Modification Date:05/04/2019 (DD/MM/YYYY)
 * Version:1.0
 * Copyright:Fujitsu Consulting India Pvt.Ltd.All rights reserved.
 * Description:Service Component Interface of Bussiness Layer 
 * 
 */

public interface HotelService {

	List<Hotel> findAllHotels() throws ServiceException;
	Hotel findById(int hotelId)throws ServiceException;
	void add(Hotel hotel)throws ServiceException;
	void update(Hotel hotel)throws ServiceException;
	void remove(Hotel hotel)throws ServiceException;
	
	List<Hotel> sortHotelsById() throws ServiceException;
	List<Hotel> sortHotelsByName() throws ServiceException;
	List<Hotel> sortHotelsByState(String state)throws ServiceException;
	List<Hotel> sortHotelsByCity(String city)throws ServiceException;

}
