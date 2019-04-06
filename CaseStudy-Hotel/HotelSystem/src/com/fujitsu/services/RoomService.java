package com.fujitsu.services;

import java.util.List;

import com.fujitsu.exceptions.ServiceException;
import com.fujitsu.rooms.Room;

/*
 * Author:Satyam Tiwari
 * Creation Date:04/04/2019 (DD/MM/YYYY)
 * Modification Date:04/04/2019 (DD/MM/YYYY)
 * Version:1.0
 * Copyright:Fujitsu Consulting India Pvt.Ltd.All rights reserved.
 * Description:Service Component Interface of Bussiness Layer 
 * 
 */

public interface RoomService {
	
	 List<Room> findAllRooms()throws ServiceException;
	 Room findById(int roomId)throws ServiceException;
	 Room getRoomsByAvailabilty(String availabilty)throws ServiceException;
	Room getRoomsByHotel(int hotelId)throws ServiceException;
	 void add(Room room)throws ServiceException;
	 void update(Room room)throws ServiceException;
	 void remove(Room room)throws ServiceException;
	
	List<Room> sortRoomsById()throws ServiceException;
	List<Room> sortRoomsBytype()throws ServiceException;
	List<Room> sortRoomsByPriceRange(float minPrice,float maxPrice)throws ServiceException;


}
