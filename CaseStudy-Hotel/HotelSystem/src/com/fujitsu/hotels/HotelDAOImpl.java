package com.fujitsu.hotels;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

/*
 * Author:Kajol Chaudhari
 * Creation Date:04/04/2019 (DD/MM/YYYY)
 * Modification Date:04/04/2019 (DD/MM/YYYY)
 * Version:1.0
 * Description:It represents DAO  Component Interface 
 * 			   Implementor Class of Persistent Layer 
 * Copyright:Fujitsu Consulting India Pvt.Ltd.All rights reserved.
 */

@Repository
@Transactional
public class HotelDAOImpl implements HotelDAO {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(Hotel.class);

	}

	@Override
	public Hotel getHotelById(int hotelId) {
		// TODO Auto-generated method stub
		 return hibernateTemplate.get(Hotel.class,hotelId);
	}

	@Override
	public void insert(Hotel hotel) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(hotel);

	}

	@Override
	public void update(Hotel hotel) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(hotel);

	}

	@Override
	public void delete(Hotel hotel) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(hotel);

	}

	

	
	
}
