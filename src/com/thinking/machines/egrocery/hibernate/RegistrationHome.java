package com.thinking.machines.egrocery.hibernate;
// Generated 16 Jan, 2018 9:36:23 PM by Hibernate Tools 4.3.1.Final

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Registration.
 * @see com.thinking.machines.egrocery.hibernate.Registration
 * @author Hibernate Tools
 */
public class RegistrationHome {

	private static final Log log = LogFactory.getLog(RegistrationHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			Configuration configuration=new Configuration(); 
			configuration.configure("hibernate.cfg.xml"); 
			return configuration.buildSessionFactory(); 
			} catch (Exception e) 
		{ 
				log.error("Counld not create session factory", e); 
				throw new IllegalStateException("Could not create session factory "+e); }
			}

	public void persist(Registration transientInstance) {
		log.debug("persisting Registration instance");
		try 
		{ 
	 Session session=sessionFactory.openSession(); 
		Transaction t=session.beginTransaction(); 
		session.persist(transientInstance); 
		t.commit(); 
		session.close(); 
		log.debug("persist successful"); 
		} catch (RuntimeException re) 
		{ 
			log.error("persist failed", re); 
			throw re; 
			}
	}

	public void attachDirty(Registration instance) {
		log.debug("attaching dirty Registration instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Registration instance) {
		log.debug("attaching clean Registration instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Registration persistentInstance) {
		log.debug("deleting Registration instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Registration merge(Registration detachedInstance) {
		log.debug("merging Registration instance");
		try {
			Registration result = (Registration) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Registration findById(int id) {
		log.debug("getting Registration instance with id: " + id);
		try {
			Registration instance = (Registration) sessionFactory.getCurrentSession()
					.get("com.thinking.machines.egrocery.hibernate.Registration", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Registration instance) {
		log.debug("finding Registration instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.thinking.machines.egrocery.hibernate.Registration")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
