package org.dao.generic;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;
import org.modelo.ciudad.Ciudad;
import org.modelo.cuenta.Cuenta;
import org.modelo.hta.Hta;

public class DaoGeneric {
	
	public List<Ciudad> listCiudades()
	{
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.getCurrentSession();
		List<Ciudad> list = null;
		try {
			session.beginTransaction();
			list = (List<Ciudad>) session.createQuery("from Ciudad").list();
		} catch (HibernateException e) 
		{
			System.out.println("Exception: "+e.getMessage());
			session.getTransaction().rollback();
		}
		return list;
	}
	
	public List<Cuenta> listCuenta()
	{
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.getCurrentSession();
		List<Cuenta> list = null;
		try {
			session.beginTransaction();
			list = (List<Cuenta>) session.createQuery("from Cuenta").list();
		} catch (HibernateException e) 
		{
			System.out.println("Exception: "+e.getMessage());
			session.getTransaction().rollback();
		}
		return list;
	}
	
	public void addHta(Hta hta){
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();
			session.save(hta);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			System.out.println("Exception add: "+ e.getMessage());
		}
		
	}
	 
}
