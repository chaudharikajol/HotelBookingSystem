package com.fujitsu.orm.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.jdbc.BlobProxy;

import com.fujitsu.hotels.Hotel;
import com.fujitsu.rooms.Room;

public class HibernateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create configuration component
		Configuration cfg=new Configuration();
		
		//read hibernate properties from hibernate.cfg.xml and store in SessionFactory
		Configuration c=cfg.configure();
		
		//Obtain SessionFactory through Configuration
		SessionFactory factory=c.buildSessionFactory();
		
		//Get Session from SessionFactory 
		//Represents Database Connection
		
		Session session=factory.openSession();
		
		//get Transacation through Session
		Transaction tx=session.beginTransaction();
		
		
		try {
			Room r1=new Room();
			r1.setRoomId(101);
			r1.setRoomType("Deluxe");
			r1.setAvailability("Yes");
			r1.setRoomprice(4000.00f);

			File image =new File("room1.jpg");
			FileInputStream finr=new FileInputStream(image);
			Blob roomPhoto =BlobProxy.generateProxy(finr, image.length()); 
			r1.setRoomPhoto(roomPhoto);
			
			
			//database operation logic

			List<Room> rooms=new ArrayList<>();
			rooms.add(r1);
			
			Hotel hotel=new Hotel();
			hotel.setHotelId(1001);
			hotel.setHotelName("Hotel Vivanta");
			hotel.setWebsite("http://www.tajhotels.com/");
			hotel.setRating(4);
			hotel.setReview("Vivanta is a place that spoils you completely");
			hotel.setPhoneNo(1-800-111-825l);
			hotel.setEmailId("reservations@tajhotels.com");
			hotel.setAddress("Vivanta, Off, Dayanand Bandodkar Marg, Santa Inez, Panaji, Goa 403001");
			hotel.setCountrycode(+91);
			hotel.setCity("Goa");
			hotel.setState("Maharashtra");
			hotel.setCountry("India");
			hotel.setZip(403001);
			
			//HotelPhoto
			File image1 =new File("hotelvivanta.jpeg");
			FileInputStream finh=new FileInputStream(image1);
			Blob hotelPhoto =BlobProxy.generateProxy(finh, image1.length()); 
			hotel.setHotelPhoto(hotelPhoto);
			
			//Rooms
			hotel.setRooms(rooms);

			r1.setHotel(hotel);
			
			session.save(r1);
			
			session.save(hotel);
			
			
			//commit transaction 
			tx.commit();
			
			//close session - close database connection
			session.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
