package com.fujitsu.rooms;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ManyToOne;

public class Room {

	@Column(length=10,nullable=false,unique=true)
	private String roomId;
	
	@Column(length=10,nullable=false,unique=true)
	private String roomType;
	
	@Column(length=3,nullable=false,unique=true)
	private int availableRoom;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Hotel hotel;
	
	public Room() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Room(String roomId, String roomType, int availableRoom, Hotel hotel) {
		super();
		this.roomId = roomId;
		this.roomType = roomType;
		this.availableRoom = availableRoom;
		this.hotel = hotel;
	}


	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public int getAvailableRoom() {
		return availableRoom;
	}

	public void setAvailableRoom(int availableRoom) {
		this.availableRoom = availableRoom;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", roomType=" + roomType + ", availableRoom=" + availableRoom + "]";
	}	
	
	
}
