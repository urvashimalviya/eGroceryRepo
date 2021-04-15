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
 * Home object for domain model class OperatorPurchaseOrderMapping.
 * @see com.thinking.machines.egrocery.hibernate.OperatorPurchaseOrderMapping
 * @author Hibernate Tools
 */
public class OperatorPurchaseOrderMappingHome {

	private static final Log log = LogFactory.getLog(OperatorPurchaseOrderMappingHome.class);

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

	public void persist(OperatorPurchaseOrderMapping transientInstance) {
		log.debug("persisting OperatorPurchaseOrderMapping instance");
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

	public void attachDirty(OperatorPurchaseOrderMapping instance) {
		log.debug("attaching dirty OperatorPurchaseOrderMapping instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(OperatorPurchaseOrderMapping instance) {
		log.debug("attaching clean OperatorPurchaseOrderMapping instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(OperatorPurchaseOrderMapping persistentInstance) {
		log.debug("deleting OperatorPurchaseOrderMapping instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public OperatorPurchaseOrderMapping merge(OperatorPurchaseOrderMapping detachedInstance) {
		log.debug("merging OperatorPurchaseOrderMapping instance");
		try {
			OperatorPurchaseOrderMapping result = (OperatorPurchaseOrderMapping) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public OperatorPurchaseOrderMapping findById(java.lang.Long id) {
		log.debug("getting OperatorPurchaseOrderMapping instance with id: " + id);
		try {
			OperatorPurchaseOrderMapping instance = (OperatorPurchaseOrderMapping) sessionFactory.getCurrentSession()
					.get("com.thinking.machines.egrocery.hibernate.OperatorPurchaseOrderMapping", id);
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

	public List findByExample(OperatorPurchaseOrderMapping instance) {
		log.debug("finding OperatorPurchaseOrderMapping instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.thinking.machines.egrocery.hibernate.OperatorPurchaseOrderMapping")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
