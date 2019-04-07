package com.fujitsu.orm.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

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
		
		//database operation logic

		Hotel hotel=new Hotel();
		session.save(hotel);
		
		Room room=new Room();
		session.save(room);
		
		//commit transaction 
		tx.commit();
		
		//close session - close database connection
		session.close();
		
	}

}
