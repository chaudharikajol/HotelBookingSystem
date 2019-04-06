package com.fujitsu.services;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fujitsu.exceptions.ServiceException;
import com.fujitsu.hotels.Hotel;
import com.fujitsu.hotels.HotelDAO;

/*
 * Author:Kajol Chaudhari
 * Creation Date:05/04/2019 (DD/MM/YYYY)
 * Modification Date:05/04/2019 (DD/MM/YYYY)
 * Version:1.0
 * Copyright:Fujitsu Consulting India Pvt.Ltd.
 * 			 All rights reserved.
 * Description:Service Component Interface 
 * 			   Implementor Class of 
 * 			   Bussiness Layer 
 * 
 */

@Service
public class HotelServiceImpl implements HotelService{
	
	@Autowired
	private HotelDAO hotelDao;
	
	@Override
	public List<Hotel> findAllHotels() throws ServiceException {
		// TODO Auto-generated method stub
		return hotelDao.getAllHotels();
	}

	@Override
	public Hotel findById(int hotelId) throws ServiceException {
		// TODO Auto-generated method stub
		return hotelDao.getHotelById(hotelId);

	}

	@Override
	public void add(Hotel hotel) throws ServiceException {
		// TODO Auto-generated method stub
		hotelDao.insert(hotel);

	}

	@Override
	public void update(Hotel hotel) throws ServiceException {
		// TODO Auto-generated method stub
		hotelDao.update(hotel);

	}

	@Override
	public void remove(Hotel hotel) throws ServiceException {
		// TODO Auto-generated method stub
		hotelDao.delete(hotel);

	}

	@Override
	public List<Hotel> sortHotelsById() throws ServiceException {
		// TODO Auto-generated method stub
		return findAllHotels().stream().sorted().collect(Collectors.toList()); //sorted method will look for comparable method in product
	}

	@Override
	public List<Hotel> sortHotelsByName() throws ServiceException {
		// TODO Auto-generated method stub
		return findAllHotels().stream().sorted((p1,p2)->p1.getHotelName().compareTo(p2.getHotelName())).collect(Collectors.toList()); 

	}

	
	@Override
	public List<Hotel> sortHotelsByState(String state) throws ServiceException {
		// TODO Auto-generated method stub
		return findAllHotels().stream().filter(p->p.getState().equals(state)).collect(Collectors.toList());

	}

	@Override
	public List<Hotel> sortHotelsByCity(String city) throws ServiceException {
		// TODO Auto-generated method stub
		return findAllHotels().stream().filter(p->p.getCity().equals(city)).collect(Collectors.toList());
	}

}
