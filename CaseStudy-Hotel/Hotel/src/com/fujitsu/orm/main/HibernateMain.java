package com.fujitsu.orm.main;

import java.io.File;
import java.io.FileInputStream;
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
		
		
		Room r1=new Room(101, "Delux", "yes", 5000.00f);
		
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
		
		File image =new File("singlebedroom.jpg");
		FileInputStream fin=new FileInputStream(image);
		Blob hotelPhoto =BlobProxy.generateProxy(fin, image.length()); 
		hotel.setHotelPhoto(hotelPhoto);
		
		hotel.setRooms(rooms);

		session.save(r1);
		session.save(hotel);
		
		/*Room room=new Room();
		
		session.save(room);*/
		
		//commit transaction 
		tx.commit();
		
		//close session - close database connection
		session.close();
		
	}

}
