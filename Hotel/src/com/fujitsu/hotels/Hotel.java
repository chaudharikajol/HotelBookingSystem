package com.fujitsu.hotels;

import java.sql.Blob;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fujitsu.rooms.Room;

@Entity
@Table(name="HOTELS")
public class Hotel {


		@Id
		@GeneratedValue
		@Column(length=10,name="HOTEL_ID")
		private  int hotelId;
		
		@Column(length=20,nullable=false)
		private String hotelName;
		
		@Column(length=20,unique=true)
		private String website;
		
		@Column(length=1)
		private int rating;
		
		@Column(length=50)
		private String review;
		
		@Column(length=10,nullable=false,unique=true)
		private long phoneNo;
		
		@Column(length=30,nullable=false,unique=true)
		private String emailId;
		
		@Column(length=100,nullable=false)
		private String address;
		
		@Column(length=4,nullable=false)
		private int countrycode;
		
		@Column(length=20,nullable=false)
		private String city;
		
		@Column(length=20,nullable=false)
		private String state;
		
		@Column(length=20,nullable=false)
		private String country;
		
		@Column(length=10,nullable=false)
		private int zip;
		
		private Blob hotelPhoto;
		
		@Column(length=3,nullable=false)
		private int totalNoOfRooms;
		
		@Column(length=3)
		private int availableRooms;
		
		@OneToMany(mappedBy="hotel")
		private List<Room> rooms;

		
		public int getHotelId() {
			return hotelId;
		}

		public void setHotelId(int hotelId) {
			this.hotelId = hotelId;
		}

		public String getHotelName() {
			return hotelName;
		}

		public void setHotelName(String hotelName) {
			this.hotelName = hotelName;
		}

		public String getWebsite() {
			return website;
		}

		public void setWebsite(String website) {
			this.website = website;
		}

		public int getRating() {
			return rating;
		}

		public void setRating(int rating) {
			this.rating = rating;
		}

		public String getReview() {
			return review;
		}

		public void setReview(String review) {
			this.review = review;
		}

		public long getPhoneNo() {
			return phoneNo;
		}

		public void setPhoneNo(long phoneNo) {
			this.phoneNo = phoneNo;
		}

		public String getEmailId() {
			return emailId;
		}

		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public int getCountrycode() {
			return countrycode;
		}

		public void setCountrycode(int countrycode) {
			this.countrycode = countrycode;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public int getZip() {
			return zip;
		}

		public void setZip(int zip) {
			this.zip = zip;
		}

		public Blob getHotelPhoto() {
			return hotelPhoto;
		}

		public void setHotelPhoto(Blob hotelPhoto) {
			this.hotelPhoto = hotelPhoto;
		}

		public List<Room> getRooms() {
			return rooms;
		}

		public void setRooms(List<Room> rooms) {
			this.rooms = rooms;
		}

		public int getTotalNoOfRooms() {
			return totalNoOfRooms;
		}

		public void setTotalNoOfRooms(int totalNoOfRooms) {
			this.totalNoOfRooms = totalNoOfRooms;
		}

		public int getAvailableRooms() {
			return availableRooms;
		}

		public void setAvailableRooms(int availableRooms) {
			this.availableRooms = availableRooms;
		}
		
		
}
