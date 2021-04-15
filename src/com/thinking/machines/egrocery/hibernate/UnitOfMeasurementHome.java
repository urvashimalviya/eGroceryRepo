package com.thinking.machines.egrocery.hibernate;
// Generated 16 Jan, 2018 9:36:23 PM by Hibernate Tools 4.3.1.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class UnitOfMeasurement.
 * @see com.thinking.machines.egrocery.hibernate.UnitOfMeasurement
 * @author Hibernate Tools
 */
public class UnitOfMeasurementHome {

	private static final Log log = LogFactory.getLog(UnitOfMeasurementHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(UnitOfMeasurement transientInstance) {
		log.debug("persisting UnitOfMeasurement instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(UnitOfMeasurement instance) {
		log.debug("attaching dirty UnitOfMeasurement instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(UnitOfMeasurement instance) {
		log.debug("attaching clean UnitOfMeasurement instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(UnitOfMeasurement persistentInstance) {
		log.debug("deleting UnitOfMeasurement instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public UnitOfMeasurement merge(UnitOfMeasurement detachedInstance) {
		log.debug("merging UnitOfMeasurement instance");
		try {
			UnitOfMeasurement result = (UnitOfMeasurement) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UnitOfMeasurement findById(java.lang.Integer id) {
		log.debug("getting UnitOfMeasurement instance with id: " + id);
		try {
			UnitOfMeasurement instance = (UnitOfMeasurement) sessionFactory.getCurrentSession()
					.get("com.thinking.machines.egrocery.hibernate.UnitOfMeasurement", id);
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

	public List findByExample(UnitOfMeasurement instance) {
		log.debug("finding UnitOfMeasurement instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.thinking.machines.egrocery.hibernate.UnitOfMeasurement")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
