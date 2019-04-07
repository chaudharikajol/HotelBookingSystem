package com.fujitsu.rooms;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

/*
 * Author:Satyam Tiwari
 * Creation Date:04/04/2019 (DD/MM/YYYY)
 * Modification Date:04/04/2019 (DD/MM/YYYY)
 * Version:1.0
 * Description:It represents DAO  Component Interface 
 * 			   Implementor Class of Persistent Layer 
 * Copyright:Fujitsu Consulting India Pvt.Ltd.All rights reserved.
 */

@Repository
@Transactional
public class RoomDAOImpl implements RoomDAO{
	@Autowired
	private HibernateTemplate hibernateTemplate;	
	
	@Override
	public List<Room> getAllRooms() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(Room.class);
	}

	@Override
	public Room getRoomsById(int roomId) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Room.class, roomId);
	}

	@Override
	public Room getRoomsByAvailabilty(String availabilty) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Room.class, availabilty);
	}

	@Override
	public Room getRoomsByHotel(int hotelId) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Room.class, hotelId);
	}

	@Override
	public void insert(Room room) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(room);
	}

	@Override
	public void update(Room room) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(room);

	}

	@Override
	public void delete(Room room) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(room);

	}

	@Override
	public Room getRoomsByPriceRange(float minPrice, float maxPrice) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
