package com.fujitsu.rooms;

import java.sql.Blob;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fujitsu.hotels.Hotel;

@Entity
@Table(name="ROOMS")
public class Room {
	
	@Id
	@GeneratedValue
	@Column(length=10,name="ROOM_ID")
	private int roomId;
	
	@Column(length=10,nullable=false,unique=true)
	private String roomType;
	
	@Column(length=3,nullable=false,unique=true)
	private String availability;
	
	private float roomPrice;
	
	private Blob roomPhoto;

	@ManyToOne(cascade=CascadeType.ALL)
	private Hotel hotel;
	
	public Room() {
		// TODO Auto-generated constructor stub
	}


	public Room(int roomId, String roomType, String availability, float roomprice, Blob roomPhoto, Hotel hotel) {
		super();
		this.roomId = roomId;
		this.roomType = roomType;
		this.availability = availability;
		this.roomPrice = roomprice;
		this.roomPhoto = roomPhoto;
		this.hotel = hotel;
	}


	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	
	
	public String getAvailability() {
		return availability;
	}


	public void setAvailability(String availability) {
		this.availability = availability;
	}


	public float getRoomprice() {
		return roomPrice;
	}

	public void setRoomprice(float roomprice) {
		this.roomPrice = roomprice;
	}

	public Blob getRoomPhoto() {
		return roomPhoto;
	}

	public void setRoomPhoto(Blob roomPhoto) {
		this.roomPhoto = roomPhoto;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	
	
	
}
