package com.fujitsu.rooms;

import java.util.List;

/*
 * Author:Satyam Tiwari
 * Creation Date:03/04/2019 (DD/MM/YYYY)
 * Modification Date:04/04/2019 (DD/MM/YYYY)
 * Version:1.0
 * Description:It represents DAO Interface 
 * It Contains CRUD operation methods for Room
 * Copyright:Fujitsu Consulting India Pvt.Ltd.All rights reserved.
 */

public interface RoomDAO {

List<Room> getAllRooms();
	
	Room getRoomsById(int roomId);
	
	Room getRoomsByAvailabilty(String availabilty);
	Room getRoomsByHotel(int hotelId);
	Room getRoomsByPriceRange(float minPrice,float maxPrice);
	
	void insert(Room room);
	void update(Room room);
	void delete(Room room);
}
