package com.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bean.registration;

public class DaoImpl implements DaoInf{

	SessionFactory sessionFactory;

	



	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}



	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}



	Session ses=null;
	Transaction tx=null;
	
	

	public String create(registration reg) {
		// TODO Auto-generated method stub
		ses=sessionFactory.openSession();
		tx=ses.beginTransaction();
		ses.save(reg);
		tx.commit();
		ses.close();
		return "DatabaseCreated";
	}
	
	
	public String delete(registration reg) {
		// TODO Auto-generated method stub
		ses=sessionFactory.openSession();
		tx=ses.beginTransaction();
Query q=ses.createQuery("delete from registration where email=:email");
q.setParameter("email", reg.getEmail());
q.executeUpdate();
		tx.commit();
		ses.close();
		return "DatabaseCreated";
	}



	@Override
	public String update(registration reg) {
		ses=sessionFactory.openSession();
		tx=ses.beginTransaction();
Query q=ses.createQuery("update registration set username=:username,name=:name,password=:password,phone=:phone where email=:email");
q.setParameter("name", reg.getName());
q.setParameter("password", reg.getPassword());
q.setParameter("email", reg.getEmail());
q.setParameter("username", reg.getUsername());
q.setParameter("phone", reg.getPhone());
q.executeUpdate();
	tx.commit();
	ses.close();
		return "DatabaseCreated";
	}

}
